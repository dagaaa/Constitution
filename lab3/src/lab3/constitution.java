package lab3;

import java.io.IOException;

public class constitution {

	public static void main(String[] args) {
		
		FileReaderr file =new FileReaderr("C:\\obiektowe-lab-master\\obiektowe-lab-master\\lab8\\konstytucja.txt");
		try{
		file.OpenFile();
		for(String chain : file.text)
		{
			System.out.println(chain);
		}
		}
		catch(IOException ex){
			System.out.println(ex);
			
		}
		

	}

}
