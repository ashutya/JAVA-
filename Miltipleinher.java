package ashuproject;

public class Miltipleinher {

	public static void main(String[] args) {
		d obj = new d();
		obj.print();
		obj.show();
	}
}
interface bd
{
	 void show();
}
interface Tyagi
{
	 void print();
}
class d implements bd,Tyagi
{
	public void show()
	{
		System.out.println("hello show method");
	}
	public void print()
	{
		System.out.println("hello print method");
	}
}