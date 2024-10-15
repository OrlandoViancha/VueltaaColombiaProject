package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.PodioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("podios")
public class PodioControlador {

    @Autowired
    private PodioServicio podioServicio;

}
