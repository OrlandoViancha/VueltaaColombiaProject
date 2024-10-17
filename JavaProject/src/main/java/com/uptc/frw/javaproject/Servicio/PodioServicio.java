package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.CorredorRepo;
import com.uptc.frw.javaproject.Repositorio.PodioRepo;
import com.uptc.frw.javaproject.modelo.Corredor;
import com.uptc.frw.javaproject.modelo.Etapa;
import com.uptc.frw.javaproject.modelo.Podio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PodioServicio {

    @Autowired
    private PodioRepo podioRepo;

    @Autowired
    private EtapaServicio etapaServicio;

    @Autowired
    private CorredorRepo corredorRepo;

    public List<Podio> listar(){
        return podioRepo.findAll();
    }

    public Podio buscar(long id){
        return podioRepo.findById(id).orElse(null);
    }

    public Podio guardar(Podio podio){
        Etapa etapa = etapaServicio.buscar(podio.getIdEtapa());
        Corredor corredor = corredorRepo.findById(podio.getIdCorredor()).orElse(null);
        podio.setEtapa(etapa);
        podio.setCorredor(corredor);
        return podioRepo.save(podio);
    }

    public Podio actualizar(long id, Podio podio){
        Podio podioActual = buscar(id);
        if(podioActual!=null){
            podioActual.setIdEtapa(podio.getIdEtapa());
            podioActual.setIdCorredor(podio.getIdCorredor());
            podioActual.setPosicion(podio.getPosicion());
            podioActual.setTiempo(podio.getTiempo());
            return guardar(podioActual);
        }
        throw new RuntimeException("Podio no encontrado");
    }

    public void borrar(long id){
        podioRepo.deleteById(id);
    }

}
