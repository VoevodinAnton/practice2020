package ru.ssau.tk.vaa.practie2020.point;

public class Main {
    public static void main(String[] args) {
        Point point123 = new Point(1, 2, 3);
        Point point398 = new Point(0, 9, 8);
        Point point473 = new Point(4, 7, 3);
        Point point = Points.vectorProduct(point123, point398);
        System.out.println(point.y);
    }
}
