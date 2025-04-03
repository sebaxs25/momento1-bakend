package com.example.momento1.repositorio;

import com.example.momento1.modelos.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepositorio extends JpaRepository <Curso,Integer> {
}
