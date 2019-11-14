package inte.address;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InteAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getLocalHost();
            String hostAddress = ia.getHostAddress();
            System.out.println(hostAddress);
            String hostName = ia.getHostName();
            System.out.println(hostName);


            InetAddress ia1 = InetAddress.getByName("DESKTOP-LUJ6F7M");
            System.out.println(ia1);


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
