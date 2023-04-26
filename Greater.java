package ashuproject;

import java.util.Scanner;


public class Greater {

	public static void main(String[] args) {
      
	Scanner z = new Scanner(System.in);
	System.out.println("enter first number ");
	int a=z.nextInt();
	System.out.println("enter second number ");
	int b=z.nextInt();
	System.out.println("enter third number ");
	int c=z.nextInt();

	if( a > b && a > c)
	{
		System.out.println("a is greater");
	}
	else if(b>c)
	{
		System.out.println("b is greater");
	}
	else
	{
		System.out.println("c is greatest");
	}
	}
}     
