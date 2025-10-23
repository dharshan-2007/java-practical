import java.util.Scanner;
public class Fibonacci_Rec_NoRec
{ 

static int fibonacciRecursive(int n)
{
    if(n<=1)
    {
        return n;
    }
    return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
}

static void  fibonacciNonRecursive(int n)
{
    int a=0,b=1,c;
    System.out.println("Fibonacci Series");
    for(int i=0;i<n;i++)
    {
        System.out.println(a+"  ");
        c=a+b;
        a=b;
        b=c;
    }

}
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of terms : ");
    int n=sc.nextInt();
    System.out.println("Using Non recursive method");
    fibonacciNonRecursive(n);
    System.out.println("Using Recursive Method");
    for(int i=0;i<n;i++)
    {
        System.out.print(fibonacciRecursive(i)+"    ");
    }
}
}