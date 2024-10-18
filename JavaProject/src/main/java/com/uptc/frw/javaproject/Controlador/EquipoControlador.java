package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.EquipoServicio;
import com.uptc.frw.javaproject.Servicio.logs.OperacionLogServicio;
import com.uptc.frw.javaproject.modelo.Equipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("equipo")
public class EquipoControlador {
    @Autowired
    private EquipoServicio equipoServicio;

    @Autowired
    private OperacionLogServicio operacionLogServicio;

    @GetMapping("/buscar")
    public List<Equipo> buscarTodos(){
        operacionLogServicio.registrarLog("equipo","get","Consulta todos los equipos");
        return equipoServicio.buscarTodos();
    }

    @GetMapping("/buscarId/{id}")
    public Equipo buscarId(@PathVariable long id){
        operacionLogServicio.registrarLog("equipo","get","Consulta el equipo con el id " + id);
        return equipoServicio.buscarPorId(id);
    }

    @PostMapping("/insertar")
    public Equipo insertar(@RequestBody Equipo equipo){
        operacionLogServicio.registrarLog("equipo","post","Inserta un equipo con el id "+equipo.getId());
        return equipoServicio.insertarEquipo(equipo);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable long id){
        operacionLogServicio.registrarLog("equipo","delete","Elimina un equipo con el id " + id);
         equipoServicio.eliminarEquipo(id);
    }

    @PutMapping("/actualizar/{id}")
    public Equipo actualizar(@PathVariable long id, @RequestBody Equipo equipo){
        operacionLogServicio.registrarLog("equipo","put","Actualiza un equipo con el id " + id);
        return equipoServicio.actualizarEquipo(id, equipo);
    }
}
