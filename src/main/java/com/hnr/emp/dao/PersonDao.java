/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.emp.dao;

import com.hnr.emp.bl.Person;
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
        for (Person person : list) {
            if (person.getAge() == id) {
                return person;
            }
        }
        return null;
    }

}
