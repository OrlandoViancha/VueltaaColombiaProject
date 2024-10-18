package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.PodioServicio;
import com.uptc.frw.javaproject.Servicio.logs.OperacionLogServicio;
import com.uptc.frw.javaproject.modelo.Podio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("podios")
public class PodioControlador {

    @Autowired
    private PodioServicio podioServicio;

    @Autowired
    private OperacionLogServicio operacionLogServicio;

    @GetMapping
    public List<Podio> listarPodios() {
        operacionLogServicio.registrarLog("podio", "get", "Consulta todos los podios");
        return podioServicio.listar();
    }

    @GetMapping("{id}")
    public Podio buscarPodio(@PathVariable long id) {
        operacionLogServicio.registrarLog("podio", "get", "Consulta podio por id: " + id);
        return podioServicio.buscar(id);
    }

    @PostMapping
    public Podio crearPodio(@RequestBody Podio podio) {
        operacionLogServicio.registrarLog("podio", "post", "Crear podio: " + podio);
        return podioServicio.guardar(podio);
    }

    @DeleteMapping("{id}")
    public void eliminarPodio(@PathVariable long id) {
        operacionLogServicio.registrarLog("podio", "delete", "Eliminar podio: " + id);
        podioServicio.borrar(id);
    }

    @PutMapping
    public Podio modificarPodio(@RequestParam long id, @RequestBody Podio podio) {
        operacionLogServicio.registrarLog("podio", "put", "Modificar podio: " + id);
        return podioServicio.actualizar(id, podio);
    }

}
