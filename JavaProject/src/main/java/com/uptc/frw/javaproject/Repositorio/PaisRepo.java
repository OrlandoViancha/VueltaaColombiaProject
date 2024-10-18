package com.uptc.frw.javaproject.Repositorio;

import com.uptc.frw.javaproject.modelo.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepo extends JpaRepository<Pais, Long> {

}
