package com.uptc.frw.javaproject.Controlador;

import com.uptc.frw.javaproject.Servicio.PaisServicio;
import com.uptc.frw.javaproject.modelo.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paises")
public class PaisControlador {

    @Autowired
    private PaisServicio paisServicio;

    @GetMapping
    public List<Pais> listarPaises() {
        return paisServicio.listarPaises();
    }

    @GetMapping("/{id}")
    public Pais buscarPaisPorId(@PathVariable long id) {
        return paisServicio.buscarPaisPorId(id);
    }

    @PostMapping
    public Pais guardarPais(@RequestBody Pais pais) {
        return paisServicio.guardarPais(pais);
    }

    @DeleteMapping("/{id}")
    public void eliminarPais(@PathVariable long id) {
        paisServicio.eliminarPais(id);
    }

    @PutMapping
    public Pais actualizarPais(@RequestBody Pais pais, @RequestParam long id) {
        return paisServicio.actualizarPais(pais, id);
    }
}
