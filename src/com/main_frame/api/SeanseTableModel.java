/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main_frame.api;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Buy
 */
public class SeanseTableModel {
        
        private final String [] colNames;
        private String [] schedule;
        private Object[][] tableShablon;
        
    public SeanseTableModel() {
        this.colNames = new String[]{"", "Pacient Name", "Pacient phone","Перший раз"};
        this.schedule=getDefSchedule();
        this.tableShablon = setShablon(schedule);
    }

    public DefaultTableModel getModel(String date) {
        colNames[0]=date;
        DefaultTableModel dtm=new DefaultTableModel(tableShablon, colNames);
        return dtm;
    }
    public String [] getTableSchedule(){

        return schedule;
    }
    public void setSchedule(String[] schedule){
        this.schedule=schedule;
    }
    private String[] getDefSchedule(){
        schedule=new String[]{"10:00", "10:40", "11:20", "12:00", "12:40","13:20","14:40","15:20","16:00","16:40","17:20" };
        return schedule;
    }
    private Object[][] setShablon(String[] sched){
        
        tableShablon=new Object[sched.length][colNames.length];
        
        for(int col=0;col<colNames.length;col++){
            
            for(int row=0;row<sched.length;row++){
                if(col==0){
                tableShablon[row][col]=sched[row];
                }else{
                    tableShablon[row][col]=null;
                }
        }
        }
        return tableShablon;
    }
}
