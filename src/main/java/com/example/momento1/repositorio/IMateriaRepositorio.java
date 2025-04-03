package com.example.momento1.repositorio;

import com.example.momento1.modelos.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMateriaRepositorio extends JpaRepository <Materia, Integer> {
}
