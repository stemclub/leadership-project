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
		for(int x = 0; x < 5; x++){
			int tierDone = reader.nextInt();
			boolean enter;
			if(tierDone == 0){
				enter = false;
			}
			else{
				enter = true;
			}
			tiersFinished[x] = enter;
		}
		reader.
	}
}
