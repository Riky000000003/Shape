package org.example;

import junit.framework.TestCase;

public class HexagonTest extends TestCase {

    public void testArea()
    {
        Hexagon h = new Hexagon(1);
        assertEquals(h.area(), 2.598);
    }

    public void testPerimetro()
    {
        Hexagon h = new Hexagon(1);
        assertEquals(h.perimeter(),6.0);
    }
}