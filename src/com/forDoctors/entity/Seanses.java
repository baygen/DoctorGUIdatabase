/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.forDoctors.entity;

import com.main_frame.api.apiCalendar;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Buy
 */
@Entity
@Table(name = "seans")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seanses.findAll", query = "SELECT s FROM Seanses s")
    , @NamedQuery(name = "Seanses.findBySeansesTime", query = "SELECT s FROM Seanses s WHERE s.seansesTime = :seansesTime")
    , @NamedQuery(name = "Seanses.findByPacientName", query = "SELECT s FROM Seanses s WHERE s.pacientName = :pacientName")
    , @NamedQuery(name = "Seanses.findByPacientPhone", query = "SELECT s FROM Seanses s WHERE s.pacientPhone = :pacientPhone")
    , @NamedQuery(name = "Seanses.findByIsFirstTime", query = "SELECT s FROM Seanses s WHERE s.isFirstTime = :isFirstTime")})
public class Seanses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "seansesTime")
    @Temporal(TemporalType.TIMESTAMP)
    private apiCalendar seansesTime;
    @Basic(optional = false)
    @Column(name = "pacientName")
    private String pacientName;
    @Column(name = "pacientPhone")
    private String pacientPhone;
    @Column(name = "isFirstTime")
    private Boolean isFirstTime;

    public Seanses() {
    }

    public Seanses(apiCalendar seansesTime) {
        this.seansesTime = seansesTime;
    }

    public Seanses(apiCalendar seanses_time, String pacient_name) {
        this.seansesTime = seanses_time;
        this.pacientName = pacient_name;
        
    }

    public apiCalendar getSeansesTime() {
        return seansesTime;
    }

    public void setSeansesTime(apiCalendar seansesTime) {
        this.seansesTime = seansesTime;
    }

    public String getPacientName() {
        return pacientName;
    }

    public void setPacientName(String pacientName) {
        this.pacientName = pacientName;
    }

    public String getPacientPhone() {
        return pacientPhone;
    }

    public void setPacientPhone(String pacientPhone) {
        this.pacientPhone = pacientPhone;
    }

    public Boolean getIsFirstTime() {
        return isFirstTime;
    }

    public void setIsFirstTime(Boolean isFirstTime) {
        this.isFirstTime = isFirstTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seansesTime != null ? seansesTime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Seanses)) {
            return false;
        }
        Seanses other = (Seanses) object;
        if ((this.seansesTime == null && other.seansesTime != null) || (this.seansesTime != null && !this.seansesTime.equals(other.seansesTime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return seansesTime + ": "+pacientName+", "+isFirstTime;
    }
    
}
