package com.example.momento1.repositorio;

import com.example.momento1.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepositorio extends JpaRepository <Usuario, Integer> {

}
