TOOLS_DIR:=$(CURDIR)/.ci/bin

install-tools:
	cd .ci/tools && GOBIN=$(TOOLS_DIR) go install github.com/pulumi-labs/ci-mgmt/provider-ci

ci-mgmt: install-tools
	$(TOOLS_DIR)/provider-ci generate --name UpCloudLtd/pulumi-upcloud --template external-bridged-provider --config ./.ci-mgmt.yaml --out ./
