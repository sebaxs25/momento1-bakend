package com.example.momento1.repositorio;


import com.example.momento1.modelos.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICalificacionRepositorio extends JpaRepository <Calificacion, Integer> {
}
