package com.uptc.frw.javaproject.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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
    @Column(name = "ID_PAIS", insertable = false, updatable = false)
    private long country;

    @OneToMany(mappedBy = "corredor")
    private List<Podio> podios;

    @OneToMany(mappedBy = "corredor")
    private List<HistorialEquipo> historialCorredor;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ID_PAIS")
    private Pais pais;

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


    public List<Podio> getPodios() {
        return podios;
    }

    public void setPodios(List<Podio> podios) {
        this.podios = podios;
    }

    public List<HistorialEquipo> getHistorialCorredor() { return historialCorredor; }

    public void setHistorialCorredor(List<HistorialEquipo> historialCorredor) { this.historialCorredor = historialCorredor; }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
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
