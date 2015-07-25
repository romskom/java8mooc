package lesson1;

import persons.Person;

import java.util.Comparator;

/**
 * Created by Роман on 19.07.2015.
 */
public class Exercise1 {

    Comparator<Person> comparator = (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName());

    Comparator<Person> comparator2 = (p1, p2) -> p1.getSurName().compareTo(p2.getSurName());

}
