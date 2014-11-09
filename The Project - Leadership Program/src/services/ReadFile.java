package services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void read(ProgressInGame n)throws FileNotFoundException{
		File progress = new File("Progress.lead");
		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(progress);
		boolean[] tiersFinished = new boolean[5];
		String tierDone = reader.next();
		System.out.println(tierDone);
		for(int x = 0; x < 5; x++){
			int isTierDone = (int)tierDone.charAt(x);
			boolean enter;
			if(isTierDone == 0){
				enter = false;
			}
			else{
				enter = true;
			}
			tiersFinished[x] = enter;
		}
		String char1 = reader.next();
		System.out.println(char1);
		char[] chars1 = new char[1];
		chars1[0] = char1.charAt(0);
		n.setTierOne(chars1);
		
		String char2 = reader.nextLine();
		char[] chars2 = new char[3];
		for(int x = 0; x<3; x++){
			chars2[x] = char2.charAt(x);
		}
		n.setTierTwo(chars2);
		
		String char3 = reader.nextLine();
		char[] chars3 = new char[6];
		for(int x = 0; x<6; x++){
			chars3[x] = char3.charAt(x);
		}
		n.setTierThree(chars3);
		
		String char4 = reader.nextLine();
		char[] chars4 = new char[6];
		for(int x = 0; x<6; x++){
			chars3[x] = char4.charAt(x);
		}
		n.setTierFour(chars4);
		
		String char5 = reader.nextLine();
		char[] chars5 = new char[6];
		for(int x = 0; x<6; x++){
			chars3[x] = char5.charAt(x);
		}
		n.setTierFive(chars5);
	}
}
