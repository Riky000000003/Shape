package org.example;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {

    public void testArea()
    {
        Rectangle r = new Rectangle(5,5);
        assertEquals(r.area(), 25.0);
    }

    public void testPerimetro()
    {
        Rectangle r = new Rectangle();
        assertEquals(r.perimeter(),20.0);
    }
}