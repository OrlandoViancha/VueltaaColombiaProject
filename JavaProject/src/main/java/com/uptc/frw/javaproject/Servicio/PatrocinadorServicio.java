package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.PatrocinadorRepo;
import com.uptc.frw.javaproject.modelo.Patrocinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatrocinadorServicio {

    @Autowired
    private PatrocinadorRepo patrocinadorRepo;

    public List<Patrocinador> buscarTodos(){
        return patrocinadorRepo.findAll();
    }
    public Patrocinador buscarPorId(long id){
        return patrocinadorRepo.findById(id).orElse(null);
    }
    public Patrocinador InsertarPatrocinador(Patrocinador patrocinador){
        return patrocinadorRepo.save(patrocinador);
    }

    public void eliminarPatrocinador(long id){
        patrocinadorRepo.deleteById(id);
    }
    public Patrocinador actualizarPatrocinador(long id, Patrocinador patrocinador){
        Patrocinador oldPatrocinador = buscarPorId(id);
        if(oldPatrocinador != null){
            oldPatrocinador.setNombre(patrocinador.getNombre());
            oldPatrocinador.setNit(patrocinador.getNit());
            return patrocinadorRepo.save(oldPatrocinador);
        }
        throw new RuntimeException("Patrocinador no encontrado");
    }
}
