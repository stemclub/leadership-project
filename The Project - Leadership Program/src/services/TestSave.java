package services;

public class TestSave {
	public static void main(String[]args){
		//Tests a save! The title doesn't tell you anything about this file...
        ProgressInGame n = new ProgressInGame();
		n.restartGame();
		n.initializeArrays();
		n.setTierDone(0, 0, 'a', n);
		WriteSave.saveData(n);
	}
}
