/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.emp.bl.response;

/**
 *
 * @author macbook
 */
public class DefaultContent implements BaseContent {

    private final String message;

    public DefaultContent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
