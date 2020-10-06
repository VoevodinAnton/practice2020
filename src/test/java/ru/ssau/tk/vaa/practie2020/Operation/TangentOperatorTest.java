package ru.ssau.tk.vaa.practie2020.Operation;

import org.testng.annotations.Test;

import javax.validation.constraints.Null;

import static org.testng.Assert.*;

public class TangentOperatorTest {
    public static final double ACCURACY = 0.000005;

    @Test
    public void applyTest() {
        TangentOperator operator = new TangentOperator();

        assertEquals(operator.apply(Math.PI), 0.0, ACCURACY);
    }

    @Test
    public void applyInfinityTest() {
        TangentOperator operator = new TangentOperator();

        assertEquals(operator.apply(Math.PI / 2), 1.633123935319537E16);
        assertEquals(operator.apply(-Math.PI / 2), -1.633123935319537E16);
    }

    public void applyNanTest() {
        TangentOperator operator = new TangentOperator();

        assertTrue(Double.isNaN(operator.apply(Double.NaN)));
    }

    @Test
    public void applyTripleTest() {
        TangentOperator operator = new TangentOperator();

        assertEquals(operator.applyTriple(Math.PI), 0.0, ACCURACY);
    }

}