package com.uptc.frw.javaproject.modelo;

import java.util.Date;

public class Equipo {
    private long id;
    private long idPatrocinador;
    private String nombre;
    private Date fechaFundacion;

    public Equipo() {}

    public Equipo(long id, long idPatrocinador, String nombre, Date fechaFundacion) {
        this.id = id;
        this.idPatrocinador = idPatrocinador;
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPatrocinador() {
        return idPatrocinador;
    }

    public void setIdPatrocinador(long idPatrocinador) {
        this.idPatrocinador = idPatrocinador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", idPatrocinador=" + idPatrocinador +
                ", nombre='" + nombre + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                '}';
    }
}
