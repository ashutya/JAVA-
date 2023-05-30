package ashuproject;

public class Exception {

	public static void main(String[] args) {
		int a=10,b=5,c=5,x,y;
		try 
		{
			x=a/(b-c);
		}
		catch(ArithmeticException e)
		{
		    	System.out.println("divide by zero");
		}
       y=a/(b+c);
       System.out.println("y="+y);
	}
}
