package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.EquipoServicio;
import com.uptc.frw.javaproject.modelo.Equipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("equipo")
public class EquipoControlador {
    @Autowired
    private EquipoServicio equipoServicio;

    @GetMapping("/buscar")
    public List<Equipo> buscarTodos(){
        return equipoServicio.buscarTodos();
    }

    @GetMapping("/buscarId/{id}")
    public Equipo buscarId(@PathVariable long id){
        return equipoServicio.buscarPorId(id);
    }

    @PostMapping("/insertar")
    public Equipo insertar(@RequestBody Equipo equipo){
        return equipoServicio.insertarEquipo(equipo);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable long id){
         equipoServicio.eliminarEquipo(id);
    }

    @PutMapping("/actualizar/{id}")
    public Equipo actualizar(@PathVariable long id, @RequestBody Equipo equipo){
        return equipoServicio.actualizarEquipo(id, equipo);
    }
}
