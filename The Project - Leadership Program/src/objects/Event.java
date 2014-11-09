package objects;

public class Event {
	private String videoPath;
	private char[] choices;
	private char choice;
	private int scoreForRound;
	private int tier;
	private int eventNumber;

	public String getVideoPath() {
		return videoPath;
	}

	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}

	public char[] getChoices() {
		return choices;
	}

	public void setChoices(char[] choices) {
		this.choices = choices;
	}

	public char getChoice() {
		return choice;
	}

	public void setChoice(char choice) {
		this.choice = choice;
	}

	public int getScoreForRound() {
		return scoreForRound;
	}

	public void setScoreForRound(int scoreForRound) {
		this.scoreForRound = scoreForRound;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public int getEventNumber() {
		return eventNumber;
	}

	public void setEventNumber(int eventNumber) {
		this.eventNumber = eventNumber;
	}

	public Event(String videoPath, int tier, int eventNumber) {
		super();
		this.videoPath = videoPath;
		this.tier = tier;
		this.eventNumber = eventNumber;
	}
}
