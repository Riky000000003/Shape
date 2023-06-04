package org.example;

public class Rectangle extends Shape
{
    private double base;
    private double height;

    public Rectangle(double cPointX, double cPointY, double base, double height)
    {
        super(cPointX, cPointY);
        setBase(base);
        setHeight(height);
        this.base = getBase();
        this.height = getHeight();
    }

    public Rectangle(double base, double height)
    {
        setBase(base);
        setHeight(height);
        this.base = getBase();
        this.height = getHeight();
    }

    public Rectangle()
    {
        this.base = 0.0;
        this.height = 0.0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {

        if(base<=0)
        {
            this.base = 0.0;
        }
        else
        {
            this.base = base;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<=0)
        {
            this.height = 0.0;
        }
        else
        {
            this.height = height;
        }
    }

    @Override
    public double area() {
        return getBase()*getHeight();
    }

    @Override
    public double perimeter() {
        return 2*(getBase()+getHeight());
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
