#!/bin/sh -xe
# Script to upgrade the provider version "manually". Use `deployment-templates/upgrade-provider.yml` instead when that does not crash because of go 1.16 issues (See sed command below).

cd provider;
  go get -u github.com/UpCloudLtd/terraform-provider-upcloud
  go get -u github.com/pulumi/pulumi-terraform-bridge/pf
  go get -u github.com/pulumi/pulumi-terraform-bridge/v3

  go mod tidy
cd ..;

make build;

cd sdk/;
  # `go mod tidy` fails when go version is set to 1.17
  sed -i "s/go 1.17/go 1.18/" go.mod
  go mod tidy;
cd ..;

git add sdk/ provider/
# Creating new branch, commit, and push
