package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.EdicionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdicionServicio {

    @Autowired
    private EdicionRepo edicionRepo;

}
