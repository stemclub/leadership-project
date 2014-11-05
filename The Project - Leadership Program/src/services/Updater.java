package services;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Updater {
	public boolean update() {
		return true;
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
