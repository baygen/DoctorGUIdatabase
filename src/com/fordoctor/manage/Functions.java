/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fordoctor.manage;

import com.main_frame.api.MainFrame;
import java.time.LocalDate;

/**
 *
 * @author Buy
 */
public class Functions {
    
    public String[] getArrayForComboDate(){
        LocalDate firstDate =MainFrame.getStartSeanseDay();
        LocalDate addedDay;
        String[] dates = new String[12];
            for(int i=0;i<10;i++){
                addedDay=firstDate;
                dates[i]=addedDay.toString();
                
            }
        return dates;
    }
}
