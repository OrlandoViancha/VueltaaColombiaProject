package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.EdicionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ediciones")
public class EdicionControlador {

    @Autowired
    private EdicionServicio edicionServicio;

}
