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

    public Edicion getEdicion(long id){
        return edicionRepo.findById(id).orElse(null);
    }

    public Edicion saveEdicion(Edicion edicion){
        return edicionRepo.save(edicion);
    }

    public Edicion updateEdicion(long id, Edicion edicion){
        Edicion edicionAux = getEdicion(id);
        if(edicionAux != null){
            edicion.setFechaInicio(edicionAux.getFechaInicio());
            edicion.setFechaFin(edicionAux.getFechaFin());
            return saveEdicion(edicionAux);
        }
        throw new RuntimeException("No se encontro el edicion");
    }

    public void deleteEdicion(long id){
        edicionRepo.deleteById(id);
    }


}
