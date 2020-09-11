package ru.ssau.tk.vaa.practie2020.person;

public class Main extends Person {

    public static void main(String[] args) {
        Person number1 = new Person();
        number1.setFirstName("Anton");
        number1.setLastName("Voevodin");
        number1.setPassportID(12345);

        Person number2 = new Person();
        number2.setFirstName("Pavel");
        number2.setLastName("Ivanov");
        number2.setPassportID(6789);
    }
}
