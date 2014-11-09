package main;

import java.io.IOException;

import objects.Tier;
import services.ProgressInGame;
import services.ReadFile;
import services.Updater;
import services.WriteSave;
import uiInterface.ChoicesUI;
import uiInterface.ProgressUI;
import uiInterface.RunUI;

public class LeadItUp {
	private static ProgressInGame progress = new ProgressInGame();
	private static Updater updater = new Updater();

	public static void main(String[] args) throws IOException,InterruptedException {
		ProgressInGame n = new ProgressInGame();
		WriteSave.saveData(n);
		Updater updater = new Updater();
		if (updater.main()) {
			WriteSave.saveData(n);
			System.out.println(n.getTiersFinished()[0]);
			int[] TierSetUp = n.nextEventToBeDone();
			Tier Tier = new Tier(TierSetUp[0], TierSetUp[1]);
			Tier.initializeEvents();
			ProgressUI.Tier = Tier;
			ChoicesUI.Tier = Tier;
		}
	}
}