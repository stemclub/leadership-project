package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteSave {
	public static void saveData(ProgressInGame thisIsIt){
		try {	
			File file = new File("Progress.lead");
	
			file.delete();
	
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}			
	
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for(int n = 0; n <= 3; n++){
				bw.write(thisIsIt.isEventDone(n));
			}
			bw.close();
			System.out.println("Updated...[success]");
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Write IOException " + e + "...[fail]");
		}	
	}
}
