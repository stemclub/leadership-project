package main;

import java.io.IOException;

import services.ProgressInGame;
import services.Updater;
import services.WriteSave;
import uiInterface.RunUI;

public class LeadItUp {
	private static ProgressInGame progress = new ProgressInGame();
	private static Updater updater = new Updater();
	public static void main(String[] args) throws IOException, InterruptedException {
		progress.initializeArrays();
		if (updater.main()) {
			WriteSave.saveData(progress);
			RunUI runUI = new RunUI();
		}
	}
	public void playNextVideo() {
		
	}
}
