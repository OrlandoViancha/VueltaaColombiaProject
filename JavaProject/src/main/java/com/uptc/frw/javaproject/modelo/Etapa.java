package com.uptc.frw.javaproject.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ETAPAS")
public class Etapa {

    @Id
    @Column(name = "ID_ETAPA")
    private long id;
    @Column(name = "ID_EDICION")
    private long idEdicion;
    @Column(name = "ORIGEN")
    private String origen;
    @Column(name = "DESTINO")
    private String destino;
    @Column(name = "LONGITUD")
    private double longitud;
    @Column(name = "TIPO_ETAPA")
    private String tipoEtapa;

    public Etapa() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdEdicion() {
        return idEdicion;
    }

    public void setIdEdicion(long idEdicion) {
        this.idEdicion = idEdicion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTipoEtapa() {
        return tipoEtapa;
    }

    public void setTipoEtapa(String tipoEtapa) {
        this.tipoEtapa = tipoEtapa;
    }

    @Override
    public String toString() {
        return "Etapa{" +
                "id=" + id +
                ", idEdicion=" + idEdicion +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", longitud=" + longitud +
                ", tipoEtapa='" + tipoEtapa + '\'' +
                '}';
    }
}
