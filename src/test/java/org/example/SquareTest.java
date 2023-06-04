package org.example;

import junit.framework.TestCase;

public class SquareTest extends TestCase {

    public void testTestToString()
    {
        Square s1 = new Square();
        Square s2 = new Square(5);
        Square s3 = new Square(1.5,2.5,5);

        //primo test
        String risposta = "Shape: cPointX=" + "0.0" + ", cPointY=" + "0.0";
        assertEquals(risposta,s1.toString());
        assertEquals(s1.getSide(),0.0);

        //secondo test
        assertEquals(risposta,s2.toString());
        assertEquals(s2.getSide(),5.0);
        s2.setSide(7.0);
        assertEquals(s2.getSide(),7.0);

        //terzo test
        String risposta2 = "Shape: cPointX=" + "1.5" + ", cPointY=" + "2.5";
        assertEquals(risposta2,s3.toString());
        assertEquals(s3.getSide(),5.0);
    }

    public void testSetSide()
    {
        Square s1 = new Square(5);
        assertEquals(s1.getSide(),5.0);
        Square s2 = new Square(-10);
        assertEquals(s2.getSide(),0.0);
    }

    public void testArea()
    {
        Square s3 = new Square(1.5,2.5,5);
        assertEquals(s3.area(),25.0);
        assertEquals(s3.perimeter(),20.0);
    }
}