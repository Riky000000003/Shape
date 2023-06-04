package org.example;

public class Hexagon extends Shape
{
    private double side;
    private double apotema;
    private double constant = 0.866;


    public Hexagon(double cPointX, double cPointY, double side)
    {
        super(cPointX, cPointY);
        setSide(side);
        this.side = getSide();
    }

    public Hexagon(double side)
    {
        setSide(side);
        this.side = getSide();
    }

    public Hexagon()
    {
        this.side = 0.0;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side)
    {
        if(side<=0)
        {
            this.side= 0.0;
        }
        else
        {
            this.side = side;
        }
    }

    public double getApotema()
    {
        apotema = getSide()*constant;
        return apotema;
    }

    @Override
    public double area() {
        return perimeter()*(getApotema()/2);
    }

    @Override
    public double perimeter() {
        return getSide()*6;
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
