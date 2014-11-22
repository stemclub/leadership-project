package services;

import java.io.IOException;

import javax.swing.JFrame;

import objects.DataStorage;
import objects.Tier;
import uiInterface.ChoicesUI;
import uiInterface.FXMediaPlayer;
import uiInterface.ProgressUI;

public class TestSave {
	public static void main(String[] args) throws IOException, InterruptedException{
		//Tests a save! The title doesn't tell you anything about this file...
		Updater updater = new Updater();
		updater.main();
        ProgressInGame n = new ProgressInGame();
        String mediaURL = "/LeadVideos/Background.mp4";
        FXMediaPlayer player = new FXMediaPlayer();
        player.setMediaURLInput(mediaURL);
        JFrame frame = player.main();
        Thread.sleep(31000);
        Tier.closeVideo(frame);
        String mediaURL1 = "/LeadVideos/Intro.mp4";
        FXMediaPlayer player1 = new FXMediaPlayer();
        player1.setMediaURLInput(mediaURL1);
        JFrame frame1 = player1.main();
        Thread.sleep(14000);
        Tier.closeVideo(frame1);
        WriteSave.saveData(n);
		Tier Tier = new Tier(0,1);
		ProgressUI.Tier = Tier;
		ChoicesUI.Tier = Tier;
		Tier.initializeEvents();
		n.restartGame();
		n.initializeArrays();
		System.out.println(DataStorage.choicesSubtitles[0][0][0]);
		//ReadFile.read(n);
	}
}
	
