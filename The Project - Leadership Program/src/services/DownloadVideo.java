package services;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

public class DownloadVideo {
	public void main() throws UnsupportedEncodingException {
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
			f.mkdirs();
		}
	}
}
