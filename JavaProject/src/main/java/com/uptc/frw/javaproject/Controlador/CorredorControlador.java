package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.CorredorServicio;
import com.uptc.frw.javaproject.modelo.Corredor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("corredores")
public class CorredorControlador {

    @Autowired
    private CorredorServicio corredorServicio;

    @GetMapping
    public List<Corredor> listarCorredores() {
        return corredorServicio.listarCorredores();
    }

    @GetMapping("/{id}")
    public Corredor buscarCorredorPorId(@PathVariable long id) {
        return corredorServicio.buscarCorredorPorId(id);
    }

    @PostMapping
    public Corredor guardarCorredor(@RequestBody Corredor pais) {
        return corredorServicio.guardarCorredor(pais);
    }

    @DeleteMapping("/{id}")
    public void eliminarCorredor(@PathVariable long id) {
        corredorServicio.eliminarCorredor(id);
    }

    @PutMapping
    public Corredor actualizarCorredor(@RequestBody Corredor pais, @RequestParam long id) {
        return corredorServicio.actualizarCorredor(pais, id);
    }
}
