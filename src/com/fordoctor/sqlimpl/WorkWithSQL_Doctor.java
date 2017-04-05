/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fordoctor.sqlimpl;


import java.util.List;

/**
 *
 * @author Buy
 */
public interface WorkWithSQL_Doctor {
    
    public void addSeanse(Object seanse);
    
    public List<?> getListBy_Date(String date);   
    
    public List<?> getListByName(String name);
      
    public List<?> getAllSeanse();
            
    public int updateObj(Object obj);
    
    public int remove(String date,String time);
            
}
