package com.uptc.frw.javaproject.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "CORREDORES")
public class Corredor {

    @Id
    @Column(name = "ID_CORREDOR")
    private long id;
    @Column(name = "NOMBRE_CORREDOR")
    private String name;
    @Column(name = "APELLIDOS_CORREDOR")
    private String lastNames;
    @Column(name = "FECHA_NACIMIENTO_CORREDOR")
    private Date birthDate;
    @Column(name = "ID_PAIS")
    private long country;

    public Corredor() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public long getCountry() {
        return country;
    }

    public void setCountry(long country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastNames='" + lastNames + '\'' +
                ", birthDate=" + birthDate +
                ", country=" + country +
                '}';
    }
}
