package com.uptc.frw.javaproject.Servicio;

import com.uptc.frw.javaproject.Repositorio.CorredorRepo;
import com.uptc.frw.javaproject.modelo.Corredor;
import com.uptc.frw.javaproject.modelo.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorredorServicio {

    @Autowired
    private CorredorRepo repo;

    @Autowired
    private PaisServicio paisServicio;

    public List<Corredor> listarCorredores() {
        return repo.findAll();
    }

    public Corredor buscarCorredorPorId(long id) {
        return repo.findById(id).orElse(null);
    }

    public Corredor guardarCorredor(Corredor corredor) {
        Corredor corredorNuevo = new Corredor();
        corredorNuevo.setId(corredor.getId());
        corredorNuevo.setName(corredor.getName());
        corredorNuevo.setLastNames(corredor.getLastNames());
        corredorNuevo.setBirthDate(corredor.getBirthDate());
        Pais pais = paisServicio.buscarPaisPorId(corredor.getCountryId());
        corredorNuevo.setCountry(pais);
        return repo.save(corredorNuevo);
    }

    public void eliminarCorredor(long id) {
        repo.deleteById(id);
    }

    public Corredor actualizarCorredor(Corredor corredor, long id) {
        Corredor corredorActual = buscarCorredorPorId(id);
        if (corredorActual != null) {
            corredorActual.setName(corredor.getName());
            corredorActual.setLastNames(corredor.getLastNames());
            corredorActual.setBirthDate(corredor.getBirthDate());
            corredorActual.setCountryId(corredor.getCountryId());
            return guardarCorredor(corredorActual);
        }
        throw new RuntimeException("Corredor no encontrado en la base de datos");
    }
}
