package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.EdicionServicio;
import com.uptc.frw.javaproject.modelo.Edicion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ediciones")
public class EdicionControlador {

    @Autowired
    private EdicionServicio edicionServicio;

    @GetMapping
    public List<Edicion> obtenerEdiciones(){
        return edicionServicio.listaEdiciones();
    }

    @GetMapping("{id}")
    public Edicion obtenerEdicionPorId(@PathVariable long id){
        return edicionServicio.buscar(id);
    }

    @PostMapping
    public Edicion crearEdicion(@RequestBody Edicion edicion){
        return edicionServicio.guardar(edicion);
    }

    @DeleteMapping("/{id}")
    public void eliminarEdicionPorId(@PathVariable long id){
        edicionServicio.borrar(id);
    }

    @PutMapping
    public Edicion modificarEdicion(@RequestParam long id,@RequestBody Edicion edicion){
        return edicionServicio.actualizar(id, edicion);
    }

}
