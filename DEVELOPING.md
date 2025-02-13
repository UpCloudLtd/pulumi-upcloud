# Developing the Provider

## Generate CI workflows

Run:

```sh
go run github.com/pulumi/ci-mgmt/provider-ci@master generate \
  --name UpCloudLtd/pulumi-upcloud \
  --out . \
  --template bridged-provider \
  --config .ci-mgmt.yaml
```
