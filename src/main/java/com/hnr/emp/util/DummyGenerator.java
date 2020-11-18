/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.emp.util;

import com.hnr.emp.bl.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author macbook
 */
public class DummyGenerator {

    public static List<Person> generatePerson(int size) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int age = ThreadLocalRandom.current().nextInt(20, 50 + 1);
            int randGender = ThreadLocalRandom.current().nextInt(2);
            String gender = "LP".substring(randGender, randGender + 1);
            Person p = new Person(i, "Person " + i, age, gender);
            persons.add(p);
        }
        return persons;
    }

}
