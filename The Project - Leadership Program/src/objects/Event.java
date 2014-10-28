package objects;

public class Event {
	private String videoPath;
	private char[] choices;
	private char choice;
	private int scoreForRound;
	private int tier;
	private int eventNumber;
	
	private void makeScore(){
		for(int x = 0; x <= choices.length; x++){
			if(!(choices[x] == 'z')){
				scoreForRound = DataStorage.scores[tier][eventNumber][x];
			}
		}
	}

	public Event(String videoPath, int tier, int eventNumber) {
		super();
		this.videoPath = videoPath;
		this.tier = tier;
		this.eventNumber = eventNumber;
	}
}
