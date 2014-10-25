package services;

public class ProgressInGame {
    //Initializes arrays. Great job.
	private boolean[] tiersFinished = new boolean[5];
	private char[] tierOne = new char[1];
	private char[] tierTwo = new char[3];
	private char[] tierThree = new char[6];
	private char[] tierFour = new char[6];
	private char[] tierFive = new char[6];
	
	private char[][] tiers = {tierOne, tierTwo, tierThree, tierFour, tierFive};
	
    //Sets events as done as needed
	public byte isEventDone(int Event){
		if(tiersFinished[Event] == true){
			return 1;
		}
		else{
			return 0;
		}
	}
	
    //Sets tiers as done as needed
	public void setTierDone(int Tier, int Event, char Choice, ProgressInGame n){
		n.tiersFinished[Tier] = true;
		switch(Tier){
			case(0):n.tiers[0][Event] = Choice;
			case(1):n.tiers[1][Event] = Choice;
			case(2):n.tiers[2][Event] = Choice;
			case(3):n.tiers[3][Event] = Choice;
			case(4):n.tiers[4][Event] = Choice;
		}
	}
	
    //Restarts game when needed
	public void restartGame(){
		for(int t = 0; t<=4; t++){
			tiersFinished[t] = false;
		}
		System.out.println("Restarting...[success]");
	}
	
    //Calculates next event to be done when needed
	public int[] nextEventToBeDone(){
		if(tiersFinished[0] == false){
			int[] returning = {0,0};
			return returning;
		}
		else if(tiersFinished[1] == false){
			if(tiers[0][0] == 'a'){
				int[] returning = {1,0};
				return returning;
			}
			else if(tiers[0][0] == 'b'){
				int[] returning = {1,1};
				return returning;
			}
			else if(tiers[0][0] == 'c'){
				int[] returning = {1,2};
				return returning;
			}
		}
		else if(tiersFinished[2] == false){
			if(tiers[1][0] == 'a'){
				int[] returning = {2,0};
				return returning;
			}
			else if(tiers[1][0] == 'b'){
				int[] returning = {2,1};
				return returning;
			}
			else if(tiers[1][0] == 'c'){
				int[] returning = {2,2};
				return returning;
			}
			else if(tiers[1][1] == 'a'){
				int[] returning = {2,2};
				return returning;
			}
			else if(tiers[1][1] == 'b'){
				int[] returning = {2,3};
				return returning;
			}
			else if(tiers[1][1] == 'c'){
				int[] returning = {2,4};
				return returning;
			}
			else if(tiers[1][2] == 'a'){
				int[] returning = {2,4};
				return returning;
			}
			else if(tiers[1][2] == 'b'){
				int[] returning = {2,5};
				return returning;
			}
			else if(tiers[1][2] == 'c'){
				int[] returning = {2,0};
				return returning;
			}
		}
		else if(tiersFinished[3] == false){
			if(tiers[2][0] == 'a'){
				int[] returning = {3,0};
				return returning;
			}
			else if(tiers[2][0] == 'b'){
				int[] returning = {3,1};
				return returning;
			}
			else if(tiers[2][0] == 'c'){
				int[] returning = {3,2};
				return returning;
			}
			if(tiers[2][1] == 'a'){
				int[] returning = {3,1};
				return returning;
			}
			else if(tiers[2][1] == 'b'){
				int[] returning = {3,3};
				return returning;
			}
			else if(tiers[2][1] == 'c'){
				int[] returning = {3,2};
				return returning;
			}
			else if(tiers[2][2] == 'a'){
				int[] returning = {3,3};
				return returning;
			}
			else if(tiers[2][2] == 'b'){
				int[] returning = {3,2};
				return returning;
			}
			else if(tiers[2][2] == 'c'){
				int[] returning = {3,1};
				return returning;
			}
			else if(tiers[2][3] == 'a'){
				int[] returning = {3,1};
				return returning;
			}
			else if(tiers[2][3] == 'b'){
				int[] returning = {3,4};
				return returning;
			}
			else if(tiers[2][3] == 'c'){
				int[] returning = {3,3};
				return returning;
			}
			else if(tiers[2][4] == 'a'){
				int[] returning = {3,1};
				return returning;
			}
			else if(tiers[2][4] == 'b'){
				int[] returning = {3,3};
				return returning;
			}
			else if(tiers[2][4] == 'c'){
				int[] returning = {3,2};
				return returning;
			}
			else if(tiers[2][5] == 'a'){
				int[] returning = {3,5};
				return returning;
			}
			else if(tiers[2][5] == 'b'){
				int[] returning = {3,2};
				return returning;
			}
			else if(tiers[2][5] == 'c'){
				int[] returning = {3,3};
				return returning;
			}
		}
		else if(tiersFinished[4] == false){
			if(tiers[3][0] == 'a'){
				int[] returning = {4,0};
				return returning;
			}
			else if(tiers[3][0] == 'b'){
				int[] returning = {4,1};
				return returning;
			}
			else if(tiers[3][0] == 'c'){
				int[] returning = {4,2};
				return returning;
			}
			else if(tiers[3][1] == 'a'){
				int[] returning = {4,1};
				return returning;
			}
			else if(tiers[3][1] == 'b'){
				int[] returning = {4,2};
				return returning;
			}
			else if(tiers[3][1] == 'c'){
				int[] returning = {4,3};
				return returning;
			}
			else if(tiers[3][2] == 'a'){
				int[] returning = {4,2};
				return returning;
			}
			else if(tiers[3][2] == 'b'){
				int[] returning = {4,3};
				return returning;
			}
			else if(tiers[3][2] == 'c'){
				int[] returning = {4,0};
				return returning;
			}
			else if(tiers[3][3] == 'a'){
				int[] returning = {4,4};
				return returning;
			}
			else if(tiers[3][3] == 'b'){
				int[] returning = {4,0};
				return returning;
			}
			else if(tiers[3][3] == 'c'){
				int[] returning = {4,2};
				return returning;
			}
			else if(tiers[3][4] == 'a'){
				int[] returning = {4,1};
				return returning;
			}
			else if(tiers[3][4] == 'b'){
				int[] returning = {4,5};
				return returning;
			}
			else if(tiers[3][4] == 'c'){
				int[] returning = {4,0};
				return returning;
			}
			else if(tiers[3][5] == 'a'){
				int[] returning = {4,5};
				return returning;
			}
			else if(tiers[3][5] == 'b'){
				int[] returning = {4,0};
				return returning;
			}
			else if(tiers[3][5] == 'c'){
				int[] returning = {4,4};
				return returning;
			}
		}
		else if(tiersFinished[5] == false){
			if(tiers[4][0] == 'a'){
				int[] returning = {5,0};
				return returning;
			}
			else if(tiers[4][0] == 'b'){
				int[] returning = {5,1};
				return returning;
			}
			else if(tiers[4][0] == 'c'){
				int[] returning = {5,2};
				return returning;
			}
			else if(tiers[4][1] == 'a'){
				int[] returning = {5,3};
				return returning;
			}
			else if(tiers[4][1] == 'b'){
				int[] returning = {5,1};
				return returning;
			}
			else if(tiers[4][1] == 'c'){
				int[] returning = {5,0};
				return returning;
			}
			else if(tiers[4][2] == 'a'){
				int[] returning = {5,1};
				return returning;
			}
			else if(tiers[4][2] == 'b'){
				int[] returning = {5,2};
				return returning;
			}
			else if(tiers[4][2] == 'c'){
				int[] returning = {5,0};
				return returning;
			}
			else if(tiers[4][3] == 'a'){
				int[] returning = {5,1};
				return returning;
			}
			else if(tiers[4][3] == 'b'){
				int[] returning = {5,4};
				return returning;
			}
			else if(tiers[4][3] == 'c'){
				int[] returning = {5,0};
				return returning;
			}
			else if(tiers[4][4] == 'a'){
				int[] returning = {5,2};
				return returning;
			}
			else if(tiers[4][4] == 'b'){
				int[] returning = {5,5};
				return returning;
			}
			else if(tiers[4][4] == 'c'){
				int[] returning = {5,0};
				return returning;
			}
			else if(tiers[4][5] == 'a'){
				int[] returning = {5,5};
				return returning;
			}
			else if(tiers[4][5] == 'b'){
				int[] returning = {5,2};
				return returning;
			}
			else if(tiers[4][5] == 'c'){
				int[] returning = {5,0};
				return returning;
			}
		}
		int[] returning = {6,0};
		return returning;
	}
	
    //Finds total score when needed. Yay!
	public void totalScore(ProgressInGame n){
		int[] compare = n.nextEventToBeDone();
		if(compare[0] == 4 && compare[1] == 0){
			
		}
	}
}
