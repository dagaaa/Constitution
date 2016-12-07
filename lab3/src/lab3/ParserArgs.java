package lab3;

public class ParserArgs {

	public Arguments parseArg(String [] arg)
	{
		if(arg.length>4 || arg.length<3)
			throw new IllegalArgumentException("You passed wrong number of parameters");
		return null;
	}
	 
	
}
 