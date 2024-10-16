package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.PatrocinadorServicio;
import com.uptc.frw.javaproject.Servicio.logs.OperacionLogServicio;
import com.uptc.frw.javaproject.modelo.Patrocinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("patrocinador")
public class PatrocinadorControlador {

    @Autowired
    private PatrocinadorServicio patrocinadorServicio;

    @Autowired
    private OperacionLogServicio operacionLogServicio;

    @GetMapping("/buscar")
    public List<Patrocinador> buscarTodos(){
        operacionLogServicio.registrarLog("patrocinador","get","Consulta todos los patrocinadores");
        return  patrocinadorServicio.buscarTodos();
    }

    @GetMapping("/busarPorId/{id}")
    public Patrocinador buscarPorId(@PathVariable long id){
        operacionLogServicio.registrarLog("patrocinador","get","Busca un patrocinador con el id " +id);
        return patrocinadorServicio.buscarPorId(id);
    }

    @PostMapping("/insertar")
    public Patrocinador insertarPatrocinador(@RequestBody Patrocinador patrocinador){
        operacionLogServicio.registrarLog("patrocinador","post","Inserta un patrocinador con id"+ patrocinador.getId());
        return patrocinadorServicio.InsertarPatrocinador(patrocinador);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarPatrocinador(@PathVariable long id){
        operacionLogServicio.registrarLog("patrocinador","delete","Elimina un patrocinador con id" + id);
        patrocinadorServicio.eliminarPatrocinador(id);
    }

    @PutMapping("/actualizar/{id}")
    public Patrocinador actualizarPatrocinador(@RequestBody Patrocinador patrocinador,@PathVariable long id){
        operacionLogServicio.registrarLog("patrocinador","put","Actualiza un patrocinador con el id " +id);
        return patrocinadorServicio.actualizarPatrocinador(id,patrocinador);
    }

}
