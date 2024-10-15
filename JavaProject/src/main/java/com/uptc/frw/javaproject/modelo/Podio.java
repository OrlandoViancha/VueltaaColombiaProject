package com.uptc.frw.javaproject.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "PODIOS")
public class Podio {

    @Id
    @Column(name = "ID_PODIO")
    private long id;
    @Column(name = "ID_ETAPA")
    private long idEtapa;
    @Column(name = "ID_CORREDOR")
    private long idCorredor;
    @Column(name = "POSICION")
    private long posicion;
    @Column(name = "TIEMPO")
    private Timestamp tiempo;

    public Podio() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdEtapa() {
        return idEtapa;
    }

    public void setIdEtapa(long idEtapa) {
        this.idEtapa = idEtapa;
    }

    public long getIdCorredor() {
        return idCorredor;
    }

    public void setIdCorredor(long idCorredor) {
        this.idCorredor = idCorredor;
    }

    public long getPosicion() {
        return posicion;
    }

    public void setPosicion(long posicion) {
        this.posicion = posicion;
    }

    public Timestamp getTiempo() {
        return tiempo;
    }

    public void setTiempo(Timestamp tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Podio{" +
                "id=" + id +
                ", idEtapa=" + idEtapa +
                ", idCorredor=" + idCorredor +
                ", posicion=" + posicion +
                ", tiempo=" + tiempo +
                '}';
    }
}
