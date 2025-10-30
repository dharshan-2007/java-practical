import java.util.*;
class RandomNumberGenerator extends Thread{
    public void run()
    {
        Random rand=new Random();
        while(true) { 
            int num=rand.nextInt(100);
            if(num%2==0)
            {
                new Square(num).start();
            }
            else{
                new Cube(num).start();
            }
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
class Square extends Thread
{
    int a;
    Square(int n)
    {
        a=n;
    }
    public void run()
    {
        System.out.println("Square : "+(a*a));
    }
}
class Cube extends Thread{
    int a;
    Cube(int n)
    {
        a=n;
    }
    public void run()
    {
        System.out.println("Cube : "+(a*a*a));
    }
}

public class MultiThread
{
    public static void main(String[] args) {
        RandomNumberGenerator ram=new RandomNumberGenerator();
        ram.start();
    }
}