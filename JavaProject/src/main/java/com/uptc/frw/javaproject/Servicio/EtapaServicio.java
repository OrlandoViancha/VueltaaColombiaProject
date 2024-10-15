package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.EtapaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtapaServicio {

    @Autowired
    private EtapaRepo etapaRepo;

}
