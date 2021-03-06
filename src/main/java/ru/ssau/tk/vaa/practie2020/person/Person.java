package ru.ssau.tk.vaa.practie2020.person;

public class Person {
    private String firstName;
    private String lastName;
    private int passportID;
    private Gender gender;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passportID) {
        this.passportID = passportID;
    }

    public Person(String firstName, String lastName, int passportID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
    }

    public Person(String firstName, String lastName, int passportID, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
        this.gender = gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportID(int passportID) {
        this.passportID = passportID;
    }

    public Gender getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassportID() {
        return passportID;
    }
}

