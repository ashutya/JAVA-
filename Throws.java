package ashuproject;
import java.io.IOException;
import java.lang.Exception;

public class Throws {

	public static void main(String[] args) {
		ashu9 obj  = new ashu9();
		obj.p();
		System.out.println("ASHU TYAGI");

	}

}
class ashu9{
	void ashu()throws IOException{
		throw new IOException("device error");
	}
	void as()throws IOException{
		ashu();
	}
	void p()
	{
		try
		{
			as();
		}
		catch(Exception e){
			System.out.println("exception is handeld");
			
		}
		
	}
}
