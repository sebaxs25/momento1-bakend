package com.example.momento1.repositorio;

import com.example.momento1.modelos.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IDocenteRepositorio extends JpaRepository <Docente,Integer> {
}
