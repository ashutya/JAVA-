package ashuproject;

public class Accessspec {

	public static void main(String[] args) {
	Disk d = new Disk();
	d.display();

	}
}
class Disk
{
	protected void display() {
		System.out.println("hello this is private method");
	}
}
