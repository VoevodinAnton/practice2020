package ru.ssau.tk.vaa.practie2020.IntGenerator;

public class ResettableIntGenerator extends IntGeneratorImpl implements IntGenerator, Resettable {

    public int NextInt() {
        return super.nextInt();
    }

    public void reset() {

    }
}
