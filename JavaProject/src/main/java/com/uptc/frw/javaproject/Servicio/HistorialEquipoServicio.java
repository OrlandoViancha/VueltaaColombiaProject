package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.HistorialEquipoRepo;
import com.uptc.frw.javaproject.modelo.HistorialEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialEquipoServicio {

    @Autowired
    private HistorialEquipoRepo historialEquipoRepo;

    public List<HistorialEquipo> buscarTodos(){
        return historialEquipoRepo.findAll();
    }
    public HistorialEquipo buscarPorId(Long id){
        return historialEquipoRepo.findById(id).orElse(null);
    }
    public HistorialEquipo insertarHistorial(HistorialEquipo historialEquipo){
        return historialEquipoRepo.save(historialEquipo);
    }
    public void eliminarHistorial(Long id){
        historialEquipoRepo.deleteById(id);
    }
    public HistorialEquipo actualizarHistorial(long id,HistorialEquipo historialEquipo){
        HistorialEquipo viejoHistorial = buscarPorId(id);
        if(viejoHistorial != null){
            viejoHistorial.setAnioVinculacion(historialEquipo.getAnioVinculacion());
            return historialEquipoRepo.save(viejoHistorial);
        }
        throw new RuntimeException("Historial no encontrado");
    }

}
