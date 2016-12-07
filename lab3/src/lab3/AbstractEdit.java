package lab3;

public abstract class AbstractEdit {

	protected boolean save = false;
	protected String startOfText;
	protected String endOfText;
	
	protected boolean saving(String line)
	{
		if(line.equals(startOfText)) 
			save = true;
		if(line.equals(endOfText))
			save=false;
		return save;
	}
	
	protected  boolean dateOrOffice (String line)
	{
		if(line.contains("Kancelaria Sejmu"))
			return true;
		for(char ch : line.toCharArray())
		{
			if(Character.isLetter(ch))
				return false;
		}
		return true;
	}
	
	protected String formatLine(String line)
	{
		if(!line.endsWith("-"))
			return line + "\n";
		else
		{
			StringBuilder tmp = new StringBuilder(line);
			tmp.deleteCharAt(tmp.length()-1);
			int space = tmp.lastIndexOf(" ");
			tmp.setCharAt(space, '\n');
			return new String(tmp);
		}
	}
	
}
