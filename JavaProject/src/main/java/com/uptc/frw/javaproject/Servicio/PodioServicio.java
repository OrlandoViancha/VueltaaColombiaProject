package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.PodioRepo;
import com.uptc.frw.javaproject.modelo.Podio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PodioServicio {

    @Autowired
    private PodioRepo podioRepo;

    public List<Podio> listar(){
        return podioRepo.findAll();
    }

}
