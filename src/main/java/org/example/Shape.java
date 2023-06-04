package org.example;

public class Shape {
    private double cPointX;
    private double cPointY;

    public Shape(double cPointX, double cPointY) {
        setcPointX(cPointX);
        setcPointY(cPointY);
    }

    public Shape() {
        this.cPointX = 0.0;
        this.cPointY = 0.0;
    }

    public double getcPointX() {
        return cPointX;
    }

    public void setcPointX(double cPointX) {
        this.cPointX = cPointX;
    }

    public double getcPointY() {
        return cPointY;
    }

    public void setcPointY(double cPointY) {
        this.cPointY = cPointY;
    }

    public double area(){
        return 0.0;
    };
    public  double perimeter(){
        return 0.0;
    };


    @Override
    public String toString() {
        return "Shape: cPointX=" + cPointX + ", cPointY=" + cPointY;
    }

    public String toString(double sommaArea, double sommaPerimetro) {
        return "Shape: Area=" + sommaArea + ", Perimetro=" + sommaPerimetro;
    }
}
