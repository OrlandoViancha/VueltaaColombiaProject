package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.PaisServicio;
import com.uptc.frw.javaproject.Servicio.logs.OperacionLogServicio;
import com.uptc.frw.javaproject.modelo.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paises")
public class PaisControlador {

    @Autowired
    private PaisServicio paisServicio;

    @Autowired
    private OperacionLogServicio operacionLogServicio;

    @GetMapping
    public List<Pais> listarPaises() {
        operacionLogServicio.registrarLog("etapa", "get", "Consultar todos los paises");
        return paisServicio.listarPaises();
    }

    @GetMapping("/{id}")
    public Pais buscarPaisPorId(@PathVariable long id) {
        operacionLogServicio.registrarLog("etapa", "get", "Consultar pais por id: " + id);
        return paisServicio.buscarPaisPorId(id);
    }

    @PostMapping
    public Pais guardarPais(@RequestBody Pais pais) {
        operacionLogServicio.registrarLog("etapa", "post", "Guardar pais: " + pais);
        return paisServicio.guardarPais(pais);
    }

    @DeleteMapping("/{id}")
    public void eliminarPais(@PathVariable long id) {
        operacionLogServicio.registrarLog("etapa", "delete", "Eliminar pais por id: " + id);
        paisServicio.eliminarPais(id);
    }

    @PutMapping
    public Pais actualizarPais(@RequestBody Pais pais, @RequestParam long id) {
        operacionLogServicio.registrarLog("etapa", "put", "Actualizar pais por id: " + pais);
        return paisServicio.actualizarPais(pais, id);
    }
}
