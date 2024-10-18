package com.uptc.frw.javaproject.modelo;

import java.io.Serializable;
import java.util.Objects;

public class EdicionEquipoPK implements Serializable {

    private Patrocinador patrocinador;
    private Equipo equipo;
    private Edicion edicion;

    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Edicion getEdicion() {
        return edicion;
    }

    public void setEdicion(Edicion edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "EdicionEquipoPK{" +
                "patrocinador=" + patrocinador +
                ", equipo=" + equipo +
                ", edicion=" + edicion +
                '}';
    }
}
