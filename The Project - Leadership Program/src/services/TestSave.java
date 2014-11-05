package services;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import objects.DataStorage;
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
		Updater updater = new Updater();
		if (updater.main()) {
			//FXMediaPlayer player = new FXMediaPlayer();
			//JFrame frame = player.main(args);
			//Thread.sleep(5000);
			//frame.setVisible(false);
			//frame.dispose();
			//System.out.println(DataStorage.filePaths[1][1][0]);
			WriteSave.saveData(n);
		}
	}
}
