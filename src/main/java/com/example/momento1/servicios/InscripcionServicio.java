package com.example.momento1.servicios;

import com.example.momento1.modelos.Inscripcion;
import com.example.momento1.repositorio.IInscripcionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscripcionServicio {
    @Autowired
    IInscripcionRepositorio repositorio;
    public Inscripcion guardarIncripcion (Inscripcion datosIncripcion) throws Exception {
        try {
                return this.repositorio.save(datosIncripcion);
        }catch (Exception Error){
            throw new Exception();
        }

    }
    public List<Inscripcion> listaInscripcion() throws Exception{
        try{
            return this.repositorio.findAll();
        }catch (Exception Error){
            throw new Exception();
        }
    }


}
