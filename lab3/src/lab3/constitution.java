package lab3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class constitution {

	public static void main(String[] args) {
		
		FileReaderr file =new FileReaderr("C:\\obiektowe-lab-master\\obiektowe-lab-master\\lab8\\konstytucja.txt");
		try{
			Arguments arg= new  ParserArgs().parseArg(args);	
			file.OpenFile();
			System.out.println(parseText( arg, file));
			
		
		
		
		} catch (FileNotFoundException ex) {
            System.out.print(ex);
        } catch (NumberFormatException ex) {
            System.out.print("2. and optionally 3. parameter must be numbers! " + ex);
        } catch (IllegalArgumentException ex) {
            System.out.print(ex);
        } catch (IOException ex) {
            System.out.print("We have some problems with the file. Check if it's OK and try again " + ex);
            ex.printStackTrace();
        }
		
		
	}
	
	static StringBuilder parseText(Arguments argument, FileReaderr files) throws IOException
	{
        if(argument.art) 
                return new Article(argument).findArt(files);
        else  return new Chapter(argument).findChapt(files);
	}

}
