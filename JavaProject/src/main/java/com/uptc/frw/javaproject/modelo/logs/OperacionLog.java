package com.uptc.frw.javaproject.modelo.logs;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;


@Document(indexName = "logs")
public class OperacionLog {

    @Id
    private String id;
    private String entidad;
    private String operacion;
    private String detalles;
    private Date fecha;

    public OperacionLog() {}

    public OperacionLog(String id, String entidad, String operacion, String detalles, Date fecha) {
        this.id = id;
        this.entidad = entidad;
        this.operacion = operacion;
        this.detalles = detalles;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
