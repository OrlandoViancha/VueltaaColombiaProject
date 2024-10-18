package com.uptc.frw.javaproject.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PAISES")
public class Pais {

    @Id
    @Column(name = "ID_PAIS")
    private long id;
    @Column(name = "NOMBRE_PAIS")
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "pais")
    private List<Corredor> corredores;

    public Pais() {
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

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Corredor> corredores) {
        this.corredores = corredores;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
