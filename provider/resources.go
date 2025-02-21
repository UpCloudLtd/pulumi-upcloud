// Copyright 2016-2024, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package upcloud

import (
	"context"
	"fmt"
	"path"

	// Allow embedding bridge-metadata.json in the provider.
	_ "embed"

	"github.com/UpCloudLtd/terraform-provider-upcloud/upcloud"
	sdkv2_diag "github.com/hashicorp/terraform-plugin-sdk/v2/diag"
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"

	"github.com/UpCloudLtd/pulumi-upcloud/provider/pkg/version"
)

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	mainPkg = "upcloud"
	// modules:
	mainMod = "index" // the xyz module
)

//go:embed cmd/pulumi-resource-upcloud/bridge-metadata.json
var metadata []byte

func defaultUserAgent() string {
	return fmt.Sprintf("pulumi-upcloud/%s", version.Version)
}

// Provider returns additional overlaid schema and metadata associated with the provider.
func Provider() tfbridge.ProviderInfo {
	sdkv2 := upcloud.Provider()
	sdkv2.ConfigureContextFunc = func(ctx context.Context, d *schema.ResourceData) (interface{}, sdkv2_diag.Diagnostics) {
		return upcloud.ProviderConfigure(ctx, d, defaultUserAgent())
	}

	p := pfbridge.MuxShimWithPF(context.Background(),
		shimv2.NewProvider(sdkv2),
		upcloud.NewWithUserAgent(defaultUserAgent()),
	)

	prov := tfbridge.ProviderInfo{
		//nolint:lll
		P: p,

		Name:        "upcloud",
		Version:     version.Version,
		DisplayName: "UpCloud",
		Publisher:   "UpCloudLtd",
		LogoURL:     "https://raw.githubusercontent.com/UpCloudLtd/pulumi-upcloud/refs/heads/main/provider/upcloud.png",
		// PluginDownloadURL is an optional URL used to download the Provider
		// for use in Pulumi programs
		// e.g https://github.com/org/pulumi-provider-name/releases/download/v${VERSION}/
		// This does not work because of a bug in pulumi-java-gen:
		// PluginDownloadURL: "https://github.com/UpCloudLtd/pulumi-upcloud/releases/download/v${VERSION}/",
		PluginDownloadURL: "github://api.github.com/UpCloudLtd/pulumi-upcloud",
		Description:       "A Pulumi package for creating and managing UpCloud resources.",
		Keywords:          []string{"pulumi", "upcloud", "category/cloud"},
		License:           "Apache-2.0",
		Homepage:          "https://upcloud.com",
		Repository:        "https://github.com/UpCloudLtd/pulumi-upcloud",
		GitHubOrg:         "UpCloudLtd",
		MetadataInfo:      tfbridge.NewProviderMetadata(metadata),
		Config:            map[string]*tfbridge.SchemaInfo{
			// Add any required configuration here, or remove the example below if
			// no additional points are required.
			// "region": {
			// 	Type: tfbridge.MakeType("region", "Region"),
			// 	Default: &tfbridge.DefaultInfo{
			// 		EnvVars: []string{"AWS_REGION", "AWS_DEFAULT_REGION"},
			// 	},
			// },
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			PackageName:          "@upcloud/pulumi-upcloud",
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			PyProject: struct {
				Enabled bool
			}{true},
			RespectSchemaVersion: true,
		},
		Golang: &tfbridge.GolangInfo{
			GenerateResourceContainerTypes: true,
			ImportBasePath: path.Join(
				"github.com/UpCloudLtd/pulumi-upcloud/sdk/",
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			RespectSchemaVersion: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			Namespaces: map[string]string{
				"upcloud": "UpCloud",
			},
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			RespectSchemaVersion: true,
			RootNamespace:        "UpCloud.Pulumi",
		},

		Resources: map[string]*tfbridge.ResourceInfo{
			"upcloud_firewall_rules": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ServerFirewallRules")},
		},
	}

	// MustComputeTokens maps all resources and datasources from the upstream provider into Pulumi.
	//
	// tokens.SingleModule puts every upstream item into your provider's main module.
	//
	// You shouldn't need to override anything, but if you do, use the [tfbridge.ProviderInfo.Resources]
	// and [tfbridge.ProviderInfo.DataSources].
	prov.MustComputeTokens(tokens.SingleModule("upcloud_", mainMod,
		tokens.MakeStandard(mainPkg)))

	prov.MustApplyAutoAliases()
	prov.SetAutonaming(255, "-")

	return prov
}
