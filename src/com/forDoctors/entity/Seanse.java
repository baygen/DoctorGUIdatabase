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
@Entity(name="Seanse")
@Table(name = "seanse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seanse.findAll", query = "SELECT s FROM Seanse s")
    , @NamedQuery(name = "Seanse.findById", query = "SELECT s FROM Seanse s WHERE s.id = :id")
    , @NamedQuery(name = "Seanse.findBySeanseDate", query = "SELECT s FROM Seanse s WHERE s.seanseDate = :seanseDate")
    , @NamedQuery(name = "Seanse.findBySeanseTime", query = "SELECT s FROM Seanse s WHERE s.seanseTime = :seanseTime")
    , @NamedQuery(name = "Seanse.findByPacienName", query = "SELECT s FROM Seanse s WHERE s.pacienName = :pacienName")
    , @NamedQuery(name = "Seanse.findByPacientPhone", query = "SELECT s FROM Seanse s WHERE s.pacientPhone = :pacientPhone")})
public class Seanse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "seanse_date")
    @Temporal(TemporalType.DATE)
    private Date seanseDate;
    @Basic(optional = false)
    @Column(name = "seanse_time")
    private String seanseTime;
    @Basic(optional = false)
    @Column(name = "pacien_name")
    private String pacienName;
    @Column(name = "pacient_phone")
    private String pacientPhone;

    public Seanse() {
    }

    public Seanse(Integer id) {
        this.id = id;
    }

    public Seanse(Integer id, Date seanseDate, String seanseTime, String pacienName) {
        this.id = id;
        this.seanseDate = seanseDate;
        this.seanseTime = seanseTime;
        this.pacienName = pacienName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getSeanseDate() {
        return seanseDate;
    }

    public void setSeanseDate(Date seanseDate) {
        this.seanseDate = seanseDate;
    }

    public String getSeanseTime() {
        return seanseTime;
    }

    public void setSeanseTime(String seanseTime) {
        this.seanseTime = seanseTime;
    }

    public String getPacienName() {
        return pacienName;
    }

    public void setPacienName(String pacienName) {
        this.pacienName = pacienName;
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
        return "com.forDoctors.entity.Seanse[ id=" + id + " ]";
    }
    
}
