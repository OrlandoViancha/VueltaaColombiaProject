package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.EquipoRepo;
import com.uptc.frw.javaproject.modelo.Equipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoServicio {

    @Autowired
    private EquipoRepo equipoRepo;

    public List<Equipo> buscarTodos(){
        return equipoRepo.findAll();
    }
    public Equipo buscarPorId(long id){
        return equipoRepo.findById(id).orElse(null);
    }
    public Equipo insertarEquipo(Equipo equipo){
        return equipoRepo.save(equipo);
    }
    public void eliminarEquipo(long id){
        equipoRepo.deleteById(id);
    }
    public Equipo actualizarEquipo(long id,Equipo equipo){
        Equipo viejoEquipo = buscarPorId(id);
        if(viejoEquipo != null){
            viejoEquipo.setNombre(equipo.getNombre());
            viejoEquipo.setFechaFundacion(equipo.getFechaFundacion());
            return equipoRepo.save(viejoEquipo);
        }
        throw new RuntimeException("Equipo no encontrado");
    }
}
