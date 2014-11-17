package services;

import java.io.IOException;

import javax.swing.JFrame;

import objects.Tier;
import uiInterface.ChoicesUI;
import uiInterface.FXMediaPlayer;
import uiInterface.ProgressUI;

public class TestSave {
	public static void main(String[] args) throws IOException, InterruptedException{
		//Tests a save! The title doesn't tell you anything about this file...
        ProgressInGame n = new ProgressInGame();
        String mediaURL = "/LeadVideos/Background.mp4";
        FXMediaPlayer player = new FXMediaPlayer();
        player.setMediaURLInput(mediaURL);
        JFrame frame = player.main();
        Thread.sleep(50000);
        Tier.closeVideo(frame);
        String mediaURL1 = "/LeadVideos/Intro.mp4";
        FXMediaPlayer player1 = new FXMediaPlayer();
        player1.setMediaURLInput(mediaURL1);
        JFrame frame1 = player1.main();
        Thread.sleep(25000);
        Tier.closeVideo(frame1);
		n.restartGame();
		n.initializeArrays();
		//ReadFile.read(n);
		WriteSave.saveData(n);
		Updater updater = new Updater();
		if (updater.main()) {
			WriteSave.saveData(n);
			Tier Tier = new Tier(0,1);
			Tier.initializeEvents();
			ProgressUI.Tier = Tier;
			ChoicesUI.Tier = Tier;
		}
	}
}
	
