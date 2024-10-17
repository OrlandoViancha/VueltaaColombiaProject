package com.uptc.frw.javaproject.Servicio.logs;

import com.uptc.frw.javaproject.Repositorio.logs.OperacionLogRepository;
import com.uptc.frw.javaproject.modelo.logs.OperacionLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class OperacionLogServicio {

    @Autowired
    private OperacionLogRepository operacionLogRepository;

    public void registrarLog(String entidad, String operacion, String detalles) {
        OperacionLog log = new OperacionLog();
        log.setId(UUID.randomUUID().toString());
        log.setEntidad(entidad);
        log.setOperacion(operacion);
        log.setDetalles(detalles);
        log.setFecha(new Date());
        operacionLogRepository.save(log);
    }
}
