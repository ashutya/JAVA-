import java.util.Scanner;
public class greater {
    public static void main(String args[])
    {
        System.out.println("enter two number");
        Scanner sc = new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

       if(a==b)
       {
        System.out.println("a and b are equal");
       } 
       else if(a>b)
       {
        System.out.println("a is greater");
       }
       else{
        System.out.println("b is greater");
       }
    }
    
}
