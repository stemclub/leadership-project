package objects;

import java.io.IOException;

import javax.swing.JFrame;

import services.ProgressInGame;
import uiInterface.ChoicesUI;
import uiInterface.FXMediaPlayer;
import uiInterface.RunUI;

public class Tier {
	private int tierNumber;
	private int numberOfEvents;
	private int score;
	private Event[] events = new Event[(numberOfEvents + 1)];
	
	public void initializeEvents(){
		for(int x = 0; x <= numberOfEvents; x++){
			String string = DataStorage.filePaths[tierNumber][x];
			Event newEvent = new Event(string , tierNumber, x);
			events[x] = newEvent;
		} 
	}
	
	public void openVideo(ProgressInGame n, RunUI UI) throws IOException{
		int d = n.nextEventToBeDone()[1];
		//System.out.println(d);
		String h = events[d].getVideoPath();
		h = "/" + h;
		FXMediaPlayer player = new FXMediaPlayer();
		player.setMediaURLInput(h);
		String g = h.substring(11);
		g = "/Videos" + g;
		player.setBinMediaURLInput(g);
		JFrame frame = player.main();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.setVisible(false);
		frame.dispose();
		char choice = ChoicesUI.choice;
		n.setTierDone(tierNumber, d, choice, n);
	}

	public Tier(int tierNumber, int numberOfEvents) {
		super();
		this.tierNumber = tierNumber;
		this.numberOfEvents = numberOfEvents;
	}

	public Tier() {
		// TODO Auto-generated constructor stub
	}
}
