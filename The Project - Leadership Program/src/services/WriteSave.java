package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteSave {
	public static void saveData(ProgressInGame thisIsIt){
		try {	
			//Make new instance of file
            File file = new File("Progress.lead");
	
			//Delete file first
            file.delete();
	
			//If file doesn't exist, then create it. Yay.
			if (!file.exists()) {
				file.createNewFile();
			}			
	
			//Writes current progress to file (with a for loop!)
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for(int n = 0; n <= 4; n++){
				bw.write("" + thisIsIt.isEventDone(n));
			}
			bw.newLine();
			for(int y= 0; y < 1; y++){
				bw.write(thisIsIt.tierOne[y]);
			}
			bw.newLine();
			for(int y = 0; y < 3; y++){
				bw.write(thisIsIt.tierTwo[y]);
			}
			bw.newLine();
			for(int y = 0; y < 6; y++){
				bw.write(thisIsIt.tierThree[y]);
			}
			bw.newLine();
			for(int y = 0; y < 6; y++){
				bw.write(thisIsIt.tierFour[y]);
			}
			bw.newLine();
			for(int y = 0; y < 6; y++){
				bw.write(thisIsIt.tierFive[y]);
			}
			//Closes BufferedWriter
            bw.close();
			System.out.println("Updated...[success]");
		} 
		//Exception catching service. Don't you just love exceptions?
        catch (IOException e) {
			e.printStackTrace();
			System.out.println("Write IOException " + e + "...[fail]");
		}	
	}
}
