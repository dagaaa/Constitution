package lab3;

public class Article extends AbstractEdit{
	
	Article(Arguments arguments)
	{
		this.startOfText= "Art. " + arguments.start;
		this.endOfText= "Art. " + arguments.finish;
	}

	private String deleteChapters(String line)
	{
		if(line.startsWith("Rozdział") || IfAllUpper(line))
			return "";
		else return line;
	}
	
	private boolean IfAllUpper(String line)
	{
		for(char ch : line.toCharArray())
		{
			if(!Character.isUpperCase(ch))
				return false;
		}
		return true;
	}
}
