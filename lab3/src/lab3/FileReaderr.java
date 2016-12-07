package lab3;
import java.io.IOException;
import java.util.LinkedList;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileReaderr {

	private String path;
	public LinkedList<String> text = new LinkedList<String>();
	public FileReaderr(String path)
	{
		this.path=path;
	}
	
	public void OpenFile() throws IOException
	{ 
		FileReader file = new FileReader(path);
        BufferedReader readText = new BufferedReader(file);
         
        String lines;
        
        while((lines = readText.readLine()) != null){
            text.add(lines);
        }
        readText.close();
         
       
		
		
	}
	

}
