package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.EdicionEquipoRepo;
import com.uptc.frw.javaproject.modelo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdicionEquipoServicio {

    @Autowired
    private EdicionEquipoRepo edicionEquipoRepo;
    @Autowired
    private EquipoServicio equipoServicio;
    @Autowired
    private EdicionServicio edicionServicio;
    @Autowired
    private PatrocinadorServicio patrocinadorServicio;

    public List<EdicionEquipo> listarEdicionEquipo() {
        return edicionEquipoRepo.findAll();
    }

    public EdicionEquipo buscarEdicionEquipo(long id_equipo, long id_patrocinador, long id_edicion) {
        EdicionEquipoPK key = new EdicionEquipoPK();
        key.setEdicion(edicionServicio.buscar(id_edicion));
        key.setPatrocinador(patrocinadorServicio.buscarPorId(id_patrocinador));
        key.setEquipo(equipoServicio.buscarPorId(id_equipo));
        return edicionEquipoRepo.findById(key).orElse(null);
    }

    public EdicionEquipo guardarEdicionEquipo(EdicionEquipo edicionEquipo) {
        EdicionEquipo edicionEquipoNew = new EdicionEquipo();
        edicionEquipoNew.setEdicion(edicionServicio.buscar(edicionEquipo.getIdEdicion()));
        edicionEquipoNew.setEquipo(equipoServicio.buscarPorId(edicionEquipo.getIdEquipo()));
        edicionEquipoNew.setPatrocinador(patrocinadorServicio.buscarPorId(edicionEquipo.getIdPatrocinador()));
        return edicionEquipoRepo.save(edicionEquipoNew);
    }
}
