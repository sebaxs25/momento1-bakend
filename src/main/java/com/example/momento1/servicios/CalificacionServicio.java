package com.example.momento1.servicios;

import com.example.momento1.modelos.Calificacion;
import com.example.momento1.palabras.MensajesAPI;
import com.example.momento1.repositorio.ICalificacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    //buscarporid
    public Calificacion buscarCalificacionPorId (Integer id) throws Exception{
        try{
            Optional<Calificacion>buscarCalificacion = this.repositorio.findById(id);
            if(buscarCalificacion.isPresent()){
                return buscarCalificacion.get();
            }else{
                throw new Exception(MensajesAPI.ERROR_CALIFICACION_NO_ENCONTRADO.getMensaje());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //modificar
    public Calificacion modificarCalificacion (Integer id, Calificacion datosNuevosCalificacion) throws Exception {
        try {
            Optional<Calificacion>cambiarCalificacion = this.repositorio.findById(id);
            if (cambiarCalificacion.isPresent()){
                cambiarCalificacion.get().setNota(datosNuevosCalificacion.getNota());
                return this.repositorio.save(cambiarCalificacion.get());
            }else{
                throw new Exception(MensajesAPI.ERROR_CALIFICACION_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public boolean eliminarCalificacion (Integer id) throws Exception {
        try {
            Optional<Calificacion> calificacionQueEliminare = this.repositorio.findById(id);
            if (calificacionQueEliminare.isPresent()) {
                this.repositorio.deleteById(id);
                return true;
            }else{
                throw new Exception(MensajesAPI.ERROR_CALIFICACION_NO_ENCONTRADO.name());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
         
    }

}


