
import java.net.*;

/*
 * @description: Obtain IP and name of a domain.
 * @createdDate: 07/04/2023 11:57 GMT-5
 * @lastModifiedDate: N/A
 * @version: 1.0
 */

public class GetIpAndDomainName {

    public static void main(String[] args) {
        try {
            InetAddress addressComplet = InetAddress.getByName("google.com");
            int temp = addressComplet.toString().indexOf('/');
            String ipAddress = addressComplet.toString().substring(temp + 1);
            System.out.println(
                    "-> URL IP address '" + addressComplet.toString().substring(0, temp) + "': " + ipAddress);

            addressComplet = InetAddress.getLocalHost();
            temp = addressComplet.toString().indexOf('/');
            ipAddress = addressComplet.toString().substring(temp + 1);
            System.out.println("-> Current IP address of 'localhost': " + ipAddress);
            System.out.println("-> Name of 'localHost': " + addressComplet.toString().substring(0, temp));

            System.out.println();
        } catch (UnknownHostException e) {
            System.out.println("You must be connected to the Internet for this to work properly.");
            System.out.println("Error: " + e);
        }
    }
}
