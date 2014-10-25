package services;

public class TestSave {
	public static void main(String[]args){
		//Tests a save! The title doesn't tell you anything about this file...
        ProgressInGame n = new ProgressInGame();
		n.restartGame();
		WriteSave.saveData(n);
	}
}
