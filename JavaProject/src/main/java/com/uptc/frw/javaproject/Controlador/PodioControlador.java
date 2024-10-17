package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.PodioServicio;
import com.uptc.frw.javaproject.modelo.Podio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("podios")
public class PodioControlador {

    @Autowired
    private PodioServicio podioServicio;

    @GetMapping
    public List<Podio> listarPodios() {
        return podioServicio.listar();
    }

    @GetMapping("{id}")
    public Podio buscarPodio(@PathVariable long id) {
        return podioServicio.buscar(id);
    }

    @PostMapping
    public Podio crearPodio(@RequestBody Podio podio) {
        return podioServicio.guardar(podio);
    }

    @DeleteMapping("{id}")
    public void eliminarPodio(@PathVariable long id) {
        podioServicio.borrar(id);
    }

    @PutMapping
    public Podio modificarPodio(@RequestParam long id, @RequestBody Podio podio) {
        return podioServicio.actualizar(id, podio);
    }

}
