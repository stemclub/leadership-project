package services;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import objects.Tier;

public class TestSave {
	public static void main(String[]args) throws IOException{
		//Tests a save! The title doesn't tell you anything about this file...
        ProgressInGame n = new ProgressInGame();
        Tier test = new Tier();
		n.restartGame();
		n.initializeArrays();
		n.setTierDone(0, 0, 'a', n);
		n.nextEventToBeDone();
		Desktop.getDesktop().open(new File("C:/Users/shalin/Videos/Movies/Home_Alone/Home_Alone_4_[DVDRip][2002][Eng].avi"));
		WriteSave.saveData(n);
	}
}
