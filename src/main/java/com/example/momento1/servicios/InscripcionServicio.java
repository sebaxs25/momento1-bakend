package com.example.momento1.servicios;

import com.example.momento1.modelos.Inscripcion;
import com.example.momento1.palabras.MensajesAPI;
import com.example.momento1.repositorio.IInscripcionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    // buscarporid
    public Inscripcion buscarIncripcion(Integer id) throws Exception{
        try{
            Optional<Inscripcion>encontrarIncripcion= this.repositorio.findById(id);
            if (encontrarIncripcion.isPresent()){
                return encontrarIncripcion.get();
            }else{
                throw new Exception(MensajesAPI.ERROR_INSCRIPCION_NO_ENCONTRADO.getMensaje());

            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
//modificar
   public Inscripcion modificarIncripcion (Integer id, Inscripcion datosNuevosIncripcion) throws Exception{
        try {
            Optional<Inscripcion>inscripcionModificada=this.repositorio.findById(id);
            if (inscripcionModificada.isPresent()){
                inscripcionModificada.get().setFechaInscripcion(datosNuevosIncripcion.getFechaInscripcion());
                return this.repositorio.save(inscripcionModificada.get());
            }else {
                throw new Exception(MensajesAPI.ERROR_INSCRIPCION_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

   }
   //eliminar
    public boolean eliminarInscripion(Integer id) throws Exception{
       try {
           Optional<Inscripcion>eliminacionIncripcion = this.repositorio.findById(id);
           if (eliminacionIncripcion.isPresent()){
               this.repositorio.deleteById(id);
               return true;
           } else {
            throw new Exception(MensajesAPI.ERROR_INSCRIPCION_NO_ENCONTRADO.getMensaje());
        }
       }catch (Exception error){
           throw new Exception(error.getMessage());
       }
    }
}
