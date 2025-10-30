

abstract class Shape
{
    int x,y;
    abstract void printArea();
}

class Rectangle extends Shape
{
    public Rectangle(int a,int b)
    {
        x=a;y=b;
    }
    void printArea()
    {
        System.out.println("Area of Rectangle : "+(x*y));
    }
}

class Triangle extends Shape
{
    public Triangle(int a,int b)
    {
        x=a;y=b;
    }
    void printArea()
    {
        System.out.println("Area of Triangle : "+(0.5*x*y));
    }
}

class Circle extends Shape
{
    public Circle(int r)
    {
        x=r;
    }
    void printArea()
    {
        System.out.println("Area of Circle : "+(3.14*x*x));
    }
}

public class AbstractClass_Shape
{
    public static void main(String[] args) {
        {
            Rectangle r1=new Rectangle(10,20);
            Triangle t1=new Triangle(10,5);
            Circle c1=new Circle(15);
            r1.printArea();
            t1.printArea();
            c1.printArea();
        }
    }
}
