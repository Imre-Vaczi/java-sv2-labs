package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private List<DnsEntry> servers = new ArrayList<>();

    public void addEntry(String hostName, String hostIp) {
        if (!inServers(hostName, hostIp)) {
            servers.add(new DnsEntry(hostName, hostIp));
        } else {
            throw new IllegalArgumentException("Already exists");
        }
    }

    public void removeEntryByName(String hostName) {
        if (!getByName(hostName).equals(null)) {
            servers.remove(getByName(hostName));
        }
    }

    public void removeEntryByIp(String hostIP) {
        if (!getByIP(hostIP).equals(null)) {
            servers.remove(getByIP(hostIP));
        }
    }

    public String getIpByName(String hostName) {
/*        if (!getByName(hostName).equals(null)) {
            return getByName(hostName).getIpAddress();
        } else {
            throw new IllegalArgumentException("Element not found");
        }*/
        return getByName(hostName).getIpAddress();
    }

    public String getNameByIp(String hostIP) {
        /*if (!getByName(hostIP).equals(null)) {
            return getByIP(hostIP).getName();
        } else {
            throw new IllegalArgumentException("Element not found");
        }*/
        return getByIP(hostIP).getName();
    }

    private DnsEntry getByName(String hostName) {
        for (DnsEntry item : servers) {
            if (hostName.equals(item.getName())) {
                return item;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private DnsEntry getByIP(String hostIP) {
        for (DnsEntry item : servers) {
            if (hostIP.equals(item.getIpAddress())) {
                return item;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public Boolean inServers(String hostName, String hostIp) {
        if (servers.size() == 0) {
            return false;
        }
        for (DnsEntry item : servers) {
            if (hostName.equals(item.getName()) || hostIp.equals(item.getIpAddress())) {
                return true;
            }
        }
        return false;
    }

    private static class DnsEntry {
        private String name;
        private String ipAddress;

        public DnsEntry(String name, String ipAddress) {
            this.name = name;
            this.ipAddress = ipAddress;
        }

        public String getName() {
            return name;
        }

        public String getIpAddress() {
            return ipAddress;
        }
    }

/*    public static void main(String[] args) {
        NameServer nameServer = new NameServer();
        nameServer.addEntry("aaa", "111");
        System.out.println(nameServer.inServers("aaa", "111"));

    }*/
}
