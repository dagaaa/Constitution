package lab3;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ParserArgs {

	
	String romanNumbers [] = {"I", "II", "III", "IV","V","VI","VII","VIII","IX","X","XI","XII","XIII"};
	public Arguments parseArg(String [] arg) throws FileNotFoundException
	{
		if(arg.length>3 || arg.length<2)
			throw new IllegalArgumentException("You passed wrong number of parameters");
		
		if (!Files.exists(Paths.get(arg[0])))
            throw new FileNotFoundException("This file doesn't exist");
		
		if(arg.length == 2)
		{
			if(isRoman(arg[1]))
				return new Arguments(arg[1], arg[1],false);
			else if(Integer.parseInt(arg[1])<244 && Integer.parseInt(arg[1]) >0 )
				return new Arguments(arg[1], arg[1], true );
			else throw new IllegalArgumentException("You passed wrong range of arguments");
		}
		else if (Integer.parseInt(arg[1])>0 && Integer.parseInt(arg[2])<244 && Integer.parseInt(arg[1])<Integer.parseInt(arg[2]) )
			return  new Arguments(arg[1], arg[2], true);
		else 
			throw new IllegalArgumentException("You passed wrong range of arguments");
	}
	 


	private boolean isRoman(String argument)
	{
		for(String number : romanNumbers)
		{
			if(number.equals(argument))
				return true;
		}
		
		return false;
	}
}
 