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

}