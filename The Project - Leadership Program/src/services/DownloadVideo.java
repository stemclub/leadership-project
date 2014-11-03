package services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import javax.swing.JOptionPane;

public class DownloadVideo {
	public void main() throws IOException {
		URL url = this.getClass().getProtectionDomain().getCodeSource().getLocation();
        int index = url.getFile().lastIndexOf("/");
        String path = url.getFile().substring(0, index);
        String mediaPath = path + "/LeadVideos";
        if(path.endsWith("bin")) {
        	int index2 = path.lastIndexOf("/");
        	path = path.substring(0,  index2);
        	mediaPath = path + "/Videos";
        }
        //String mediaPath = "/Users";
        String finalPath = URLDecoder.decode(mediaPath, "utf-8");
        System.out.println(finalPath);
        File f = new File(finalPath);
		if (!f.exists()) {
			System.out.println("Not found. Creating.");
			JOptionPane.showMessageDialog(null, "Downloading Videos. Press OK to begin.", "Downloading", JOptionPane.PLAIN_MESSAGE);
			f.mkdirs();
			boolean status;
			status = new File("LeadVideos/1").mkdir();
			System.out.println(status);
			status = new File("LeadVideos/2").mkdir();
			System.out.println(status);
			status = new File("LeadVideos/3").mkdir();
			System.out.println(status);
			status = new File("LeadVideos/4").mkdir();
			System.out.println(status);
			status = new File("LeadVideos/5").mkdir();
			System.out.println(status);
			status = new File("LeadVideos/6").mkdir();
			System.out.println(status);
			URL website = new URL("https://copy.com/YuKcsyvkg96gg9DZ/LeadVideos/1/a.mp4?download");
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream("LeadVideos/1/a.mp4");
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			fos.close();
			System.out.println("Downloaded 1a");
			
		}
	}
}
