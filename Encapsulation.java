package ashuproject;

public class Encapsulation {

	public static void main(String[] args) {
	student s1 = new student();
	s1.setname("ashu",11);
	System.out.println(s1.getname());
	System.out.println(s1.getid());
	
	}
}

 class student
{
	private String name;
	private int id;
	
	public String getname()
	{
		return name;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
}
 
 
