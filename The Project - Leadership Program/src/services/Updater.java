package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JOptionPane;

public class Updater {
	public boolean update() {
		System.out.print("Checking for updates to LeadItUp... ");
		String version = "1.0 Beta";
		//System.out.println(version);
		try {
			// Create a URL for the desired page
        	URL url = new URL("https://raw.githubusercontent.com/stemclub/LeadItUp_deploy/master/version.info");       
        
        	// Read all the text returned by the server
        	BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        	String str = in.readLine().toString();
        	//System.out.println(str);
        	if (str.equals(version)) {
        		System.out.println("[No updates]");
        		in.close();
        		return true;
        	} else {
        		String str2 = in.readLine().toString();
            	System.out.print("[Update found]");
            	JOptionPane.showMessageDialog(null, "Update found! Get version " + str + " from " + str2, "Update", JOptionPane.PLAIN_MESSAGE);
            	in.close();
            	return true;
        	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}
	public boolean main() throws IOException {
		DownloadVideo down = new DownloadVideo();
		if (!down.checkFolder()) {
			if (!INetTest.main()) {
				System.out.println("ERR: No internet connection and must fetch video");
				JOptionPane.showMessageDialog(null, "Videos have to be downloaded and you do not appear to be connected to the internet. Please click OK, connect to the internet, and then reopen LeadItUp.", "Network Error", JOptionPane.PLAIN_MESSAGE);
				return false;
			} else {
				if (!update()) {
					System.out.println("WARN: Update fail. Continuing still possible");
					JOptionPane.showMessageDialog(null, "Update failed. You can still continue using LeadItUp though.", "Warning", JOptionPane.PLAIN_MESSAGE);
				}
				if (down.main()) {
					return true;
				} else {
					return false;
				}
			}
		} else {
			if (!INetTest.main()) {
				System.out.println("WARN: No internet. Continuing still possible");
				JOptionPane.showMessageDialog(null, "You do not appear to be connected to the internet. Updates could not be checked and some functionalities may be limited.", "Warning", JOptionPane.PLAIN_MESSAGE);
				return true;
			} else {
				if (!update()) {
					System.out.println("WARN: Update fail. Continuing still possible");
					JOptionPane.showMessageDialog(null, "Update failed. You can still continue using LeadItUp though.", "Warning", JOptionPane.PLAIN_MESSAGE);
				}
				return true;
			}
		}
	}
}
