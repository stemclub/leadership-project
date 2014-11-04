package services;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class INetTest {
	public static boolean main()
    {
        try {

            InetAddress address = InetAddress.getByName("java.sun.com");

            if(address == null)
            {
                return false;
            }

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
