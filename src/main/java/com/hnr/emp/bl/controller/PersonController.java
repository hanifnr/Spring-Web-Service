/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.emp.bl.controller;

import com.hnr.emp.bl.Person;
import com.hnr.emp.bl.request.ListPersonPost;
import com.hnr.emp.bl.response.BaseResponse;
import com.hnr.emp.bl.response.DefaultContent;
import com.hnr.emp.bl.response.ListDefaultContent;
import com.hnr.emp.dao.PersonDao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author macbook
 */
@RestController
public class PersonController {

    @GetMapping("/person")
    public Person person(@RequestParam(name = "id", required = true) int id) {
        return PersonDao.getInstance().findById(id);
    }

    @PostMapping("/person")
    public BaseResponse insert(@RequestBody Person person) {
        try {
            PersonDao.getInstance().add(person);

            return new BaseResponse(true, new DefaultContent("Data successfully inserted"));
        } catch (Exception ex) {
            return new BaseResponse(false, new DefaultContent(ex.getMessage()));
        }
    }

    @PutMapping("/person/{id}")
    public BaseResponse update(@RequestBody Person person, @PathVariable int id) {
        try {
            PersonDao.getInstance().update(person, id);
            return new BaseResponse(true, new DefaultContent("Data successfully updated"));
        } catch (Exception ex) {
            return new BaseResponse(false, new DefaultContent(ex.getMessage()));
        }
    }

    @DeleteMapping("/person/{id}")
    public BaseResponse delete(@PathVariable int id) {
        try {
            PersonDao.getInstance().remove(id);
            return new BaseResponse(true, new DefaultContent("Data successfully deleted"));
        } catch (Exception ex) {
            return new BaseResponse(false, new DefaultContent(ex.getMessage()));
        }
    }

    @GetMapping("/person/all")
    public List<Person> getAll() {
        return PersonDao.getInstance().getAll();
    }

    @PostMapping("/person/all")
    public BaseResponse insertBulk(@RequestBody ListPersonPost listPersonPost) {
        ListDefaultContent listDefaultContent = new ListDefaultContent();
        for (Person person : listPersonPost.getPersons()) {
            ListDefaultContent.DefaultContent defaultContent;
            try {
                PersonDao.getInstance().add(person);
                defaultContent = new ListDefaultContent.DefaultContent(true, String.format("Id %s successfully inserted", person.getId()));
            } catch (Exception e) {
                defaultContent = new ListDefaultContent.DefaultContent(false, String.format("Id %s insert failed", person.getId()));
            }
            listDefaultContent.getContents().add(defaultContent);
        }
        return new BaseResponse(true, listDefaultContent);
    }
}
