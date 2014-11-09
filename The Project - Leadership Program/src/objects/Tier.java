package objects;

import java.io.IOException;

import javax.swing.JFrame;

import services.ProgressInGame;
import uiInterface.FXMediaPlayer;
import uiInterface.RunUI;

public class Tier {
	private int tierNumber;
	private int numberOfEvents;
	private int score;
	private Event[] events = new Event[numberOfEvents + 10];
	
	public void initializeEvents(){
		for(int x = 0; x < numberOfEvents; x++){
			String string = DataStorage.filePaths[tierNumber][x];
			Event newEvent = new Event(string , tierNumber, x);
			System.out.println(x);
			events[x] = newEvent;
		} 
	}
	
	private void makeScore(){
		for(int x = 0; x <= events.length; x++){
			char k = events[x].getChoice();
			int ref;
			if(k == 'a'){
				ref = 0;
			}
			else if(k == 'b'){
				ref = 1;
			}
			else if(k == 'c'){
				ref = 2;
			}
			else{
				ref = 100;
			}
			if(!(k == 'z')){
				score = DataStorage.scores[tierNumber][x][ref];
				break;
			}
		}
		System.out.println(score);
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
			Thread.sleep(1000 * (DataStorage.times[tierNumber][d]+15));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.setVisible(false);
		frame.dispose();
		RunUI.choicesScreen.setN(n);
		RunUI.choicesScreen.setTier(tierNumber);
		RunUI.choicesScreen.setEvent(d);
	}

	public int getTierNumber() {
		return tierNumber;
	}

	public void setTierNumber(int tierNumber) {
		this.tierNumber = tierNumber;
	}

	public int getNumberOfEvents() {
		return numberOfEvents;
	}

	public void setNumberOfEvents(int numberOfEvents) {
		this.numberOfEvents = numberOfEvents;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Event[] getEvents() {
		return events;
	}

	public void setEvents(Event[] events) {
		this.events = events;
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
