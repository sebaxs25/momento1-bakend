package com.example.momento1.servicios;

import com.example.momento1.modelos.Materia;
import com.example.momento1.modelos.Usuario;
import com.example.momento1.repositorio.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {
    @Autowired
    IUsuarioRepositorio repositorio;
    public Usuario guardarUsuario(Usuario datosUsuario) throws Exception {
        try {
            return this.repositorio.save(datosUsuario);
        }catch (Exception Error){
            throw new Exception();
        }

    }
    public List<Usuario> listaUsuario () throws Exception{
        try {
         return this.repositorio.findAll();
        }catch (Exception Error) {
            throw new Exception();
        }
    }
}
