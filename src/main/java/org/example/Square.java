package org.example;

public class Square extends Shape
{
    private double side;

    public Square(double cPointX, double cPointY, double side)
    {
        super(cPointX, cPointY);
        setSide(side);
        this.side = getSide();
    }

    public Square(double side)
    {
        setSide(side);
        this.side = getSide();
    }

    public Square()
    {
        this.side = 0.0;
    }

    @Override
    public double area() {
        return getSide()*getSide();
    }

    @Override
    public double perimeter()
    {
        return getSide()*4;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        if(side<=0)
        {
            this.side=0.0;
        }
        else
        {
            this.side = side;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toString(double sommaArea, double sommaPerimetro) {
        return super.toString(sommaArea, sommaPerimetro);
    }
}
