/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.emp.dao;

import com.hnr.emp.bl.Person;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author macbook
 */
public class PersonDao extends BaseDao<Person> {

    private static PersonDao singleton;

    private PersonDao() {

    }

    public static synchronized PersonDao getInstance() {
        if (singleton == null) {
            singleton = new PersonDao();
        }
        return singleton;
    }

    public Person findById(int id) {
        return getPerson(id);
    }

    @Override
    public void add(Person t) throws Exception {
        Person person = getPerson(t.getId());
        if (person == null) {
            super.add(t); //To change body of generated methods, choose Tools | Templates.
        } else {
            throw new Exception("Id already exist");
        }
    }

    public void update(Person t, int id) throws Exception {
        Person person = getPerson(id);
        if (person != null) {
            person.setName(t.getName());
            person.setAge(t.getAge());
            person.setGender(t.getGender());
        } else {
            throw new Exception("Id not found");
        }
    }

    public void remove(int id) throws Exception {
        Person person = getPerson(id);
        if (person != null) {
            super.remove(person);
        }
    }

    private Person getPerson(int id) {
        return list.stream()
                .filter(x -> id == x.getId())
                .findAny()
                .orElse(null);
    }

}
