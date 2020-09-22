package ru.ssau.tk.vaa.practie2020.Operation;

public class SqrtOperation extends Operation {
    public double apply(double number) {
        if (number < 0) {
            throw new ArithmeticException("Нельзя извлечь корень из отрицательного числа");
        } else
            return Math.sqrt(number);
    }
}
