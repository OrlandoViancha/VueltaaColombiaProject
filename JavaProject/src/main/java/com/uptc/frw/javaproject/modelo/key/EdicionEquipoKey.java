package com.uptc.frw.javaproject.modelo.key;

import com.uptc.frw.javaproject.modelo.Edicion;
import com.uptc.frw.javaproject.modelo.Equipo;
import com.uptc.frw.javaproject.modelo.Patrocinador;

import java.io.Serializable;

public class EdicionEquipoKey implements Serializable {

    private Patrocinador patrocinador;
    private Equipo equipo;
    private Edicion edicion;

    public EdicionEquipoKey() {
    }

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
}
