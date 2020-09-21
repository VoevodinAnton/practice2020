package ru.ssau.tk.vaa.practie2020.point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {

    public static final double ACCURACY = 0.00005;

    private boolean equalsApproximately(double firstNum, double secondNum) {
        return Math.abs(firstNum - secondNum) <= ACCURACY;

    }

    private boolean equalsApproximately(Point first, Point second) {
        return Math.abs(first.x - second.x) <= ACCURACY && Math.abs(first.y - second.y) <= ACCURACY && Math.abs(first.z - second.z) <= ACCURACY;
    }

    @Test
    public void testEqualsApproximately() {
        Point point1 = new Point(1.5, 2.3, 4.6);
        Point point2 = new Point(1.5, 2.3000000003, 4.600000007);
        Point point3 = new Point(1, 2, 3);

        assertTrue(equalsApproximately(1.01, 1.01));
        assertTrue(equalsApproximately(point1, point2));
        assertFalse(equalsApproximately(point1, point3));
    }

    @Test
    public void testSum() {
        Point point1 = new Point(2.3, 3.1, 1.4);
        Point point2 = new Point(1.6, 7.5, 3.4);
        Point resultsTest = Points.sum(point1, point2);
        Point results = new Point(3.9, 10.6, 4.8);

        assertTrue(equalsApproximately(results, resultsTest));
    }

    @Test
    public void testSubtract() {
        Point point1 = new Point(1.4, 4.5, 1.2);
        Point point2 = new Point(1.2, 3.5, 1);
        Point resultsTest = Points.subtract(point1, point2);
        Point results = new Point(0.2, 1.0, 0.2);

        assertTrue(equalsApproximately(results, resultsTest));
    }

    @Test
    public void testMultiply() {
        Point point1 = new Point(1.1, 3.4, 2.6);
        Point point2 = new Point(3.6, 1.2, 2.3);
        Point resultsTest = Points.multiply(point1, point2);
        Point results = new Point(3.96, 4.08, 5.98);

        assertTrue(equalsApproximately(results, resultsTest));
    }

    @Test
    public void testDivide() {
        Point point1 = new Point(1.0, 2.0, 3.0);
        Point point2 = new Point(3.0, 3.0, 6.0);
        Point resultsTest = Points.divide(point1, point2);
        Point results = new Point(0.3333333, 0.6666666, 0.5);

        assertTrue(equalsApproximately(results, resultsTest));

    }

    @Test
    public void testEnlarge() {
        Point point1 = new Point(1.4, 1.1, 2.3);
        double x = 10;
        Point resultsTest = Points.enlarge(point1, x);
        Point results = new Point(14, 11, 23);

        assertTrue(equalsApproximately(results, resultsTest));
    }

    @Test
    public void testOpposite() {
        Point point1 = new Point(2.1, 4.5, 3.9);
        Point resultTest = Points.opposite(point1);
        Point result = new Point(-2.1, 1.1, 2.3);

        assertTrue(equalsApproximately(result, resultTest));
    }

    @Test
    public void testInverse() {
        Point point1 = new Point(4.3, 1.8, 2.5);
        Point resultsTest = Points.inverse(point1);
        Point result = new Point(1 / 4.3, 1 / 1.8, 1 / 2.5);

        assertTrue(equalsApproximately(result, resultsTest));
    }

    @Test
    public void testScalarProduct() {
        Point point1 = new Point(1.8, 3.4, 5.5);
        Point point2 = new Point(2.4, 1.6, 3.1);
        double resultsTest = Points.scalarProduct(point1, point2);
        double results = 26.81;

        assertTrue(equalsApproximately(results, resultsTest));
    }

    @Test
    public void testVectorProduct() {
        Point point1 = new Point(1.4, 1.9, 5.6);
        Point point2 = new Point(1.9, 6.3, 3.4);
        Point resultsTest = Points.vectorProduct(point1, point2);
        Point results = new Point(-28.82, 5.88, 5.21);

        assertTrue(equalsApproximately(results, resultsTest));
    }
}