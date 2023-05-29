package ashuproject;

public class Exception2 {

	public static void main(String[] args) {
		
try {
	int a[]=new int[5];
	a[5]=30/0;
}
   catch(ArithmeticException e)
{
	   System.out.println("arithmetic exception");
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("index out of bound exception");
}
finally {
	System.out.println("finally block is always execute");
}

System.out.println("MULTIPEL CATCH BLOCK");
	}

}
