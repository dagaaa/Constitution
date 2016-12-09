package lab3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class constitution {

	public static void main(String[] args) {
		
		FileReaderr file =new FileReaderr(args[0]);
		try{
			Arguments arg= new  ParserArgs().parseArg(args);	
			file.OpenFile();
			System.out.println(parseText( arg, file));
			
		
		
		
		} catch (FileNotFoundException ex) {
            System.out.print(ex);
        } catch (NumberFormatException ex) {
            System.out.print("Second and Third parameters must be numbers! " + ex);
        } catch (IllegalArgumentException ex) {
            System.out.print(ex);
        } catch (IOException ex) {
            System.out.print("Problem with the file " + ex);
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
