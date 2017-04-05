
package com.forDoctors.entity;

import java.io.Serializable;
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
@Table(name = "pacient", catalog = "practik", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacient.findAll", query = "SELECT p FROM Pacient p")
    , @NamedQuery(name = "Pacient.findById", query = "SELECT p FROM Pacient p WHERE p.id = :id")
    , @NamedQuery(name = "Pacient.findByAge", query = "SELECT p FROM Pacient p WHERE p.age = :age")
    , @NamedQuery(name = "Pacient.findByFirstName", query = "SELECT p FROM Pacient p WHERE p.firstName = :firstName")
    , @NamedQuery(name = "Pacient.findBySecondNmae", query = "SELECT p FROM Pacient p WHERE p.secondNmae = :secondNmae")})
public class Pacient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "age", length = 255)
    private String age;
    @Column(name = "firstName", length = 255)
    private String firstName;
    @Column(name = "secondNmae", length = 255)
    private String secondNmae;

    public Pacient() {
    }

    public Pacient(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondNmae() {
        return secondNmae;
    }

    public void setSecondNmae(String secondNmae) {
        this.secondNmae = secondNmae;
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
        if (!(object instanceof Pacient)) {
            return false;
        }
        Pacient other = (Pacient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pacient id=" + id + " "+secondNmae+" "+firstName+" "+age;
    }
    
}
