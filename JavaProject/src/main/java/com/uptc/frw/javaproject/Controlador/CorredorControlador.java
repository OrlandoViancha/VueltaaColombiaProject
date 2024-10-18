package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.CorredorServicio;
import com.uptc.frw.javaproject.Servicio.logs.OperacionLogServicio;
import com.uptc.frw.javaproject.modelo.Corredor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("corredores")
public class CorredorControlador {

    @Autowired
    private CorredorServicio corredorServicio;

    @Autowired
    private OperacionLogServicio operacionLogServicio;

    @GetMapping
    public List<Corredor> listarCorredores() {
        operacionLogServicio.registrarLog("corredor", "get", "Consultar todas los corredores");
        return corredorServicio.listarCorredores();
    }

    @GetMapping("/{id}")
    public Corredor buscarCorredorPorId(@PathVariable long id) {
        operacionLogServicio.registrarLog("corredor", "get", "Consultar corredor por id: "+ id);
        return corredorServicio.buscarCorredorPorId(id);
    }

    @PostMapping
    public Corredor guardarCorredor(@RequestBody Corredor corredor) {
        operacionLogServicio.registrarLog("corredor", "post", "Crear corredor: "+ corredor);
        return corredorServicio.guardarCorredor(corredor);
    }

    @DeleteMapping("/{id}")
    public void eliminarCorredor(@PathVariable long id) {
        operacionLogServicio.registrarLog("corredor", "delete", "Eliminar corredor por id: "+ id);
        corredorServicio.eliminarCorredor(id);
    }

    @PutMapping
    public Corredor actualizarCorredor(@RequestBody Corredor corredor, @RequestParam long id) {
        operacionLogServicio.registrarLog("corredor", "put", "Actualizar corredor por id: "+ id);
        return corredorServicio.actualizarCorredor(corredor, id);
    }
}
