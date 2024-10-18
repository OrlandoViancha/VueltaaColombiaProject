package com.uptc.frw.javaproject.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @Column(name = "NOMBRE_EQUIPO")
    private String nombre;
    @Column(name = "FECHA_FUNDACION")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date fechaFundacion;

    @OneToMany(mappedBy = "equipo")
    private List<HistorialEquipo> historialEquipo;

    @OneToMany(mappedBy = "equipo")
    private List<EdicionEquipo> edicionEquipo;
    
    public Equipo() {}

    public Equipo(long id, String nombre, Date fechaFundacion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Date getFechaFundacion() { return fechaFundacion; }

    public void setFechaFundacion(Date fechaFundacion) { this.fechaFundacion = fechaFundacion; }

    public List<HistorialEquipo> getHistorialEquipo() {
        return historialEquipo;
    }

    public void setHistorialEquipo(List<HistorialEquipo> historialEquipo) {
        this.historialEquipo = historialEquipo;
    }

    public List<EdicionEquipo> getEdicionEquipo() {
        return edicionEquipo;
    }

    public void setEdicionEquipo(List<EdicionEquipo> edicionEquipo) {
        this.edicionEquipo = edicionEquipo;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                '}';
    }
}
