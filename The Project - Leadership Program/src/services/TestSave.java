package services;

import java.io.IOException;

import javax.swing.JFrame;

import objects.Tier;
import uiInterface.FXMediaPlayer;

public class TestSave {
	public static void main(String[]args) throws IOException, InterruptedException{
		//Tests a save! The title doesn't tell you anything about this file...
        ProgressInGame n = new ProgressInGame();
        Tier test = new Tier();
		n.restartGame();
		n.initializeArrays();
		n.setTierDone(0, 0, 'a', n);
		n.nextEventToBeDone();
		FXMediaPlayer player = new FXMediaPlayer();
		JFrame frame = player.main(args);
		Thread.sleep(5000);
		frame.setVisible(false);
		frame.dispose();
		WriteSave.saveData(n);
	}
}
