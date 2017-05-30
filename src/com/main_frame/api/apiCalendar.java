/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main_frame.api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 *
 * @author Buy
 */
public abstract class apiCalendar extends Calendar{
    
    private static final long serialVersionUID = 1L;

    
    
    public apiCalendar (){
        super();
    }
    
    public String toDateString(){
        int month = this.get(Calendar.MONTH)+1;
        String date = this.get(Calendar.YEAR)+"-"+month+"-"+this.get(Calendar.DAY_OF_MONTH);
        return date;
    }
    
    public String toDateTimeString(){
        String date_time;
        date_time = this.toDateString()+" "+this.get(Calendar.HOUR_OF_DAY)+":"+this.get(Calendar.MINUTE);
        
        return date_time;
    }
    
    private static LocalDate getStartSeanseDate() {
        LocalDate day;
        DayOfWeek todayOfWeek=LocalDate.now().getDayOfWeek();

            if(todayOfWeek.equals(DayOfWeek.TUESDAY)||todayOfWeek.equals(DayOfWeek.THURSDAY)||todayOfWeek.equals(DayOfWeek.SATURDAY)){
                day = LocalDate.now();
            }else{
                if(todayOfWeek.equals(DayOfWeek.SUNDAY)){
                   day = LocalDate.now().plusDays(2);
                }else{
                day = LocalDate.now().plusDays(1);
                }
            }        
        return day;
    }
    
    public static LocalDate getNextTableDate(){
        LocalDate next;
            if(DayOfWeek.SATURDAY.equals(LocalDate.now().getDayOfWeek())){
                next = getStartSeanseDate().plusDays(3);
            }else{
                next = getStartSeanseDate().plusDays(2);
            }
        return next;
    }
    
    public static String getFirstTableDayString() {
        
        return getStartSeanseDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    
    public static String getNextTableDayString(){
        
        return getNextTableDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
