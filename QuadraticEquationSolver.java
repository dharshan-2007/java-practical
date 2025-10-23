import java.util.Scanner;
public class QuadraticEquationSolver
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coefficients of a,b,c : ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=(b*b)-4*a*c;
        if(d>0)
        {
            System.out.println("The roots are real and diffrent");
            double root1=(-b+Math.sqrt(d))/(2*a);
            double root2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Root 1 : "+root1);
            System.out.println("Root 2 : "+root2);
        }
        else if(d==0)
        {
            System.out.println("The roots are real and equal");
            double root= -b/(2*a);
            System.out.println("Root : "+root);
        }
        else
        {
            System.out.println("The roots are imaginary");
            double root=-b/(2*a);
            double imaginary=Math.sqrt(d)/(2*a);
            System.out.println("Root : "+root+"+"+imaginary+"i");
            System.out.println("Root : "+root+"-"+imaginary+"i");   
        }
    }
}