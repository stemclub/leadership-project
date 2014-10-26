package objects;

public class Event {
	private String[] videoPaths;
	private char[] choices;
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

	public Event(String[] videoPaths, char[] choices) {
		super();
		this.videoPaths = videoPaths;
		this.choices = choices;
	}
}
