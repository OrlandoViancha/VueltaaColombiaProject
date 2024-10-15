package com.uptc.frw.javaproject.modelo;

public class HistorialEquipo {

    private long id;
    private long idEquipo;
    private long idCorredor;
    private int anioVinculacion;

    public HistorialEquipo() {}

    public HistorialEquipo(long id, long idEquipo, long idCorredor, int anioVinculacion) {
        this.id = id;
        this.idEquipo = idEquipo;
        this.idCorredor = idCorredor;
        this.anioVinculacion = anioVinculacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public long getIdCorredor() {
        return idCorredor;
    }

    public void setIdCorredor(long idCorredor) {
        this.idCorredor = idCorredor;
    }

    public int getAnioVinculacion() {
        return anioVinculacion;
    }

    public void setAnioVinculacion(int anioVinculacion) {
        this.anioVinculacion = anioVinculacion;
    }

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
