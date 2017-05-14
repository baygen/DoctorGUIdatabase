/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.forDoctors.entity;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "seanses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seanses.findAll", query = "SELECT s FROM Seanses s")
    , @NamedQuery(name = "Seanses.findBySeansesID", query = "SELECT s FROM Seanses s WHERE s.seansesID = :seansesID")
    , @NamedQuery(name = "Seanses.findBySeansesTime", query = "SELECT s FROM Seanses s WHERE s.seansesTime = :seansesTime")
    , @NamedQuery(name = "Seanses.findByPacientName", query = "SELECT s FROM Seanses s WHERE s.pacientName = :pacientName")
    , @NamedQuery(name = "Seanses.findByPacientPhone", query = "SELECT s FROM Seanses s WHERE s.pacientPhone = :pacientPhone")})
public class Seanses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "seansesID")
    private int seansesID;
    @Id
    @Basic(optional = false)
    @Column(name = "seansesTime")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Calendar seansesTime;
    @Basic(optional = false)
    @Column(name = "pacientName")
    private String pacientName;
    @Column(name = "pacientPhone")
    private String pacientPhone;

    public Seanses() {
    }

    public Seanses(Calendar seansesTime) {
        this.seansesTime = seansesTime;
    }

    public Seanses(Calendar seansesTime, int seansesID, String pacientName) {
        this.seansesTime = seansesTime;
        this.seansesID = seansesID;
        this.pacientName = pacientName;
    }

    public int getSeansesID() {
        return seansesID;
    }

    public void setSeansesID(int seansesID) {
        this.seansesID = seansesID;
    }

    public Calendar getSeansesTime() {
        return seansesTime;
    }

    public void setSeansesTime(Calendar seansesTime) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seansesTime != null ? seansesTime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
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
        return "seans = " + seansesTime +pacientName +" .";
    }
    
}
