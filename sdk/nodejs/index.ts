// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { FloatingIpAddressArgs, FloatingIpAddressState } from "./floatingIpAddress";
export type FloatingIpAddress = import("./floatingIpAddress").FloatingIpAddress;
export const FloatingIpAddress: typeof import("./floatingIpAddress").FloatingIpAddress = null as any;
utilities.lazyLoad(exports, ["FloatingIpAddress"], () => require("./floatingIpAddress"));

export { GatewayArgs, GatewayState } from "./gateway";
export type Gateway = import("./gateway").Gateway;
export const Gateway: typeof import("./gateway").Gateway = null as any;
utilities.lazyLoad(exports, ["Gateway"], () => require("./gateway"));

export { GatewayConnectionArgs, GatewayConnectionState } from "./gatewayConnection";
export type GatewayConnection = import("./gatewayConnection").GatewayConnection;
export const GatewayConnection: typeof import("./gatewayConnection").GatewayConnection = null as any;
utilities.lazyLoad(exports, ["GatewayConnection"], () => require("./gatewayConnection"));

export { GatewayConnectionTunnelArgs, GatewayConnectionTunnelState } from "./gatewayConnectionTunnel";
export type GatewayConnectionTunnel = import("./gatewayConnectionTunnel").GatewayConnectionTunnel;
export const GatewayConnectionTunnel: typeof import("./gatewayConnectionTunnel").GatewayConnectionTunnel = null as any;
utilities.lazyLoad(exports, ["GatewayConnectionTunnel"], () => require("./gatewayConnectionTunnel"));

export { GetHostsArgs, GetHostsResult, GetHostsOutputArgs } from "./getHosts";
export const getHosts: typeof import("./getHosts").getHosts = null as any;
export const getHostsOutput: typeof import("./getHosts").getHostsOutput = null as any;
utilities.lazyLoad(exports, ["getHosts","getHostsOutput"], () => require("./getHosts"));

export { GetIpAddressesArgs, GetIpAddressesResult, GetIpAddressesOutputArgs } from "./getIpAddresses";
export const getIpAddresses: typeof import("./getIpAddresses").getIpAddresses = null as any;
export const getIpAddressesOutput: typeof import("./getIpAddresses").getIpAddressesOutput = null as any;
utilities.lazyLoad(exports, ["getIpAddresses","getIpAddressesOutput"], () => require("./getIpAddresses"));

export { GetKubernetesClusterArgs, GetKubernetesClusterResult, GetKubernetesClusterOutputArgs } from "./getKubernetesCluster";
export const getKubernetesCluster: typeof import("./getKubernetesCluster").getKubernetesCluster = null as any;
export const getKubernetesClusterOutput: typeof import("./getKubernetesCluster").getKubernetesClusterOutput = null as any;
utilities.lazyLoad(exports, ["getKubernetesCluster","getKubernetesClusterOutput"], () => require("./getKubernetesCluster"));

export { GetLoadBalancerDnsChallengeDomainResult } from "./getLoadBalancerDnsChallengeDomain";
export const getLoadBalancerDnsChallengeDomain: typeof import("./getLoadBalancerDnsChallengeDomain").getLoadBalancerDnsChallengeDomain = null as any;
export const getLoadBalancerDnsChallengeDomainOutput: typeof import("./getLoadBalancerDnsChallengeDomain").getLoadBalancerDnsChallengeDomainOutput = null as any;
utilities.lazyLoad(exports, ["getLoadBalancerDnsChallengeDomain","getLoadBalancerDnsChallengeDomainOutput"], () => require("./getLoadBalancerDnsChallengeDomain"));

export { GetManagedDatabaseMysqlSessionsArgs, GetManagedDatabaseMysqlSessionsResult, GetManagedDatabaseMysqlSessionsOutputArgs } from "./getManagedDatabaseMysqlSessions";
export const getManagedDatabaseMysqlSessions: typeof import("./getManagedDatabaseMysqlSessions").getManagedDatabaseMysqlSessions = null as any;
export const getManagedDatabaseMysqlSessionsOutput: typeof import("./getManagedDatabaseMysqlSessions").getManagedDatabaseMysqlSessionsOutput = null as any;
utilities.lazyLoad(exports, ["getManagedDatabaseMysqlSessions","getManagedDatabaseMysqlSessionsOutput"], () => require("./getManagedDatabaseMysqlSessions"));

export { GetManagedDatabaseOpensearchIndicesArgs, GetManagedDatabaseOpensearchIndicesResult, GetManagedDatabaseOpensearchIndicesOutputArgs } from "./getManagedDatabaseOpensearchIndices";
export const getManagedDatabaseOpensearchIndices: typeof import("./getManagedDatabaseOpensearchIndices").getManagedDatabaseOpensearchIndices = null as any;
export const getManagedDatabaseOpensearchIndicesOutput: typeof import("./getManagedDatabaseOpensearchIndices").getManagedDatabaseOpensearchIndicesOutput = null as any;
utilities.lazyLoad(exports, ["getManagedDatabaseOpensearchIndices","getManagedDatabaseOpensearchIndicesOutput"], () => require("./getManagedDatabaseOpensearchIndices"));

export { GetManagedDatabasePostgresqlSessionsArgs, GetManagedDatabasePostgresqlSessionsResult, GetManagedDatabasePostgresqlSessionsOutputArgs } from "./getManagedDatabasePostgresqlSessions";
export const getManagedDatabasePostgresqlSessions: typeof import("./getManagedDatabasePostgresqlSessions").getManagedDatabasePostgresqlSessions = null as any;
export const getManagedDatabasePostgresqlSessionsOutput: typeof import("./getManagedDatabasePostgresqlSessions").getManagedDatabasePostgresqlSessionsOutput = null as any;
utilities.lazyLoad(exports, ["getManagedDatabasePostgresqlSessions","getManagedDatabasePostgresqlSessionsOutput"], () => require("./getManagedDatabasePostgresqlSessions"));

export { GetManagedDatabaseRedisSessionsArgs, GetManagedDatabaseRedisSessionsResult, GetManagedDatabaseRedisSessionsOutputArgs } from "./getManagedDatabaseRedisSessions";
export const getManagedDatabaseRedisSessions: typeof import("./getManagedDatabaseRedisSessions").getManagedDatabaseRedisSessions = null as any;
export const getManagedDatabaseRedisSessionsOutput: typeof import("./getManagedDatabaseRedisSessions").getManagedDatabaseRedisSessionsOutput = null as any;
utilities.lazyLoad(exports, ["getManagedDatabaseRedisSessions","getManagedDatabaseRedisSessionsOutput"], () => require("./getManagedDatabaseRedisSessions"));

export { GetManagedDatabaseValkeySessionsArgs, GetManagedDatabaseValkeySessionsResult, GetManagedDatabaseValkeySessionsOutputArgs } from "./getManagedDatabaseValkeySessions";
export const getManagedDatabaseValkeySessions: typeof import("./getManagedDatabaseValkeySessions").getManagedDatabaseValkeySessions = null as any;
export const getManagedDatabaseValkeySessionsOutput: typeof import("./getManagedDatabaseValkeySessions").getManagedDatabaseValkeySessionsOutput = null as any;
utilities.lazyLoad(exports, ["getManagedDatabaseValkeySessions","getManagedDatabaseValkeySessionsOutput"], () => require("./getManagedDatabaseValkeySessions"));

export { GetManagedObjectStoragePoliciesArgs, GetManagedObjectStoragePoliciesResult, GetManagedObjectStoragePoliciesOutputArgs } from "./getManagedObjectStoragePolicies";
export const getManagedObjectStoragePolicies: typeof import("./getManagedObjectStoragePolicies").getManagedObjectStoragePolicies = null as any;
export const getManagedObjectStoragePoliciesOutput: typeof import("./getManagedObjectStoragePolicies").getManagedObjectStoragePoliciesOutput = null as any;
utilities.lazyLoad(exports, ["getManagedObjectStoragePolicies","getManagedObjectStoragePoliciesOutput"], () => require("./getManagedObjectStoragePolicies"));

export { GetManagedObjectStorageRegionsArgs, GetManagedObjectStorageRegionsResult, GetManagedObjectStorageRegionsOutputArgs } from "./getManagedObjectStorageRegions";
export const getManagedObjectStorageRegions: typeof import("./getManagedObjectStorageRegions").getManagedObjectStorageRegions = null as any;
export const getManagedObjectStorageRegionsOutput: typeof import("./getManagedObjectStorageRegions").getManagedObjectStorageRegionsOutput = null as any;
utilities.lazyLoad(exports, ["getManagedObjectStorageRegions","getManagedObjectStorageRegionsOutput"], () => require("./getManagedObjectStorageRegions"));

export { GetNetworksArgs, GetNetworksResult, GetNetworksOutputArgs } from "./getNetworks";
export const getNetworks: typeof import("./getNetworks").getNetworks = null as any;
export const getNetworksOutput: typeof import("./getNetworks").getNetworksOutput = null as any;
utilities.lazyLoad(exports, ["getNetworks","getNetworksOutput"], () => require("./getNetworks"));

export { GetStorageArgs, GetStorageResult, GetStorageOutputArgs } from "./getStorage";
export const getStorage: typeof import("./getStorage").getStorage = null as any;
export const getStorageOutput: typeof import("./getStorage").getStorageOutput = null as any;
utilities.lazyLoad(exports, ["getStorage","getStorageOutput"], () => require("./getStorage"));

export { GetTagsResult } from "./getTags";
export const getTags: typeof import("./getTags").getTags = null as any;
export const getTagsOutput: typeof import("./getTags").getTagsOutput = null as any;
utilities.lazyLoad(exports, ["getTags","getTagsOutput"], () => require("./getTags"));

export { GetZoneArgs, GetZoneResult, GetZoneOutputArgs } from "./getZone";
export const getZone: typeof import("./getZone").getZone = null as any;
export const getZoneOutput: typeof import("./getZone").getZoneOutput = null as any;
utilities.lazyLoad(exports, ["getZone","getZoneOutput"], () => require("./getZone"));

export { GetZonesArgs, GetZonesResult, GetZonesOutputArgs } from "./getZones";
export const getZones: typeof import("./getZones").getZones = null as any;
export const getZonesOutput: typeof import("./getZones").getZonesOutput = null as any;
utilities.lazyLoad(exports, ["getZones","getZonesOutput"], () => require("./getZones"));

export { KubernetesClusterArgs, KubernetesClusterState } from "./kubernetesCluster";
export type KubernetesCluster = import("./kubernetesCluster").KubernetesCluster;
export const KubernetesCluster: typeof import("./kubernetesCluster").KubernetesCluster = null as any;
utilities.lazyLoad(exports, ["KubernetesCluster"], () => require("./kubernetesCluster"));

export { KubernetesNodeGroupArgs, KubernetesNodeGroupState } from "./kubernetesNodeGroup";
export type KubernetesNodeGroup = import("./kubernetesNodeGroup").KubernetesNodeGroup;
export const KubernetesNodeGroup: typeof import("./kubernetesNodeGroup").KubernetesNodeGroup = null as any;
utilities.lazyLoad(exports, ["KubernetesNodeGroup"], () => require("./kubernetesNodeGroup"));

export { LoadbalancerArgs, LoadbalancerState } from "./loadbalancer";
export type Loadbalancer = import("./loadbalancer").Loadbalancer;
export const Loadbalancer: typeof import("./loadbalancer").Loadbalancer = null as any;
utilities.lazyLoad(exports, ["Loadbalancer"], () => require("./loadbalancer"));

export { LoadbalancerBackendArgs, LoadbalancerBackendState } from "./loadbalancerBackend";
export type LoadbalancerBackend = import("./loadbalancerBackend").LoadbalancerBackend;
export const LoadbalancerBackend: typeof import("./loadbalancerBackend").LoadbalancerBackend = null as any;
utilities.lazyLoad(exports, ["LoadbalancerBackend"], () => require("./loadbalancerBackend"));

export { LoadbalancerBackendTlsConfigArgs, LoadbalancerBackendTlsConfigState } from "./loadbalancerBackendTlsConfig";
export type LoadbalancerBackendTlsConfig = import("./loadbalancerBackendTlsConfig").LoadbalancerBackendTlsConfig;
export const LoadbalancerBackendTlsConfig: typeof import("./loadbalancerBackendTlsConfig").LoadbalancerBackendTlsConfig = null as any;
utilities.lazyLoad(exports, ["LoadbalancerBackendTlsConfig"], () => require("./loadbalancerBackendTlsConfig"));

export { LoadbalancerDynamicBackendMemberArgs, LoadbalancerDynamicBackendMemberState } from "./loadbalancerDynamicBackendMember";
export type LoadbalancerDynamicBackendMember = import("./loadbalancerDynamicBackendMember").LoadbalancerDynamicBackendMember;
export const LoadbalancerDynamicBackendMember: typeof import("./loadbalancerDynamicBackendMember").LoadbalancerDynamicBackendMember = null as any;
utilities.lazyLoad(exports, ["LoadbalancerDynamicBackendMember"], () => require("./loadbalancerDynamicBackendMember"));

export { LoadbalancerDynamicCertificateBundleArgs, LoadbalancerDynamicCertificateBundleState } from "./loadbalancerDynamicCertificateBundle";
export type LoadbalancerDynamicCertificateBundle = import("./loadbalancerDynamicCertificateBundle").LoadbalancerDynamicCertificateBundle;
export const LoadbalancerDynamicCertificateBundle: typeof import("./loadbalancerDynamicCertificateBundle").LoadbalancerDynamicCertificateBundle = null as any;
utilities.lazyLoad(exports, ["LoadbalancerDynamicCertificateBundle"], () => require("./loadbalancerDynamicCertificateBundle"));

export { LoadbalancerFrontendArgs, LoadbalancerFrontendState } from "./loadbalancerFrontend";
export type LoadbalancerFrontend = import("./loadbalancerFrontend").LoadbalancerFrontend;
export const LoadbalancerFrontend: typeof import("./loadbalancerFrontend").LoadbalancerFrontend = null as any;
utilities.lazyLoad(exports, ["LoadbalancerFrontend"], () => require("./loadbalancerFrontend"));

export { LoadbalancerFrontendRuleArgs, LoadbalancerFrontendRuleState } from "./loadbalancerFrontendRule";
export type LoadbalancerFrontendRule = import("./loadbalancerFrontendRule").LoadbalancerFrontendRule;
export const LoadbalancerFrontendRule: typeof import("./loadbalancerFrontendRule").LoadbalancerFrontendRule = null as any;
utilities.lazyLoad(exports, ["LoadbalancerFrontendRule"], () => require("./loadbalancerFrontendRule"));

export { LoadbalancerFrontendTlsConfigArgs, LoadbalancerFrontendTlsConfigState } from "./loadbalancerFrontendTlsConfig";
export type LoadbalancerFrontendTlsConfig = import("./loadbalancerFrontendTlsConfig").LoadbalancerFrontendTlsConfig;
export const LoadbalancerFrontendTlsConfig: typeof import("./loadbalancerFrontendTlsConfig").LoadbalancerFrontendTlsConfig = null as any;
utilities.lazyLoad(exports, ["LoadbalancerFrontendTlsConfig"], () => require("./loadbalancerFrontendTlsConfig"));

export { LoadbalancerManualCertificateBundleArgs, LoadbalancerManualCertificateBundleState } from "./loadbalancerManualCertificateBundle";
export type LoadbalancerManualCertificateBundle = import("./loadbalancerManualCertificateBundle").LoadbalancerManualCertificateBundle;
export const LoadbalancerManualCertificateBundle: typeof import("./loadbalancerManualCertificateBundle").LoadbalancerManualCertificateBundle = null as any;
utilities.lazyLoad(exports, ["LoadbalancerManualCertificateBundle"], () => require("./loadbalancerManualCertificateBundle"));

export { LoadbalancerResolverArgs, LoadbalancerResolverState } from "./loadbalancerResolver";
export type LoadbalancerResolver = import("./loadbalancerResolver").LoadbalancerResolver;
export const LoadbalancerResolver: typeof import("./loadbalancerResolver").LoadbalancerResolver = null as any;
utilities.lazyLoad(exports, ["LoadbalancerResolver"], () => require("./loadbalancerResolver"));

export { LoadbalancerStaticBackendMemberArgs, LoadbalancerStaticBackendMemberState } from "./loadbalancerStaticBackendMember";
export type LoadbalancerStaticBackendMember = import("./loadbalancerStaticBackendMember").LoadbalancerStaticBackendMember;
export const LoadbalancerStaticBackendMember: typeof import("./loadbalancerStaticBackendMember").LoadbalancerStaticBackendMember = null as any;
utilities.lazyLoad(exports, ["LoadbalancerStaticBackendMember"], () => require("./loadbalancerStaticBackendMember"));

export { ManagedDatabaseLogicalDatabaseArgs, ManagedDatabaseLogicalDatabaseState } from "./managedDatabaseLogicalDatabase";
export type ManagedDatabaseLogicalDatabase = import("./managedDatabaseLogicalDatabase").ManagedDatabaseLogicalDatabase;
export const ManagedDatabaseLogicalDatabase: typeof import("./managedDatabaseLogicalDatabase").ManagedDatabaseLogicalDatabase = null as any;
utilities.lazyLoad(exports, ["ManagedDatabaseLogicalDatabase"], () => require("./managedDatabaseLogicalDatabase"));

export { ManagedDatabaseMysqlArgs, ManagedDatabaseMysqlState } from "./managedDatabaseMysql";
export type ManagedDatabaseMysql = import("./managedDatabaseMysql").ManagedDatabaseMysql;
export const ManagedDatabaseMysql: typeof import("./managedDatabaseMysql").ManagedDatabaseMysql = null as any;
utilities.lazyLoad(exports, ["ManagedDatabaseMysql"], () => require("./managedDatabaseMysql"));

export { ManagedDatabaseOpensearchArgs, ManagedDatabaseOpensearchState } from "./managedDatabaseOpensearch";
export type ManagedDatabaseOpensearch = import("./managedDatabaseOpensearch").ManagedDatabaseOpensearch;
export const ManagedDatabaseOpensearch: typeof import("./managedDatabaseOpensearch").ManagedDatabaseOpensearch = null as any;
utilities.lazyLoad(exports, ["ManagedDatabaseOpensearch"], () => require("./managedDatabaseOpensearch"));

export { ManagedDatabasePostgresqlArgs, ManagedDatabasePostgresqlState } from "./managedDatabasePostgresql";
export type ManagedDatabasePostgresql = import("./managedDatabasePostgresql").ManagedDatabasePostgresql;
export const ManagedDatabasePostgresql: typeof import("./managedDatabasePostgresql").ManagedDatabasePostgresql = null as any;
utilities.lazyLoad(exports, ["ManagedDatabasePostgresql"], () => require("./managedDatabasePostgresql"));

export { ManagedDatabaseRedisArgs, ManagedDatabaseRedisState } from "./managedDatabaseRedis";
export type ManagedDatabaseRedis = import("./managedDatabaseRedis").ManagedDatabaseRedis;
export const ManagedDatabaseRedis: typeof import("./managedDatabaseRedis").ManagedDatabaseRedis = null as any;
utilities.lazyLoad(exports, ["ManagedDatabaseRedis"], () => require("./managedDatabaseRedis"));

export { ManagedDatabaseUserArgs, ManagedDatabaseUserState } from "./managedDatabaseUser";
export type ManagedDatabaseUser = import("./managedDatabaseUser").ManagedDatabaseUser;
export const ManagedDatabaseUser: typeof import("./managedDatabaseUser").ManagedDatabaseUser = null as any;
utilities.lazyLoad(exports, ["ManagedDatabaseUser"], () => require("./managedDatabaseUser"));

export { ManagedDatabaseValkeyArgs, ManagedDatabaseValkeyState } from "./managedDatabaseValkey";
export type ManagedDatabaseValkey = import("./managedDatabaseValkey").ManagedDatabaseValkey;
export const ManagedDatabaseValkey: typeof import("./managedDatabaseValkey").ManagedDatabaseValkey = null as any;
utilities.lazyLoad(exports, ["ManagedDatabaseValkey"], () => require("./managedDatabaseValkey"));

export { ManagedObjectStorageArgs, ManagedObjectStorageState } from "./managedObjectStorage";
export type ManagedObjectStorage = import("./managedObjectStorage").ManagedObjectStorage;
export const ManagedObjectStorage: typeof import("./managedObjectStorage").ManagedObjectStorage = null as any;
utilities.lazyLoad(exports, ["ManagedObjectStorage"], () => require("./managedObjectStorage"));

export { ManagedObjectStorageBucketArgs, ManagedObjectStorageBucketState } from "./managedObjectStorageBucket";
export type ManagedObjectStorageBucket = import("./managedObjectStorageBucket").ManagedObjectStorageBucket;
export const ManagedObjectStorageBucket: typeof import("./managedObjectStorageBucket").ManagedObjectStorageBucket = null as any;
utilities.lazyLoad(exports, ["ManagedObjectStorageBucket"], () => require("./managedObjectStorageBucket"));

export { ManagedObjectStorageCustomDomainArgs, ManagedObjectStorageCustomDomainState } from "./managedObjectStorageCustomDomain";
export type ManagedObjectStorageCustomDomain = import("./managedObjectStorageCustomDomain").ManagedObjectStorageCustomDomain;
export const ManagedObjectStorageCustomDomain: typeof import("./managedObjectStorageCustomDomain").ManagedObjectStorageCustomDomain = null as any;
utilities.lazyLoad(exports, ["ManagedObjectStorageCustomDomain"], () => require("./managedObjectStorageCustomDomain"));

export { ManagedObjectStoragePolicyArgs, ManagedObjectStoragePolicyState } from "./managedObjectStoragePolicy";
export type ManagedObjectStoragePolicy = import("./managedObjectStoragePolicy").ManagedObjectStoragePolicy;
export const ManagedObjectStoragePolicy: typeof import("./managedObjectStoragePolicy").ManagedObjectStoragePolicy = null as any;
utilities.lazyLoad(exports, ["ManagedObjectStoragePolicy"], () => require("./managedObjectStoragePolicy"));

export { ManagedObjectStorageUserArgs, ManagedObjectStorageUserState } from "./managedObjectStorageUser";
export type ManagedObjectStorageUser = import("./managedObjectStorageUser").ManagedObjectStorageUser;
export const ManagedObjectStorageUser: typeof import("./managedObjectStorageUser").ManagedObjectStorageUser = null as any;
utilities.lazyLoad(exports, ["ManagedObjectStorageUser"], () => require("./managedObjectStorageUser"));

export { ManagedObjectStorageUserAccessKeyArgs, ManagedObjectStorageUserAccessKeyState } from "./managedObjectStorageUserAccessKey";
export type ManagedObjectStorageUserAccessKey = import("./managedObjectStorageUserAccessKey").ManagedObjectStorageUserAccessKey;
export const ManagedObjectStorageUserAccessKey: typeof import("./managedObjectStorageUserAccessKey").ManagedObjectStorageUserAccessKey = null as any;
utilities.lazyLoad(exports, ["ManagedObjectStorageUserAccessKey"], () => require("./managedObjectStorageUserAccessKey"));

export { ManagedObjectStorageUserPolicyArgs, ManagedObjectStorageUserPolicyState } from "./managedObjectStorageUserPolicy";
export type ManagedObjectStorageUserPolicy = import("./managedObjectStorageUserPolicy").ManagedObjectStorageUserPolicy;
export const ManagedObjectStorageUserPolicy: typeof import("./managedObjectStorageUserPolicy").ManagedObjectStorageUserPolicy = null as any;
utilities.lazyLoad(exports, ["ManagedObjectStorageUserPolicy"], () => require("./managedObjectStorageUserPolicy"));

export { NetworkArgs, NetworkState } from "./network";
export type Network = import("./network").Network;
export const Network: typeof import("./network").Network = null as any;
utilities.lazyLoad(exports, ["Network"], () => require("./network"));

export { NetworkPeeringArgs, NetworkPeeringState } from "./networkPeering";
export type NetworkPeering = import("./networkPeering").NetworkPeering;
export const NetworkPeering: typeof import("./networkPeering").NetworkPeering = null as any;
utilities.lazyLoad(exports, ["NetworkPeering"], () => require("./networkPeering"));

export { ObjectStorageArgs, ObjectStorageState } from "./objectStorage";
export type ObjectStorage = import("./objectStorage").ObjectStorage;
export const ObjectStorage: typeof import("./objectStorage").ObjectStorage = null as any;
utilities.lazyLoad(exports, ["ObjectStorage"], () => require("./objectStorage"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));

export { RouterArgs, RouterState } from "./router";
export type Router = import("./router").Router;
export const Router: typeof import("./router").Router = null as any;
utilities.lazyLoad(exports, ["Router"], () => require("./router"));

export { ServerArgs, ServerState } from "./server";
export type Server = import("./server").Server;
export const Server: typeof import("./server").Server = null as any;
utilities.lazyLoad(exports, ["Server"], () => require("./server"));

export { ServerFirewallRulesArgs, ServerFirewallRulesState } from "./serverFirewallRules";
export type ServerFirewallRules = import("./serverFirewallRules").ServerFirewallRules;
export const ServerFirewallRules: typeof import("./serverFirewallRules").ServerFirewallRules = null as any;
utilities.lazyLoad(exports, ["ServerFirewallRules"], () => require("./serverFirewallRules"));

export { ServerGroupArgs, ServerGroupState } from "./serverGroup";
export type ServerGroup = import("./serverGroup").ServerGroup;
export const ServerGroup: typeof import("./serverGroup").ServerGroup = null as any;
utilities.lazyLoad(exports, ["ServerGroup"], () => require("./serverGroup"));

export { StorageArgs, StorageState } from "./storage";
export type Storage = import("./storage").Storage;
export const Storage: typeof import("./storage").Storage = null as any;
utilities.lazyLoad(exports, ["Storage"], () => require("./storage"));

export { StorageTemplateArgs, StorageTemplateState } from "./storageTemplate";
export type StorageTemplate = import("./storageTemplate").StorageTemplate;
export const StorageTemplate: typeof import("./storageTemplate").StorageTemplate = null as any;
utilities.lazyLoad(exports, ["StorageTemplate"], () => require("./storageTemplate"));

export { TagArgs, TagState } from "./tag";
export type Tag = import("./tag").Tag;
export const Tag: typeof import("./tag").Tag = null as any;
utilities.lazyLoad(exports, ["Tag"], () => require("./tag"));


// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "upcloud:index/floatingIpAddress:FloatingIpAddress":
                return new FloatingIpAddress(name, <any>undefined, { urn })
            case "upcloud:index/gateway:Gateway":
                return new Gateway(name, <any>undefined, { urn })
            case "upcloud:index/gatewayConnection:GatewayConnection":
                return new GatewayConnection(name, <any>undefined, { urn })
            case "upcloud:index/gatewayConnectionTunnel:GatewayConnectionTunnel":
                return new GatewayConnectionTunnel(name, <any>undefined, { urn })
            case "upcloud:index/kubernetesCluster:KubernetesCluster":
                return new KubernetesCluster(name, <any>undefined, { urn })
            case "upcloud:index/kubernetesNodeGroup:KubernetesNodeGroup":
                return new KubernetesNodeGroup(name, <any>undefined, { urn })
            case "upcloud:index/loadbalancer:Loadbalancer":
                return new Loadbalancer(name, <any>undefined, { urn })
            case "upcloud:index/loadbalancerBackend:LoadbalancerBackend":
                return new LoadbalancerBackend(name, <any>undefined, { urn })
            case "upcloud:index/loadbalancerBackendTlsConfig:LoadbalancerBackendTlsConfig":
                return new LoadbalancerBackendTlsConfig(name, <any>undefined, { urn })
            case "upcloud:index/loadbalancerDynamicBackendMember:LoadbalancerDynamicBackendMember":
                return new LoadbalancerDynamicBackendMember(name, <any>undefined, { urn })
            case "upcloud:index/loadbalancerDynamicCertificateBundle:LoadbalancerDynamicCertificateBundle":
                return new LoadbalancerDynamicCertificateBundle(name, <any>undefined, { urn })
            case "upcloud:index/loadbalancerFrontend:LoadbalancerFrontend":
                return new LoadbalancerFrontend(name, <any>undefined, { urn })
            case "upcloud:index/loadbalancerFrontendRule:LoadbalancerFrontendRule":
                return new LoadbalancerFrontendRule(name, <any>undefined, { urn })
            case "upcloud:index/loadbalancerFrontendTlsConfig:LoadbalancerFrontendTlsConfig":
                return new LoadbalancerFrontendTlsConfig(name, <any>undefined, { urn })
            case "upcloud:index/loadbalancerManualCertificateBundle:LoadbalancerManualCertificateBundle":
                return new LoadbalancerManualCertificateBundle(name, <any>undefined, { urn })
            case "upcloud:index/loadbalancerResolver:LoadbalancerResolver":
                return new LoadbalancerResolver(name, <any>undefined, { urn })
            case "upcloud:index/loadbalancerStaticBackendMember:LoadbalancerStaticBackendMember":
                return new LoadbalancerStaticBackendMember(name, <any>undefined, { urn })
            case "upcloud:index/managedDatabaseLogicalDatabase:ManagedDatabaseLogicalDatabase":
                return new ManagedDatabaseLogicalDatabase(name, <any>undefined, { urn })
            case "upcloud:index/managedDatabaseMysql:ManagedDatabaseMysql":
                return new ManagedDatabaseMysql(name, <any>undefined, { urn })
            case "upcloud:index/managedDatabaseOpensearch:ManagedDatabaseOpensearch":
                return new ManagedDatabaseOpensearch(name, <any>undefined, { urn })
            case "upcloud:index/managedDatabasePostgresql:ManagedDatabasePostgresql":
                return new ManagedDatabasePostgresql(name, <any>undefined, { urn })
            case "upcloud:index/managedDatabaseRedis:ManagedDatabaseRedis":
                return new ManagedDatabaseRedis(name, <any>undefined, { urn })
            case "upcloud:index/managedDatabaseUser:ManagedDatabaseUser":
                return new ManagedDatabaseUser(name, <any>undefined, { urn })
            case "upcloud:index/managedDatabaseValkey:ManagedDatabaseValkey":
                return new ManagedDatabaseValkey(name, <any>undefined, { urn })
            case "upcloud:index/managedObjectStorage:ManagedObjectStorage":
                return new ManagedObjectStorage(name, <any>undefined, { urn })
            case "upcloud:index/managedObjectStorageBucket:ManagedObjectStorageBucket":
                return new ManagedObjectStorageBucket(name, <any>undefined, { urn })
            case "upcloud:index/managedObjectStorageCustomDomain:ManagedObjectStorageCustomDomain":
                return new ManagedObjectStorageCustomDomain(name, <any>undefined, { urn })
            case "upcloud:index/managedObjectStoragePolicy:ManagedObjectStoragePolicy":
                return new ManagedObjectStoragePolicy(name, <any>undefined, { urn })
            case "upcloud:index/managedObjectStorageUser:ManagedObjectStorageUser":
                return new ManagedObjectStorageUser(name, <any>undefined, { urn })
            case "upcloud:index/managedObjectStorageUserAccessKey:ManagedObjectStorageUserAccessKey":
                return new ManagedObjectStorageUserAccessKey(name, <any>undefined, { urn })
            case "upcloud:index/managedObjectStorageUserPolicy:ManagedObjectStorageUserPolicy":
                return new ManagedObjectStorageUserPolicy(name, <any>undefined, { urn })
            case "upcloud:index/network:Network":
                return new Network(name, <any>undefined, { urn })
            case "upcloud:index/networkPeering:NetworkPeering":
                return new NetworkPeering(name, <any>undefined, { urn })
            case "upcloud:index/objectStorage:ObjectStorage":
                return new ObjectStorage(name, <any>undefined, { urn })
            case "upcloud:index/router:Router":
                return new Router(name, <any>undefined, { urn })
            case "upcloud:index/server:Server":
                return new Server(name, <any>undefined, { urn })
            case "upcloud:index/serverFirewallRules:ServerFirewallRules":
                return new ServerFirewallRules(name, <any>undefined, { urn })
            case "upcloud:index/serverGroup:ServerGroup":
                return new ServerGroup(name, <any>undefined, { urn })
            case "upcloud:index/storage:Storage":
                return new Storage(name, <any>undefined, { urn })
            case "upcloud:index/storageTemplate:StorageTemplate":
                return new StorageTemplate(name, <any>undefined, { urn })
            case "upcloud:index/tag:Tag":
                return new Tag(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("upcloud", "index/floatingIpAddress", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/gateway", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/gatewayConnection", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/gatewayConnectionTunnel", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/kubernetesCluster", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/kubernetesNodeGroup", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/loadbalancer", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/loadbalancerBackend", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/loadbalancerBackendTlsConfig", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/loadbalancerDynamicBackendMember", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/loadbalancerDynamicCertificateBundle", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/loadbalancerFrontend", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/loadbalancerFrontendRule", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/loadbalancerFrontendTlsConfig", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/loadbalancerManualCertificateBundle", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/loadbalancerResolver", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/loadbalancerStaticBackendMember", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedDatabaseLogicalDatabase", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedDatabaseMysql", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedDatabaseOpensearch", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedDatabasePostgresql", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedDatabaseRedis", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedDatabaseUser", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedDatabaseValkey", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedObjectStorage", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedObjectStorageBucket", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedObjectStorageCustomDomain", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedObjectStoragePolicy", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedObjectStorageUser", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedObjectStorageUserAccessKey", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/managedObjectStorageUserPolicy", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/network", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/networkPeering", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/objectStorage", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/router", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/server", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/serverFirewallRules", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/serverGroup", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/storage", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/storageTemplate", _module)
pulumi.runtime.registerResourceModule("upcloud", "index/tag", _module)
pulumi.runtime.registerResourcePackage("upcloud", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:upcloud") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
