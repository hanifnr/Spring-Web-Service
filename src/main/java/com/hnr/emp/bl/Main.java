/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.emp.bl;

import com.hnr.emp.dao.PersonDao;
import com.hnr.emp.util.DummyGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author macbook
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        PersonDao.getInstance().generate(DummyGenerator.generatePerson(5));
        System.out.println(PersonDao.getInstance().getAll().size());
    }

}
