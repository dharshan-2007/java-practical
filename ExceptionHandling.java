public class ExceptionHandling
{
    public static void main(String[] args) {
        {
            try{
                int a=10,b=0;
                int res=a/b;
                System.out.println(a+" / "+b+" = "+res);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Cannot divide a number by zero");
            }
        }
    }
}