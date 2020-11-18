/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.emp.bl.servingwebcontent;

import com.hnr.emp.bl.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author macbook
 */
@RestController
public class GreetingController {

    private final String template = "Hello , %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
