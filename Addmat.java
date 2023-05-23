package ashuproject;

import java.util.Scanner;

public class Addmat {

	public static void main(String[] args) {
		add7 obj = new add7();
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for first matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the value for second matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		     obj.add(a,b);
		     sc.close();
	}
	

}

 class add7
{
	void add(int a[][],int b[][])
	{
		int c[][] = new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("add matrix is");
		for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
		}
		
	}
	
}
