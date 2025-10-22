# Developing the Provider

## Find correct configuration values

Current configuration was created based on [pulumi-azuread](https://github.com/pulumi/pulumi-azuread) and [pulumi-cloudflare](https://github.com/pulumi/pulumi-cloudflare) providers. Look examples from these or other working providers instead of the boilerplate or example repositories.

## Common fixes to issues with workflows

### `make ci-mgmt`

Re-generate the workflows and other build configuration (e.g., Makefile):

```sh
make ci-mgmt
```

### Upgrade bridge

Upgrade TF bridge version by triggering Upgrade bridge workflow from Actions tab in GitHub. Default values should be fine in the trigger form.
