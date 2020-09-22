package ru.ssau.tk.vaa.practie2020.Operation;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperatorTest {
    public static final double ACCURACY = 0.000005;

    @Test
    public void applyTest() {
        TangentOperator operator = new TangentOperator();

        assertEquals(operator.apply(Math.PI), 0.0, ACCURACY);
    }

}