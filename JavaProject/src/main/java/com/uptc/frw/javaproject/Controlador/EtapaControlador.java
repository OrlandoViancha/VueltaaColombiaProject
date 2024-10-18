package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.EtapaServicio;
import com.uptc.frw.javaproject.Servicio.logs.OperacionLogServicio;
import com.uptc.frw.javaproject.modelo.Etapa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("etapas")
public class EtapaControlador {

    @Autowired
    private EtapaServicio etapaServicio;

    @Autowired
    private OperacionLogServicio operacionLogServicio;

    @GetMapping
    public List<Etapa> listaEtapas(){
        operacionLogServicio.registrarLog("etapa", "get", "Consultar todas las etapas");
        return etapaServicio.listar();
    }

    @GetMapping("/{id}")
    public Etapa buscaEtapa(@PathVariable long id){
        operacionLogServicio.registrarLog("etapa", "get", "Consultar etapa por id: " + id);
        return etapaServicio.buscar(id);
    }

    @PostMapping
    public Etapa añadirEtapa(@RequestBody Etapa etapa){
        operacionLogServicio.registrarLog("etapa", "post", "Crear etapa: " + etapa);
        return etapaServicio.guardar(etapa);
    }

    @DeleteMapping("/{id}")
    public void eliminarEtapa(@PathVariable long id){
        operacionLogServicio.registrarLog("etapa", "delete", "Eliminar etapa: " + id);
        etapaServicio.borrar(id);
    }

    @PutMapping
    public Etapa actualizarEtapa(@RequestParam long id,@RequestBody Etapa etapa){
        operacionLogServicio.registrarLog("etapa", "put", "Actualizar etapa por id: " + id);
        return etapaServicio.actualizar(id, etapa);
    }

}
