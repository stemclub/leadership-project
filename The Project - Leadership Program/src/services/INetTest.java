package services;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

public class INetTest {
	public static boolean main()
    {
		try {
			System.out.print("Checking for internet connection... ");
            //make a URL to a known source
            URL url = new URL("http://www.google.com");

            //open a connection to that source
            HttpURLConnection urlConnect = (HttpURLConnection)url.openConnection();

            //trying to retrieve data from the source. If there
            //is no connection, this line will fail
            Object objData = urlConnect.getContent();

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
        	System.out.println("[Connection Err]");
            return false;
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
        	System.out.println("[Connection Err]");
            return false;
        }
		System.out.println("[Success]");
        return true;
    }
}
