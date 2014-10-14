package services;

public class ProgressInGame {	
	private boolean[] tiersFinished = new boolean[4];
	private char[] tierOne = new char[1];
	private char[][] tierTwo = new char[3][3];
	private char[][] tierThree = new char[6][3];
	private char[][] tierFour = new char[6][3];
	
	public byte isEventDone(int Event){
		if(tiersFinished[Event] == true){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public int[] nextEventToBeDone(){
		if(tiersFinished[0] == false){
			int[] returning = {0,0};
			return returning;
		}
		else if(tiersFinished[1] == false){
			if(tierOne[0] == 'a'){
				int[] returning = {1,0};
				return returning;
			}
			else if(tierOne[0] == 'b'){
				int[] returning = {1,1};
				return returning;
			}
			else if(tierOne[0] == 'c'){
				int[] returning = {1,2};
				return returning;
			}
		}
		else if(tiersFinished[2] == false){
			if(tierTwo[0] == 'a'){
				
			}
		}
	}
}
