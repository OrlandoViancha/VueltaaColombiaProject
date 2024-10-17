package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.HistorialEquipoServicio;
import com.uptc.frw.javaproject.modelo.HistorialEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("historialEquipo")
public class HistorialEquipoControlador {
    @Autowired
    private HistorialEquipoServicio historialEquipoServicio;

    @GetMapping("/buscar")
    public List<HistorialEquipo> buscarTodos() {
        return historialEquipoServicio.buscarTodos();
    }

    @GetMapping("/buscar/{id}")
    public HistorialEquipo buscar(@PathVariable long id) {
        return historialEquipoServicio.buscarPorId(id);
    }

    @PostMapping("/insertar")
    public HistorialEquipo insertar(@RequestBody HistorialEquipo historialEquipo) {
        return historialEquipoServicio.insertarHistorial(historialEquipo);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable long id) {
        historialEquipoServicio.eliminarHistorial(id);
    }

    @PutMapping("/actualizar/{id}")
    public HistorialEquipo actualizar(@RequestBody HistorialEquipo historialEquipo, @PathVariable  long id) {
        return historialEquipoServicio.actualizarHistorial(id, historialEquipo);
    }
}
