package Git;

import java.util.*;
abstract class Shape
{
    Scanner sc = new Scanner(System.in);

    abstract void area();
}
class Triangle extends Shape
{
    double b,h,ar;
    void area()
    {
        b = 10;
        h = 4;
        ar = 0.5 * b * h;
        System.out.println("Area of Triangle = " + ar);
    }
}
class Rectangle extends Shape
{
    double l,b,ar;
    void area()
    {
        l = 8;
        b = 7;
        ar = l * b;
        System.out.println("Area of Rectangle = " + ar);
    }
}
class Circle extends Shape
{
    double r,ar;
    void area()
    {
        r = sc.nextInt();
        ar = 3.14 * r * r;
        System.out.println("Area of Circle = " + ar);
    }
}
public class Shapes 
{
    public static void main(String[] args) 
    {
        Triangle t = new Triangle();
        t.area(); 
        Rectangle r = new Rectangle();
        r.area();
        Circle c = new Circle();
        c.area();   
    }
}
