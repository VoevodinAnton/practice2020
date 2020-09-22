package ru.ssau.tk.vaa.practie2020.Operation;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {
    public static final double ACCURACY = 0.000005;

    @Test
    public void applyTest() {
        SqrtOperation operator = new SqrtOperation();

        assertEquals(operator.apply(4), 2.0);
        assertEquals(operator.apply(2), Math.sqrt(2), ACCURACY);
        assertEquals(operator.apply(10), Math.sqrt(10), ACCURACY);

    }

    @Test
    public void applyInfinityTest() {
        SqrtOperation operator = new SqrtOperation();

        assertTrue(Double.isInfinite(operator.apply(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void applyNanTest() {
        SqrtOperation operator = new SqrtOperation();

        assertTrue(Double.isNaN(operator.apply(Double.NaN)));
    }

    @Test
    public void applyTripleTest(){
        SqrtOperation operator = new SqrtOperation();

        assertEquals(operator.applyTriple(8), 1.296839, ACCURACY);
    }
}