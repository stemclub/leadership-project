package services;

import java.io.IOException;

import objects.Tier;
import uiInterface.ChoicesUI;
import uiInterface.RunUI;

public class TestSave {
	public static void main() throws IOException, InterruptedException{
		//Tests a save! The title doesn't tell you anything about this file...
        ProgressInGame n = new ProgressInGame();
        Tier test = new Tier();
		n.restartGame();
		n.initializeArrays();
		Updater updater = new Updater();
		if (updater.main()) {
			WriteSave.saveData(n);
			Tier testTier = new Tier(0,0);
			testTier.initializeEvents();
			RunUI hi = new RunUI();
			testTier.openVideo(n, hi);
		}
	}
}
	