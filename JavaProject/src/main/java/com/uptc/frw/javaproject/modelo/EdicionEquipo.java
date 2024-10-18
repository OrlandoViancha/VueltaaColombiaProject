package com.uptc.frw.javaproject.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "HISTORIAL_EDICION_EQUIPO")
@IdClass(EdicionEquipo.class)
public class EdicionEquipo {

    @Column(name = "ID_EQUIPO", insertable = false, updatable = false)
    private long idEquipo;
    @Column(name = "ID_EDICION" , insertable = false, updatable = false)
    private long idEdicion;
    @Column(name = "ID_PATROCINADOR", insertable = false, updatable = false)
    private long idPatrocinador;
    @Id
    @ManyToOne
    @JoinColumn(name = "ID_PATROCINADOR")
    private Patrocinador patrocinador;
    @Id
    @ManyToOne
    @JoinColumn(name = "ID_EQUIPO")
    private Equipo equipo;
    @Id
    @ManyToOne
    @JoinColumn(name = "ID_EDICION")
    private Edicion edicion;

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
        return "EdicionEquipo{" +
                "idEquipo=" + idEquipo +
                ", idEdicion=" + idEdicion +
                '}';
    }
}
