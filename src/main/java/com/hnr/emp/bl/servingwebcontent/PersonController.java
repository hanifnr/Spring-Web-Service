/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.emp.bl.servingwebcontent;

import com.hnr.emp.bl.Person;
import com.hnr.emp.dao.PersonDao;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author macbook
 */
@RestController
public class PersonController {

    @GetMapping("/person/all")
    public List<Person> getAll() {
        return PersonDao.getInstance().getAll();
    }

    @GetMapping("/person")
    public Person person(@RequestParam(name = "id", required = true) int id) {
        return PersonDao.getInstance().findById(id);
    }

}
