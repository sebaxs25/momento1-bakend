package com.example.momento1.repositorio;

import com.example.momento1.modelos.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAsistenciaRepositorio extends JpaRepository <Asistencia,Integer> {

}
