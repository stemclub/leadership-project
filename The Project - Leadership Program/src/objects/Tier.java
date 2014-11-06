package objects;

import java.io.IOException;

import services.ProgressInGame;
import uiInterface.FXMediaPlayer;

public class Tier {
	private int tierNumber;
	private int numberOfEvents;
	private int score;
	private Event[] events;
	
	public void initializeEvents(){
		for(int x = 0; x < numberOfEvents; x++){
			String string = DataStorage.filePaths[tierNumber][x];
			Event newEvent = new Event(string , tierNumber, x);
			events[x] = newEvent;
		} 
	}
	
	public void openVideo(ProgressInGame n) throws IOException{
		int[] d = n.nextEventToBeDone();
		String h = events[d[2]].getVideoPath();
		h = "/" + h;
		FXMediaPlayer player = new FXMediaPlayer();
		player.setMediaURLInput(h);
		String g = h.substring(11);
		g = "/Videos" + g;
		player.setBinMediaURLInput(g);
		
	}

	public Tier(int tierNumber, int numberOfEvents, int score, Event[] events) {
		super();
		this.tierNumber = tierNumber;
		this.numberOfEvents = numberOfEvents;
		this.score = score;
		this.events = events;
	}

	public Tier() {
		// TODO Auto-generated constructor stub
	}
}
