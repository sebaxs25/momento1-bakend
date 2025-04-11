package com.example.momento1.servicios;

import com.example.momento1.modelos.Calificacion;
import com.example.momento1.repositorio.ICalificacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalificacionServicio {
    @Autowired
    ICalificacionRepositorio repositorio;
    public Calificacion guardaCalificacion (Calificacion datosCalificacion)throws Exception{
        try{
            return this.repositorio.save(datosCalificacion);
        } catch (Exception Error) {
            throw new Exception();
        }

    }
    public List<Calificacion> listaCalificacion () throws Exception{
        try {
            return this.repositorio.findAll();
        }catch (Exception Error) {
            throw new Exception();
        }
    }

}
