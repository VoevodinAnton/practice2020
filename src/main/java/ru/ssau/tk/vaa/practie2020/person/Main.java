package ru.ssau.tk.vaa.practie2020.person;

public class Main extends Person {

    public static void main(String[] args) {
        Person anton = new Person();
        anton.setFirstName("Anton");
        anton.setLastName("Voevodin");
        anton.setPassportID(12345);

        Person pavel = new Person();
        pavel.setFirstName("Pavel");
        pavel.setLastName("Ivanov");
        pavel.setPassportID(6789);

        Person kirill = new Person("Kirill", "Petrov", 2468);
        Person vika = new Person("Vika", "Semenova");
        Person misha = new Person(1357);
        Person sonya = new Person();
    }
}
