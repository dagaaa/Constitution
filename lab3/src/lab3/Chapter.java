package lab3;

public class Chapter extends AbstractEdit {

	Chapter(Arguments arguments)
	{
		this.startOfText= "Rozdział " + arguments.start;
		this.endOfText= "Rozdział " + arguments.finish;
	}
	
	
}
