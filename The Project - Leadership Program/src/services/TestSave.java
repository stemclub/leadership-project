package services;

public class TestSave {
	public static void main(String[]args){
		ProgressInGame n = new ProgressInGame();
		n.restartGame();
		WriteSave.saveData(n);
	}
}
