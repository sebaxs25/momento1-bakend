package com.example.momento1.servicios;

import com.example.momento1.modelos.Docente;
import com.example.momento1.repositorio.IDocenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  DocenteServicio {
    @Autowired
    IDocenteRepositorio repositorio;

    //metodo para guardar
    public Docente guardarDocente(Docente datosDocente)throws Exception{
        try{
            return this.repositorio.save(datosDocente);
        }
        catch (Exception error){
            throw new Exception();
        }
    }
    //metodo para buscarTodos
    public List<Docente> listaDocentes()throws Exception{
        try {
            return this.repositorio.findAll();
        }catch (Exception error){
            throw new Exception();
        }
    }
    //metodo para buscarUnoporId
    //metodo para modificar
    //metodo para eliminar
}
