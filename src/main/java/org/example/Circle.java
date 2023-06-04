package org.example;

public class Circle extends Shape
{
    private double radius;


    public Circle(double cPointX, double cPointY, double radius) {
        super(cPointX, cPointY);
        setRadius(radius);
        this.radius = getRadius();
    }

    public Circle(double radius) {
        setRadius(radius);
        this.radius = getRadius();
    }

    public Circle()
    {
        this.radius = 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if(radius<=0)
        {
            this.radius = 0.0;
        }
        else
        {
            this.radius = radius;
        }
    }

    @Override
    public double area() {
        return getRadius()*getRadius()*Math.PI;
    }

    @Override
    public double perimeter() {
        return 2*getRadius()*Math.PI;
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
