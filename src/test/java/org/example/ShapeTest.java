package org.example;

import junit.framework.TestCase;

public class ShapeTest extends TestCase {

    public void testSetcPointX()
    {
        Shape s = new Shape(0, -1) {
            @Override
            public double area() {
                return 0;
            }

            @Override
            public double perimeter() {
                return 0;
            }
        };
        assertEquals(s.getcPointX(),0.0);
    }

    public void testSetcPointY()
    {
        Shape s = new Shape(0, -1);
        assertEquals(s.getcPointY(),-1);

    }

    public void testTestToString()
    {
        Shape s = new Shape();
        String risposta = "Shape: cPointX=" + "0.0" + ", cPointY=" + "0.0";
        assertEquals(risposta, s.toString());
    }

    public void testToString()
    {
        Shape[] s = new Shape[3];
        s[0] = new Square(1);
        s[1] = new Rectangle(1,1);
        s[2] = new Circle(1);

        double sommaArea = 0;
        double sommaPerimetro = 0;

        for(int i=0; i<s.length;i++)
        {
            sommaArea += s[i].area();
            sommaPerimetro += s[i].perimeter();
        }

        String risposta = "Shape: Area=" + "5.141592653589793" + ", Perimetro=" + "14.283185307179586";
        assertEquals(risposta, s[0].toString(sommaArea,sommaPerimetro));
    }

}