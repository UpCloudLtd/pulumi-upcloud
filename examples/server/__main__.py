"""A Python Pulumi program"""

from glob import glob
import os

from pulumi_upcloud import Server, ServerFirewallRules, ServerLoginArgs

def get_login(user=None) -> ServerLoginArgs:
    """Get ServerLoginArgs with current users first public key
    """
    user_ssh_key_paths = glob(os.path.expanduser("~/.ssh/*.pub"))

    if user_ssh_key_paths:
        with open(user_ssh_key_paths[0]) as f:
            ssh_key = f.read()
        return ServerLoginArgs(user=user, keys=[ssh_key])

    return None


# Create a new server
server = Server("example",
    firewall=True,
    hostname="pulumi-example-server",
    login=get_login(),
    metadata=True,
    network_interfaces=[{
        "type": "public",
    }],
    plan="1xCPU-1GB",
    template={
        "size": 25,
        "storage": "01000000-0000-4000-8000-000030240200",
    },
    zone="de-fra1")

# Create a new firewall rule
ServerFirewallRules(
    "example",
    server_id=server.id,
    firewall_rules=[{
        "direction": "in",
        "family": "IPv4",
        "protocol": "tcp",
        "destination_port_start": "22",
        "destination_port_end": "22",
        "action": "accept",
    }],
)
