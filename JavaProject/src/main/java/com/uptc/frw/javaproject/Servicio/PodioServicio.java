package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.PodioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PodioServicio {

    @Autowired
    private PodioRepo podioRepo;

}
