import java.net.*;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            // Get the local host address
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host:");
            System.out.println("Host Name: " + localHost.getHostName());
            System.out.println("IP Address: " + localHost.getHostAddress());

            // Get the address of a specific host
            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("\nGoogle:");
            System.out.println("Host Name: " + google.getHostName());
            System.out.println("IP Address: " + google.getHostAddress());

            // Get all the IP addresses associated with a host
            InetAddress[] allAddresses = InetAddress.getAllByName("www.oracle.com");
            System.out.println("\nOracle:");
            for (InetAddress address : allAddresses) {
                System.out.println("IP Address: " + address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}


