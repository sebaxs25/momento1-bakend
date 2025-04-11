package com.example.momento1.servicios;


import com.example.momento1.modelos.Materia;
import com.example.momento1.repositorio.IMateriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServicio {
    @Autowired
    IMateriaRepositorio repositorio;
    public Materia guardarMateria(Materia datosMateria) throws Exception {
        try {
            return this.repositorio.save(datosMateria);
        }catch (Exception Error){
            throw new Exception();
        }

    }
    public List<Materia> listaMateria () throws Exception{
        try {
            return this.repositorio.findAll();
        }catch (Exception Error){
            throw new Exception();
        }
    }

}
