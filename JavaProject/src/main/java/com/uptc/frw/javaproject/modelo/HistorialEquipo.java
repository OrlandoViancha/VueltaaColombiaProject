package com.uptc.frw.javaproject.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "HISTORIAL_EQUIPOS")
public class HistorialEquipo {
    @Id
    @Column(name = "ID_HISTORIAL")
    private long id;
    @Column(name = "ID_EQUIPO",insertable = false, updatable = false)
    private long idEquipo;
    @Column(name = "ID_CORREDOR",insertable = false, updatable = false)
    private long idCorredor;
    @Column(name = "ANIO_VINCULACION")
    private int anioVinculacion;
    @ManyToOne
    @JoinColumn(name = "ID_EQUIPO")
    private Equipo equipo;

    @ManyToOne
    @JoinColumn(name = "ID_CORREDOR")
    private Corredor corredor;

    public HistorialEquipo() {}

    public HistorialEquipo(long id, long idEquipo, long idCorredor, int anioVinculacion) {
        this.id = id;
        this.idEquipo = idEquipo;
        this.idCorredor = idCorredor;
        this.anioVinculacion = anioVinculacion;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public long getIdEquipo() { return idEquipo; }

    public void setIdEquipo(long idEquipo) { this.idEquipo = idEquipo; }

    public long getIdCorredor() { return idCorredor; }

    public void setIdCorredor(long idCorredor) { this.idCorredor = idCorredor; }

    public int getAnioVinculacion() { return anioVinculacion; }

    public void setAnioVinculacion(int anioVinculacion) { this.anioVinculacion = anioVinculacion; }

    public Equipo getEquipo() { return equipo; }

    public void setEquipo(Equipo equipo) { this.equipo = equipo; }

    public Corredor getCorredor() { return corredor; }

    public void setCorredor(Corredor corredor) { this.corredor = corredor; }

    @Override
    public String toString() {
        return "HistorialEquipo{" +
                "id=" + id +
                ", idEquipo=" + idEquipo +
                ", idCorredor=" + idCorredor +
                ", anioVinculacion=" + anioVinculacion +
                '}';
    }
}
