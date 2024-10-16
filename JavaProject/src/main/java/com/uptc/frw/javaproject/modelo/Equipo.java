package com.uptc.frw.javaproject.modelo;

import jakarta.persistence.*;

import javax.naming.Name;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "EQUIPOS")
public class Equipo {
    @Id
    @Column(name = "ID_EQUIPO")
    private long id;
    @Column(name = "ID_PATROCINADOR")
    private long idPatrocinador;
    @Column(name = "NOMBRE_EQUIPO")
    private String nombre;
    @Column(name = "FECHA_FUNDACION")
    private Date fechaFundacion;

    @OneToMany(mappedBy = "equipo")
    private List<HistorialEquipo> historialEquipo;

    @OneToMany(mappedBy = "equipo")
    private List<EdicionEquipo> edicionEquipo;
    
    public Equipo() {}

    public Equipo(long id, long idPatrocinador, String nombre, Date fechaFundacion) {
        this.id = id;
        this.idPatrocinador = idPatrocinador;
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public long getIdPatrocinador() { return idPatrocinador; }

    public void setIdPatrocinador(long idPatrocinador) { this.idPatrocinador = idPatrocinador; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Date getFechaFundacion() { return fechaFundacion; }

    public void setFechaFundacion(Date fechaFundacion) { this.fechaFundacion = fechaFundacion; }

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
