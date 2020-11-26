/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.emp.bl.response;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ListDefaultContent implements BaseContent {

    List<DefaultContent> contents = new ArrayList<>();

    public ListDefaultContent(List<DefaultContent> contents) {
        this.contents = contents;
    }

    public ListDefaultContent() {

    }

    public List<DefaultContent> getContents() {
        return contents;
    }

    public void setContents(List<DefaultContent> contents) {
        this.contents = contents;
    }

    public static class DefaultContent {

        boolean status;
        String message;

        public DefaultContent(boolean status, String message) {
            this.status = status;
            this.message = message;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

}
