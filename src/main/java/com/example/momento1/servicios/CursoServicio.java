package com.example.momento1.servicios;

import com.example.momento1.modelos.Curso;
import com.example.momento1.repositorio.ICursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServicio {
    @Autowired
    ICursoRepositorio repositorio;
    public Curso guardarCurso(Curso datosCurso) throws Exception{
        try{
            return this.repositorio.save(datosCurso);
        }catch (Exception Error){
            throw new  Exception();
        }
    }
    public List<Curso> listaCurso () throws Exception{
        try {
         return this.repositorio.findAll();
        }catch (Exception Error) {
            throw new Exception();
        }

    }
}
