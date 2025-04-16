# UpCloud Resource Provider

The UpCloud Resource Provider lets you manage [UpCloud](https://upcloud.com/) resources.

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @upcloud/pulumi-upcloud
```

or `yarn`:

```bash
yarn add @upcloud/pulumi-upcloud
```

### Python

To use from Python, install using `pip`:

```bash
pip install pulumi-upcloud
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/UpCloudLtd/pulumi-upcloud/sdk/go/...
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package UpCloud.Pulumi.UpCloud
```

## Configuration

The following configuration points are available for the `upcloud` provider:

- `UPCLOUD_USERNAME` (environment variable) - the username of the account to use
- `UPCLOUD_PASSWORD` (environment variable) - the password of the account to use
- `UPCLOUD_TOKEN` (environment variable) - an API token to use for authentication (instead of username and password)

## Reference

For detailed reference documentation, please visit [the Pulumi registry](https://www.pulumi.com/registry/packages/upcloud/).

## Templates

We have created templates in your language of choice to bootstrap your projects. 

They will set up the project and set up:

    - An UpCloud Managed Object Storage instance.
    - A Bucket inside the object storage.

### .NET

#### 🛠 Prerequisites
- Install [Pulumi CLI](https://www.pulumi.com/docs/install/)
- Install [.NET 8](https://dotnet.microsoft.com/en-us/download/dotnet/8.0)
- Set up UpCloud API credentials as explained in the configuration section

#### Set up your project using the template

From the new project directory:

```sh
pulumi new https://github.com/UpCloudLtd/pulumi-upcloud/tree/main/examples/templates/upcloud-csharp
```

### Typescript

#### 🛠 Prerequisites
- Install [Pulumi CLI](https://www.pulumi.com/docs/install/)
- Install [Node.js](https://nodejs.org/)
- Set up UpCloud API credentials as explained in the configuration section

#### Set up your project using the template

From the new project directory:

```sh
pulumi new https://github.com/UpCloudLtd/pulumi-upcloud/tree/main/examples/templates/upcloud-typescript
```

### Go

#### 🛠 Prerequisites
- Install [Pulumi CLI](https://www.pulumi.com/docs/install/)
- Install [Go](https://golang.org/dl/)
- Set up UpCloud API credentials as explained in the configuration section

#### Set up your project using the template

From the new project directory:

```sh
pulumi new https://github.com/UpCloudLtd/pulumi-upcloud/tree/main/examples/templates/upcloud-go
```

### Python

#### 🛠 Prerequisites
- Install [Pulumi CLI](https://www.pulumi.com/docs/install/)
- Install [Python 3](https://www.python.org/downloads/)
- Set up UpCloud API credentials as explained in the configuration section

#### Set up your project using the template

From the new project directory:

```sh
pulumi new https://github.com/UpCloudLtd/pulumi-upcloud/tree/main/examples/templates/upcloud-python
```
