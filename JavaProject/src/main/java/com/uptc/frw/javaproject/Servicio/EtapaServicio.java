package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.EtapaRepo;
import com.uptc.frw.javaproject.modelo.Edicion;
import com.uptc.frw.javaproject.modelo.Etapa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtapaServicio {

    @Autowired
    private EtapaRepo etapaRepo;

    @Autowired
    private EdicionServicio edicionServicio;

    public List<Etapa> listar() {
        return etapaRepo.findAll();
    }

    public Etapa buscar(long id) {
        return etapaRepo.findById(id).orElse(null);
    }

    public Etapa guardar(Etapa etapa) {
        Edicion edicion = edicionServicio.buscar(etapa.getIdEdicion());
        etapa.setEdicion(edicion);
        return etapaRepo.save(etapa);
    }

    public Etapa actualizar(long id,Etapa etapa) {
        Etapa etapaActual = buscar(id);
        if (etapaActual != null) {
            etapaActual.setIdEdicion(etapa.getIdEdicion());
            etapaActual.setOrigen(etapa.getOrigen());
            etapaActual.setDestino(etapa.getDestino());
            etapaActual.setLongitud(etapa.getLongitud());
            etapaActual.setTipoEtapa(etapa.getTipoEtapa());
            return guardar(etapaActual);
        }
        throw new RuntimeException("No se encontro el id del etapa");
    }

    public void borrar(long id) {
        etapaRepo.deleteById(id);
    }

}
