package com.uptc.frw.javaproject.modelo;

public class Patrocinador {
    private long id;
    private String nit;
    private String nombre;

    public Patrocinador(){}

    public Patrocinador(long id, String nit, String nombre) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Patrocinador{" +
                "id=" + id +
                ", nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
