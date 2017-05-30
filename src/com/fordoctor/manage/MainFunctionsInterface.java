/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fordoctor.manage;

import com.forDoctors.entity.Seanses;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Buy
 */
public interface MainFunctionsInterface {
    
    public void saveSeanse(Seanses seanse);    
    
    public List<?> getAllSeanses();
    
    public List<?> getSeansesByDate(LocalDate locDate);
    
    public List<?> getSeansesByPacientName(String name);
    
    public boolean getFirstTimeOrNO(Seanses seanse);
}
