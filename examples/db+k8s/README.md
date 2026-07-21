# Database and Kubernetes cluster

This example creates a Postgres database and a Kubernetes cluster using the UpCloud provider as well as deploys an example application ([cicd-tutorials/feedback](https://github.com/cicd-tutorials/feedback.git)) into the Kubernetes cluster so that it uses the created database as data storage.

## Usage

1. Make your token or credentials available in the environment [as described here](https://upcloud.com/docs/guides/get-started-terraform/#setting-up-upcloud-user-credentials).
2. Run `pulumi up` twice. It will fail the first time because we can't depend on knowing when the cluster has become available. The second time, the app will be deployed. (In a production scenario, you will likely want to split infrastructure and apps into two different stacks anyway.)
3. If you want to access the admin panel of the app, run `pulumi up` again to update the `initial_admin_password` output value.
