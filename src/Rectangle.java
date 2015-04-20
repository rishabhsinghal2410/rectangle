import java.lang.System;

public class Rectangle{

    int breadth;
    int length;

    public Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea()
    {
        return this.length*this.breadth;
    }

    public static void main(String a[]){
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("Rectangle area is :" + rectangle.getArea());
    }
}