/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.forDoctors.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Buy
 */
@Entity
@Table(name = "seanse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seanse.findAll", query = "SELECT s FROM Seanse s")
    , @NamedQuery(name = "Seanse.findById", query = "SELECT s FROM Seanse s WHERE s.id = :id")
    , @NamedQuery(name = "Seanse.findByTime", query = "SELECT s FROM Seanse s WHERE s.time = :time")
    , @NamedQuery(name = "Seanse.findByPacientName", query = "SELECT s FROM Seanse s WHERE s.pacientName = :pacientName")
    , @NamedQuery(name = "Seanse.findByPacientPhone", query = "SELECT s FROM Seanse s WHERE s.pacientPhone = :pacientPhone")
    , @NamedQuery(name = "Seanse.findBySDate", query = "SELECT s FROM Seanse s WHERE s.sDate = :sDate")
    ,@NamedQuery(name = "Seanse.findBySDateAndTime", query = "SELECT s FROM Seanse s WHERE s.sDate = :sDate and s.time = :time")
})
public class Seanse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Time")
    private String time;
    @Column(name = "PacientName")
    private String pacientName;
    @Column(name = "PacientPhone")
    private String pacientPhone;
    @Column(name = "sDate")
    private Date sDate;

    public Seanse() {
    }

    public Seanse(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seanse)) {
            return false;
        }
        Seanse other = (Seanse) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + " "+pacientName+" "+sDate+" "+ time+".";
    }
    
}
