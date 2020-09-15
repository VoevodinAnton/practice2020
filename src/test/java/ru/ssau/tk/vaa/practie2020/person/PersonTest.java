package ru.ssau.tk.vaa.practie2020.person;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testGetSet() {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setFirstName("Anton");
        person1.setLastName("Voevodin");
        person1.setPassportID(1234);

        person2.setFirstName("Pavel");
        person2.setLastName("Ivanov");
        person2.setPassportID(1);

        assertEquals(person1.getFirstName(), "Anton");
        assertEquals(person1.getLastName(), "Voevodin");
        assertEquals(person1.getPassportID(), 1234);

        assertEquals(person2.getFirstName(), "Pavel");
        assertEquals(person2.getLastName(), "Ivanov");
        assertEquals(person2.getPassportID(), 1);

    }
}