package ashuproject;

 public class Inheritance 
 {
public static void main(String[] args)
{	
  Ashu obj = new Ashu();
  obj.add(10,20);
  obj.sub(30,10);
  obj.mul(10,10);
}
 }
  class Ashut
 {
 public  void add(int a,int b)
	  {
		  System.out.println("sum of two num is"+(a+b));
	  }
	public void sub(int a,int b)
	{
		System.out.println("sub of two num is"+(a-b));
	}
 }
 
	  class Ashu extends Ashut
	{
		public void mul(int a,int b)
		{
			System.out.println("mul is"+(a*b));
		}
		
	}

