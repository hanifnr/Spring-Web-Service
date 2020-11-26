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
public class BaseResponse {

    protected boolean status;
    protected BaseContent content;

    public BaseResponse(boolean status, BaseContent content) {
        this.status = status;
        this.content = content;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public BaseContent getContent() {
        return content;
    }

    public void setContent(BaseContent content) {
        this.content = content;
    }

}
