package ru.ssau.tk.vaa.practie2020.point;

public class Points {

    private Points() {
    }

    public static Point sum(Point a, Point b) {
        return new Point(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public static Point subtract(Point a, Point b) {
        return new Point(a.x - b.x, a.y - b.y, a.z - b.z);
    }

    public static Point multiply(Point a, Point b) {
        return new Point(a.x * b.x, a.y * b.y, a.z * b.z);
    }

    public static Point divide(Point a, Point b) {
        if (b.x == 0 || b.y == 0 || b.z == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return new Point(a.x / b.x, a.y / b.y, a.z / b.z);
    }

    public static Point enlarge(Point a, double number) {
        return new Point(a.x * number, a.y * number, a.z * number);
    }
}
