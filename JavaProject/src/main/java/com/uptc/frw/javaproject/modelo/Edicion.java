package com.uptc.frw.javaproject.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "EDICIONES")
public class Edicion {

    @Id
    @Column(name = "ID_EDICION")
    private long id;
    @Column(name = "FECHA_INICIO")
    private Date fechaInicio;
    @Column(name = "FECHA_FIN")
    private Date fechaFin;

    @JsonIgnore
    @OneToMany(mappedBy = "edicion")
    private List<Etapa> etapas;

    @JsonIgnore
    @OneToMany(mappedBy = "edicion")
    private List<EdicionEquipo> edicionEquipos;

    public Edicion() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Etapa> getEtapas() {
        return etapas;
    }

    public void setEtapas(List<Etapa> etapas) {
        this.etapas = etapas;
    }

    public List<EdicionEquipo> getEdicionEquipos() {
        return edicionEquipos;
    }

    public void setEdicionEquipos(List<EdicionEquipo> edicionEquipos) {
        this.edicionEquipos = edicionEquipos;
    }

    @Override
    public String toString() {
        return "Edicion{" +
                "id=" + id +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
