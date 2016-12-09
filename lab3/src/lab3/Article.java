package lab3;

import java.io.IOException;

public class Article extends AbstractEdit{
	
	Article(Arguments arguments)
	{
		this.startOfText= "Art. " + arguments.start+".";
		this.endOfText= "Art. " + arguments.finish+".";
	}

	StringBuilder findArt(FileReaderr file) throws IOException
	{
		StringBuilder result = new StringBuilder("");
		   for(String line : file.text)
		   {
			   if(saving(line) && !dateOrOffice(line) && !chapterHeader(line))
				   result.append(formatLine(line));
				   
			   
		   }
		   return result;
	}
	
	
	
	private boolean chapterHeader(String line)
	{
		if(line.startsWith("Rozdział") || IfAllUpper(line))
			return true;
		else return false;
	}
	
	private boolean IfAllUpper(String line)
	{
		for(char ch : line.toCharArray())
		{
			if(!(Character.isUpperCase(ch) || Character.isSpaceChar(ch)))
				return false;
		}
		return true;
	}
}
