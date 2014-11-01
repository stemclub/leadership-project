package objects;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import services.ProgressInGame;

public class Tier {
	private int tierNumber;
	private int numberOfEvents;
	private int score;
	private Event[] events;
	
	public void initializeEvents(){
		for(int x = 0; x < numberOfEvents; x++){
			Event newEvent = new Event(DataStorage.filePaths[tierNumber][x], tierNumber, x);
			events[x] = newEvent;
		} 
	}
	
	public void openVideo(ProgressInGame n) throws IOException{
		int[] d = n.nextEventToBeDone();
		String h = events[d[2]].getVideoPath();
		Desktop.getDesktop().open(new File("C:/Users/shalin/Videos/Movies/Home_Alone/Home_Alone_4_[DVDRip][2002][Eng].avi"));
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
