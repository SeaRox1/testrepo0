package exception;

public class Calculatrice {

	
	public double divisio(int a, int b) throws DException
	{
		
		if (b==0) throw new DException();
		else return a/b;

	}
	
	
}
