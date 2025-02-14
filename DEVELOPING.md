# Developing the Provider

## Find correct configuration values

Current configuration was created based on [pulumi-azuread](https://github.com/pulumi/pulumi-azuread) and [pulumi-cloudflare](https://github.com/pulumi/pulumi-cloudflare) providers. Look examples from these or other working providers instead of the boilerplate or example repositories.

## Generate CI workflows

Run:

```sh
go run github.com/pulumi/ci-mgmt/provider-ci@master generate \
  --name UpCloudLtd/pulumi-upcloud \
  --out . \
  --template bridged-provider \
  --config .ci-mgmt.yaml
```
