package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.PaisRepo;
import com.uptc.frw.javaproject.modelo.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServicio {

    @Autowired
    private PaisRepo paisRepo;

    public List<Pais> listarPaises() {
        return paisRepo.findAll();
    }

    public Pais buscarPaisPorId(long id) {
        return paisRepo.findById(id).orElse(null);
    }

    public Pais guardarPais(Pais pais) {
        return paisRepo.save(pais);
    }

    public void eliminarPais(long id) {
        paisRepo.deleteById(id);
    }

    public Pais actualizarPais(Pais pais, long id) {
        Pais paisActual = buscarPaisPorId(id);
        if (paisActual != null) {
            paisActual.setName(pais.getName());
            return guardarPais(paisActual);
        }
        throw new RuntimeException("Pais no encontrado en la base de datos");
    }
}
