package main

import (
	"github.com/UpCloudLtd/pulumi-upcloud/sdk/go/upcloud"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		storage, err := upcloud.NewStorage(ctx, "example-storage", &upcloud.StorageArgs{
			Title: pulumi.String("example-storage"),
			Size:  pulumi.Int(10),
			Tier:  pulumi.String("standard"),
			Zone:  pulumi.String("es-mad1"),
		})
		if err != nil {
			return err
		}

		ctx.Export("storageName", storage.ID())
		return nil
	})
}
