package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.EdicionEquipoServicio;
import com.uptc.frw.javaproject.Servicio.logs.OperacionLogServicio;
import com.uptc.frw.javaproject.modelo.EdicionEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("edicionEquipo")
public class EdicionEqupoControlador {

    @Autowired
    private EdicionEquipoServicio edicionEquipoServicio;

    @Autowired
    private OperacionLogServicio operacionLogServicio;

    @GetMapping
    public List<EdicionEquipo> listaEdicionEquipo() {
        operacionLogServicio.registrarLog("etapa", "get", "Consultar todas ediciones-equipo");
        return edicionEquipoServicio.listarEdicionEquipo();
    }

    @GetMapping("/{id_equipo}/{id_edicion}/{id_patrocinador}")
    public EdicionEquipo buscarEdicionEquipo(@PathVariable long id_equipo, @PathVariable long id_patrocinador, @PathVariable long id_edicion) {
        return edicionEquipoServicio.buscarEdicionEquipo(id_equipo, id_patrocinador, id_edicion);
    }

    @PostMapping
    public EdicionEquipo guardarEdicionEquipo(@RequestBody EdicionEquipo edicionEquipo) {
        operacionLogServicio.registrarLog("etapa", "post", "Guardat edicion-equipo: " + edicionEquipo);
        return edicionEquipoServicio.guardarEdicionEquipo(edicionEquipo);
    }
}
