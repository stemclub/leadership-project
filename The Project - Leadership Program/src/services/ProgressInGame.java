package services;

public class ProgressInGame {	
	private boolean[] tiersFinished = new boolean[4];
	private char[] tierOne = new char[1];
	private char[] tierTwo = new char[3];
	private char[] tierThree = new char[6];
	private char[] tierFour = new char[6];
	
	public byte isEventDone(int Event){
		if(tiersFinished[Event] == true){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public void restartGame(){
		for(int t = 0; t<=3; t++){
			tiersFinished[t] = false;
		}
		System.out.println("Restarting...[success]");
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
				int[] returning = {2,0};
				return returning;
			}
			else if(tierTwo[0] == 'b'){
				int[] returning = {2,1};
				return returning;
			}
			else if(tierTwo[0] == 'c'){
				int[] returning = {2,2};
				return returning;
			}
			else if(tierTwo[1] == 'a'){
				int[] returning = {2,2};
				return returning;
			}
			else if(tierTwo[1] == 'b'){
				int[] returning = {2,3};
				return returning;
			}
			else if(tierTwo[1] == 'c'){
				int[] returning = {2,4};
				return returning;
			}
			else if(tierTwo[2] == 'a'){
				int[] returning = {2,4};
				return returning;
			}
			else if(tierTwo[2] == 'b'){
				int[] returning = {2,5};
				return returning;
			}
			else if(tierTwo[2] == 'c'){
				int[] returning = {2,0};
				return returning;
			}
		}
		else if(tiersFinished[3] == false){
			if(tierThree[0] == 'a'){
				int[] returning = {3,0};
				return returning;
			}
			else if(tierThree[0] == 'b'){
				int[] returning = {3,1};
				return returning;
			}
			else if(tierThree[0] == 'c'){
				int[] returning = {3,2};
				return returning;
			}
			if(tierThree[1] == 'a'){
				int[] returning = {3,1};
				return returning;
			}
			else if(tierThree[1] == 'b'){
				int[] returning = {3,3};
				return returning;
			}
			else if(tierThree[1] == 'c'){
				int[] returning = {3,2};
				return returning;
			}
			else if(tierThree[2] == 'a'){
				int[] returning = {3,3};
				return returning;
			}
			else if(tierThree[2] == 'b'){
				int[] returning = {3,2};
				return returning;
			}
			else if(tierThree[2] == 'c'){
				int[] returning = {3,1};
				return returning;
			}
			else if(tierThree[3] == 'a'){
				int[] returning = {3,1};
				return returning;
			}
			else if(tierThree[3] == 'b'){
				int[] returning = {3,4};
				return returning;
			}
			else if(tierThree[3] == 'c'){
				int[] returning = {3,3};
				return returning;
			}
			else if(tierThree[4] == 'a'){
				int[] returning = {3,1};
				return returning;
			}
			else if(tierThree[4] == 'b'){
				int[] returning = {3,3};
				return returning;
			}
			else if(tierThree[4] == 'c'){
				int[] returning = {3,2};
				return returning;
			}
			else if(tierThree[5] == 'a'){
				int[] returning = {3,5};
				return returning;
			}
			else if(tierThree[5] == 'b'){
				int[] returning = {3,2};
				return returning;
			}
			else if(tierThree[5] == 'c'){
				int[] returning = {3,3};
				return returning;
			}
		}
		int[] returning = {4, 0};
		return returning;
	}
}
