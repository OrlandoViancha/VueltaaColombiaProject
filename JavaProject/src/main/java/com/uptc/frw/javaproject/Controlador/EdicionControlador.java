package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.EdicionServicio;
import com.uptc.frw.javaproject.Servicio.logs.OperacionLogServicio;
import com.uptc.frw.javaproject.modelo.Edicion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ediciones")
public class EdicionControlador {

    @Autowired
    private EdicionServicio edicionServicio;

    @Autowired
    private OperacionLogServicio operacionLogServicio;

    @GetMapping
    public List<Edicion> obtenerEdiciones(){
        operacionLogServicio.registrarLog("edicion", "get", "Consulta todas las ediciones");
        return edicionServicio.listaEdiciones();
    }

    @GetMapping("{id}")
    public Edicion obtenerEdicionPorId(@PathVariable long id){
        operacionLogServicio.registrarLog("edicion", "get", "Consulta la edicion por id: " + id);
        return edicionServicio.buscar(id);
    }

    @PostMapping
    public Edicion crearEdicion(@RequestBody Edicion edicion){
        operacionLogServicio.registrarLog("edicion", "post", "Crear la edicion: " + edicion.getId());
        return edicionServicio.guardar(edicion);
    }

    @DeleteMapping("/{id}")
    public void eliminarEdicionPorId(@PathVariable long id){
        operacionLogServicio.registrarLog("edicion", "delete", "Elimina la edicion por id: " + id);
        edicionServicio.borrar(id);
    }

    @PutMapping
    public Edicion modificarEdicion(@RequestParam long id,@RequestBody Edicion edicion){
        operacionLogServicio.registrarLog("edicion", "put", "Modifica la edicion por id: " + id);
        return edicionServicio.actualizar(id, edicion);
    }

}
