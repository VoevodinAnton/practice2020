package ru.ssau.tk.vaa.practie2020.Operation;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    @Test
    public void applyTest() {
        IdenticalOperation operator = new IdenticalOperation();

        assertEquals(operator.apply(3.1), 3.1);
        assertEquals(operator.apply(-2.1), -2.1);
        assertEquals(operator.apply(0), 0.0);

    }

    @Test
    public void applyInfinityTest() {
        IdenticalOperation operator = new IdenticalOperation();
        double TestPositiveInf = operator.apply(Double.POSITIVE_INFINITY);
        double TestNegativeInf = operator.apply(Double.NEGATIVE_INFINITY);

        assertTrue(Double.isInfinite(TestNegativeInf));
        assertTrue(Double.isInfinite(TestPositiveInf));
    }

    @Test
    public void applyNanTest() {
        IdenticalOperation operator = new IdenticalOperation();
        double TestNan = operator.apply(Double.NaN);

        assertTrue(Double.isNaN(TestNan));
    }

    @Test
    public void applyTripleTest() {
        IdenticalOperation operator = new IdenticalOperation();

        assertEquals(operator.applyTriple(3), 3.0);
        assertEquals(operator.applyTriple(-10), -10.0);
        assertEquals(operator.applyTriple(0), 0.0);
    }

}