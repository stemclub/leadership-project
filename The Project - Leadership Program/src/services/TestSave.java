package services;

import java.io.IOException;

import objects.DataStorage;
import objects.Tier;
import uiInterface.ChoicesUI;
import uiInterface.ProgressUI;
import uiInterface.RunUI;

public class TestSave {
	public static void main(String[] args) throws IOException, InterruptedException{
		//Tests a save! The title doesn't tell you anything about this file...
        ProgressInGame n = new ProgressInGame();
		n.restartGame();
		n.initializeArrays();
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
	