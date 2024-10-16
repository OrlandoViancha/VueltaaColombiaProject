package com.uptc.frw.javaproject.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "HISTORIAL_EDICION_EQUIPO")
public class EdicionEquipo {

    @Id
    @Column(name = "ID_EQUIPO")
    private long idEquipo;
    @Id
    @Column(name = "ID_EDICION")
    private long idEdicion;
    @Id
    @Column(name = "ID_PATROCINADOR",insertable = false, updatable = false)
    private long idPatrocinador;

    @ManyToOne
    @JoinColumn(name = "ID_PATROCINADOR")
    private Patrocinador patrocinador;

    @ManyToOne
    @JoinColumn(name = "ID_EQUIPO")
    private Equipo equipo;
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

    public long getIdPatrocinador() { return idPatrocinador; }

    public void setIdPatrocinador(long idPatrocinador) { this.idPatrocinador = idPatrocinador; }

    public Patrocinador getPatrocinador() { return patrocinador; }

    public void setPatrocinador(Patrocinador patrocinador) { this.patrocinador = patrocinador; }

    @Override
    public String toString() {
        return "EdicionEquipo{" +
                "idEquipo=" + idEquipo +
                ", idEdicion=" + idEdicion +
                '}';
    }
}
