package ru.ssau.tk.vaa.practie2020.person;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testFirstName() {
        Person person1 = new Person();


        assertNull(person1.getFirstName());
        person1.setFirstName("Anton");
        assertEquals(person1.getFirstName(), "Anton");
        person1.setFirstName(null);
        assertNull(person1.getFirstName());
    }

    @Test
    public void testLastName() {
        Person person1 = new Person();

        assertNull(person1.getLastName());
        person1.setLastName("Voevodin");
        assertEquals(person1.getLastName(), "Voevodin");
        person1.setLastName(null);
        assertNull(person1.getLastName());
    }

    @Test
    public void testPassportId() {
        Person person1 = new Person();

        assertEquals(person1.getPassportID(), 0);
        person1.setPassportID(1234);
        assertEquals(person1.getPassportID(), 1234);
    }

    @Test
    public void testGender() {
        Person person1 = new Person();

        person1.setGender(Gender.MALE);
        assertEquals(person1.getGender(), Gender.MALE);
    }

    @Test
    public void testConstructor() {
        Person person1 = new Person("Anton", "Voevodin");
        Person person2 = new Person(1234);
        Person person3 = new Person("Pavel", "Ivanov", 1);
        Person person4 = new Person("Artem", "Kashapov", 3213, Gender.MALE);

        assertEquals(person1.getFirstName(), "Anton");
        assertEquals(person1.getLastName(), "Voevodin");
        assertEquals(person1.getPassportID(), 0);

        assertNull(person2.getFirstName());
        assertNull(person2.getLastName());
        assertEquals(person2.getPassportID(), 1234);

        assertEquals(person3.getFirstName(), "Pavel");
        assertEquals(person3.getLastName(), "Ivanov");
        assertEquals(person3.getPassportID(), 1);

        assertEquals(person4.getFirstName(), "Artem");
        assertEquals(person4.getLastName(), "Kashapov");
        assertEquals(person4.getPassportID(), 3213);
        assertEquals(person4.getGender(), Gender.MALE);

    }
}