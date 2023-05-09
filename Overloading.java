package ashuproject;

class Adder
{
    static int Add(int a,int b)
    {
        return(a+b);
    }
     static int Add(int a,int b,int c)
    {
        return(a+b+c);
    }
}
class Overloading
{
    public static void main(String args[])
    {
        System.out.println(Adder.Add(10,10));
    }
}