package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.EdicionRepo;
import com.uptc.frw.javaproject.modelo.Edicion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdicionServicio {

    @Autowired
    private EdicionRepo edicionRepo;

    public List<Edicion> listaEdiciones(){
        return edicionRepo.findAll();
    }

    public Edicion buscar(long id){
        return edicionRepo.findById(id).orElse(null);
    }

    public Edicion guardar(Edicion edicion){
        return edicionRepo.save(edicion);
    }

    public Edicion actualizar(long id, Edicion edicion){
        Edicion edicionActual = buscar(id);
        if(edicionActual != null){
            edicionActual.setFechaInicio(edicion.getFechaInicio());
            edicionActual.setFechaFin(edicion.getFechaFin());
            return guardar(edicionActual);
        }
        throw new RuntimeException("No se encontro el edicion");
    }

    public void borrar(long id){
        edicionRepo.deleteById(id);
    }


}
