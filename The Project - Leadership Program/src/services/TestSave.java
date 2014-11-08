package services;

import java.io.IOException;

import objects.DataStorage;
import objects.Tier;
import uiInterface.RunUI;

public class TestSave {
	public static void main(String[] args) throws IOException, InterruptedException{
		//Tests a save! The title doesn't tell you anything about this file...
        ProgressInGame n = new ProgressInGame();
		n.restartGame();
		n.initializeArrays();
		Updater updater = new Updater();
		if (updater.main()) {
			WriteSave.saveData(n);
			Tier testTier = new Tier(0,0);
			testTier.initializeEvents();
			testTier.openVideo(n, DataStorage.hi);
		}
	}
}
	