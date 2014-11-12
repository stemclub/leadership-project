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
		if(char1.charAt(0) == 'a'||char1.charAt(0) == 'b'||char1.charAt(0) == 'c'){
			chars1[0] = char1.charAt(0);
		}
		else{
			chars1[0] = 'z';
		}
		n.setTierOne(chars1);
		
		String char2 = reader.next();
		char[] chars2 = new char[3];
		System.out.println(char2);
		for(int x = 0; x<3; x++){
			if(char2.charAt(x) == 'a'||char2.charAt(x) == 'b'||char2.charAt(x) == 'c'){
				chars2[x] = char2.charAt(x);
			}
			else{
				chars2[x] = 'z';
			}
		}
		n.setTierTwo(chars2);
		
		String char3 = reader.next();
		char[] chars3 = new char[6];
		for(int x = 0; x<6; x++){
			if(char3.charAt(x) == 'a'||char3.charAt(x) == 'b'||char3.charAt(x) == 'c'){
				chars3[x] = char3.charAt(x);
			}
			else{
				chars3[x] = 'z';
			}
		}
		n.setTierThree(chars3);
		
		String char4 = reader.next();
		char[] chars4 = new char[6];
		for(int x = 0; x<6; x++){
			if(char4.charAt(x) == 'a'||char4.charAt(x) == 'b'||char4.charAt(x) == 'c'){
				chars4[x] = char4.charAt(x);
			}
			else{
				chars4[x] = 'z';
			}
		}
		n.setTierFour(chars4);
		
		String char5 = reader.next();
		char[] chars5 = new char[6];
		for(int x = 0; x<6; x++){
			if(char5.charAt(x) == 'a'||char5.charAt(x) == 'b'||char5.charAt(x) == 'c'){
				chars5[x] = char5.charAt(x);
			}
			else{
				chars5[x] = 'z';
			}
		}
		n.setTierFive(chars5);
	}
}
