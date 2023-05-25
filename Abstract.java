package ashuproject;

public class Abstract {
    public static void main(String args[])
    {
    	add b = new add();
    	b.mul();
    }
}
abstract class z
        {
		abstract void mul();
z()
{
		System.out.println("z constructor is called");
}
 }

class add extends z
{
	public void mul()
	{
		int a=2,b=5;
		System.out.println("mul is="+(a*b));
	}
	add()
	{
		System.out.println("child class constructor is called ");
	}
}
      

