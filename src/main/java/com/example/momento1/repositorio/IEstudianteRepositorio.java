package com.example.momento1.repositorio;

import com.example.momento1.modelos.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepositorio  extends JpaRepository <Estudiante,Integer> {
}
