package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.EtapaServicio;
import com.uptc.frw.javaproject.modelo.Etapa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("etapas")
public class EtapaControlador {

    @Autowired
    private EtapaServicio etapaServicio;

    @GetMapping
    public List<Etapa> listaEtapas(){
        return etapaServicio.listar();
    }

    @GetMapping("/{id}")
    public Etapa buscaEtapa(@PathVariable long id){
        return etapaServicio.buscar(id);
    }

    @PostMapping
    public Etapa añadirEtapa(@RequestBody Etapa etapa){
        return etapaServicio.guardar(etapa);
    }

    @DeleteMapping("/{id}")
    public void eliminarEtapa(@PathVariable long id){
        etapaServicio.borrar(id);
    }

    @PutMapping
    public Etapa actualizarEtapa(@RequestParam long id,@RequestBody Etapa etapa){
        return etapaServicio.actualizar(id, etapa);
    }

}
