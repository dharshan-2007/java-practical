
import javax.swing.plaf.synth.SynthPanelUI;

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
        ("Area of Circle : "+(3.14*x*x));
    }
}