package com.example.momento1.repositorio;

import com.example.momento1.modelos.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInscripcionRepositorio extends JpaRepository <Inscripcion,Integer> {

}
