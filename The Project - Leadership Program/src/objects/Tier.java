package objects;

import services.ProgressInGame;

public class Tier {
	private int tierNumber;
	private int numberOfEvents;
	private int score;
	private Event[] events;
	
	public void initilizeEvents(){
		for(int x = 0; x < numberOfEvents; x++){
			Event newEvent = new Event(DataStorage.filePaths[tierNumber][x], tierNumber, x);
			events[x] = newEvent;
		} 
	}
}
