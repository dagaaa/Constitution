package lab3;

import java.io.IOException;

public class Chapter extends AbstractEdit {

	Chapter(Arguments arguments)
	{
		this.startOfText= "Rozdział " + arguments.start;
		this.endOfText= "Rozdział " + arguments.finish;
	}
	
	StringBuilder findChapt(FileReaderr file) throws IOException
	{
		StringBuilder result = new StringBuilder("");
		   for(String line : file.text)
		   {
			   if(saving(line) && !dateOrOffice(line) )
				   result.append(formatLine(line));
				   
			   
		   }
		   return result;
	}
}
