package ru.ssau.tk.vaa.practie2020.IntGenerator;

public class IntGeneratorImpl implements IntGenerator {
    private int counter = 0;

    public int nextInt() {
        return counter++;
    }
}
