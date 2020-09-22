package ru.ssau.tk.vaa.practie2020.Operation;

public abstract class Operation {
    public abstract double apply(double number);

    public double applyTriple(double number) {
        return apply(apply(apply(number)));
    }

}
