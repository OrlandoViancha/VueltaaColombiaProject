package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.EtapaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("etapas")
public class EtapaControlador {

    @Autowired
    private EtapaServicio etapaServicio;

}
