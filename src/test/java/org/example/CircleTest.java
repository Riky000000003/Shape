package org.example;

import junit.framework.TestCase;

public class CircleTest extends TestCase {

    public void testArea()
    {
        Circle c = new Circle(2);
        assertEquals(c.area(), 12.56);
    }

    public void testPerimetro()
    {
        Circle c = new Circle(2);
        assertEquals(c.perimeter(),12.56);
    }
}