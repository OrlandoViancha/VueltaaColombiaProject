package com.uptc.frw.javaproject.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HISTORIAL_EDICION_EQUIPO")
public class EdicionEquipo {

    @Id
    @Column(name = "ID_EQUIPO")
    private long idEquipo;
    @Id
    @Column(name = "ID_EDICION")
    private long idEdicion;

    public EdicionEquipo() {
    }

    public long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public long getIdEdicion() {
        return idEdicion;
    }

    public void setIdEdicion(long idEdicion) {
        this.idEdicion = idEdicion;
    }

    @Override
    public String toString() {
        return "EdicionEquipo{" +
                "idEquipo=" + idEquipo +
                ", idEdicion=" + idEdicion +
                '}';
    }
}
