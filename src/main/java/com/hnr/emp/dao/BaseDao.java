/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.emp.dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class BaseDao<T> {
    
    List<T> list = new ArrayList<>();
    
    protected BaseDao() {
        
    }
    
    public void generate(List<T> list) {
        this.list = list;
    }
    
    public List<T> getAll() {
        return list;
    }
    
    public void add(T t) throws Exception {
        list.add(t);
    }
    
    public void remove(T t) throws Exception {
        list.remove(t);
    }
}
