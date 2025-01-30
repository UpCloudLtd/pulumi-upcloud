// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ServerStorageDeviceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The device address the storage will be attached to (`scsi`|`virtio`|`ide`). Leave `address_position` field empty to auto-select next available address from that bus.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The device position in the given bus (defined via field `address`). Valid values for address `virtio` are `0-15` (`0`, for example). Valid values for `scsi` or `ide` are `0-1:0-1` (`0:0`, for example). Leave empty to auto-select next available address in the given bus.
        /// </summary>
        [Input("addressPosition")]
        public Input<string>? AddressPosition { get; set; }

        /// <summary>
        /// The UUID of the storage to attach to the server.
        /// </summary>
        [Input("storage")]
        public Input<string>? Storage { get; set; }

        /// <summary>
        /// The device type the storage will be attached as
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ServerStorageDeviceGetArgs()
        {
        }
        public static new ServerStorageDeviceGetArgs Empty => new ServerStorageDeviceGetArgs();
    }
}
