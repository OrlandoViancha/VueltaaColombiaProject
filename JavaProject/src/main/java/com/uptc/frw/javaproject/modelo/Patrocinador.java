package com.uptc.frw.javaproject.modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PATROCINADORES")
public class Patrocinador {
    @Id
    @Column(name = "ID_PATROCINADOR")
    private long id;
    @Column(name = "NIT_PATROCINADOR")
    private String nit;
    @Column(name = "NOMBRE_PATROCINADOR")
    private String nombre;

    @OneToMany(mappedBy = "patrocinador")
    private List<EdicionEquipo> equiposPatrocinados;
    public Patrocinador(){}

    public Patrocinador(long id, String nit, String nombre) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getNit() { return nit; }

    public void setNit(String nit) { this.nit = nit; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<EdicionEquipo> getEquiposPatrocinados() { return equiposPatrocinados; }

    public void setEquiposPatrocinados(List<EdicionEquipo> equiposPatrocinados) { this.equiposPatrocinados = equiposPatrocinados; }

    @Override
    public String toString() {
        return "Patrocinador{" +
                "id=" + id +
                ", nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
