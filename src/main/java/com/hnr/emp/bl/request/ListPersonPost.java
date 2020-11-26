/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.emp.bl.request;

import com.hnr.emp.bl.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ListPersonPost {

    private List<Person> persons = new ArrayList<>();

    public ListPersonPost() {
    }

    public ListPersonPost(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

}
