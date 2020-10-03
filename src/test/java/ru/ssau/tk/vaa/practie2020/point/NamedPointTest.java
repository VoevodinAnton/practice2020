package ru.ssau.tk.vaa.practie2020.point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {

    @Test
    public void testSetName() {
        NamedPoint point = new NamedPoint();
        point.setName("Alpha");

        assertEquals(point.getName(), "Alpha");
    }

    @Test
    public void testGetName() {
        NamedPoint point = new NamedPoint(1.0,2.0,3.0,"Gamma");

        assertEquals(point.x, 1.0);
        assertEquals(point.y, 2.0);
        assertEquals(point.z, 3.0);
        assertEquals(point.getName(), "Gamma");
    }

    @Test
    public void testDefaultConstructor(){
        NamedPoint point = new NamedPoint();

        assertEquals(point.x, 0.0);
        assertEquals(point.y, 0.0);
        assertEquals(point.z,0.0);
        assertEquals(point.getName(), "Origin");
    }
}