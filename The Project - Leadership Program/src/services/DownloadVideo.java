package services;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import javax.swing.JOptionPane;

import objects.DataStorage;

public class DownloadVideo {
	public static boolean deleteRecursive(File path) throws FileNotFoundException{
        if (!path.exists()) throw new FileNotFoundException(path.getAbsolutePath());
        boolean ret = true;
        if (path.isDirectory()){
            for (File f : path.listFiles()){
                ret = ret && deleteRecursive(f);
            }
        }
        return ret && path.delete();
    }
	public boolean checkFolder() {
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
        String finalPath = "~/Desktop/LeadVideos";
		try {
			finalPath = URLDecoder.decode(mediaPath, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //System.out.println(finalPath);
        File f = new File(finalPath);
        if (f.exists()) {
        	return true;
        } else {
        	return false;
        }
	}
	public boolean main() throws MalformedURLException, HeadlessException, FileNotFoundException {
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
        String finalPath = "~/Desktop/LeadVideos";
		try {
			finalPath = URLDecoder.decode(mediaPath, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
        //System.out.println(finalPath);
        File f = new File(finalPath);
		System.out.println("Downloading Videos:");
		JOptionPane.showMessageDialog(null, "Videos need to be downloaded. This may take a while on a slow internet connection. Click OK to continue.", "Video Download", JOptionPane.PLAIN_MESSAGE);
		f.mkdirs();
		System.out.println("Created LeadVideos directory");
		int count3 = 1;
		while (count3 < 7) {
			System.out.print("Creating directory LeadVideos/" + count3 + "... ");
			boolean status;
			status = new File(path + "/LeadVideos/" + count3).mkdir();
			if (status) {
				System.out.println("[Success]");
			} else {
				System.out.println("[Fail]");
			}
		count3 = count3 + 1;
		}
		URL website = new URL("https://copy.com/YuKcsyvkg96gg9DZ/LeadVideos/1/a.mp4?download");
		try {
			int count = 0;
			while (count < 6) {
				int count2 = 0;
				if (count == 0) {
					while (count2 < 1) {
						//System.out.println(count + " " + count2);
						System.out.print("Downloading " + DataStorage.filePaths[count][count2] + "... ");
						website = new URL("https://copy.com/YuKcsyvkg96gg9DZ/" + DataStorage.filePaths[count][count2] + "?download");
						ReadableByteChannel rbc = Channels.newChannel(website.openStream());
						FileOutputStream fos = new FileOutputStream(path + "/" + DataStorage.filePaths[count][count2]);
						fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
						fos.close();
						System.out.println("[Success]");
						count2 = count2 + 1;
					}
				} else if (count == 1) {
					while (count2 < 3) {
						//System.out.println(count + " " + count2);
						System.out.print("Downloading " + DataStorage.filePaths[count][count2] + "... ");
						website = new URL("https://copy.com/YuKcsyvkg96gg9DZ/" + DataStorage.filePaths[count][count2] + "?download");
						ReadableByteChannel rbc = Channels.newChannel(website.openStream());
						FileOutputStream fos = new FileOutputStream(path + "/" + DataStorage.filePaths[count][count2]);
						fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
						fos.close();
						System.out.println("[Success]");
						count2 = count2 + 1;
					}
				} else {
					while (count2 < 6) {
						//System.out.println(count + " " + count2);
						System.out.print("Downloading " + DataStorage.filePaths[count][count2] + "... ");
						website = new URL("https://copy.com/YuKcsyvkg96gg9DZ/" + DataStorage.filePaths[count][count2] + "?download");
						ReadableByteChannel rbc = Channels.newChannel(website.openStream());
						FileOutputStream fos = new FileOutputStream(path + "/" + DataStorage.filePaths[count][count2]);
						fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
						fos.close();
						System.out.println("[Success]");
						count2 = count2 + 1;
					}
				}
				count = count + 1;
			}
			System.out.print("Downloading LeadVideos/Background.mp4... ");
			website = new URL("https://copy.com/YuKcsyvkg96gg9DZ/LeadVideos/Background.mp4?download");
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(path + "/LeadVideos/Background.mp4");
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			fos.close();
			System.out.println("[Success]");
			System.out.print("Downloading LeadVideos/Intro.mp4... ");
			website = new URL("https://copy.com/YuKcsyvkg96gg9DZ/LeadVideos/Intro.mp4?download");
			rbc = Channels.newChannel(website.openStream());
			fos = new FileOutputStream(path + "/LeadVideos/Intro.mp4");
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			fos.close();
			System.out.println("[Success]");
		} catch (IOException e) {
			System.out.println("[Fail]");
			System.out.print("Deleting directory... ");
			if (deleteRecursive(f)) {
				System.out.println("[Success]");
				JOptionPane.showMessageDialog(null, "Error with video download. Check your internet connection and relaunch LeadItUp.", "Error", JOptionPane.PLAIN_MESSAGE);
			} else {
				System.out.println("[Fail]");
				JOptionPane.showMessageDialog(null, "Error with video download. Please delete:" + finalPath + ", check your internet connection, and relaunch LeadItUp.", "Error", JOptionPane.PLAIN_MESSAGE);
			}
			e.printStackTrace();
			return false;
		}
		return true;
}
}
