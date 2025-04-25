package com.example.momento1.servicios;

import com.example.momento1.modelos.Asistencia;
import com.example.momento1.palabras.MensajesAPI;
import com.example.momento1.repositorio.IAsistenciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsistenciasServicio {
    @Autowired
    IAsistenciaRepositorio repositorio;
    public Asistencia guardarAsistencia (Asistencia datosAsistencia) throws Exception {
        try {
            return this.repositorio.save(datosAsistencia);
        }catch (Exception Error){
            throw new Exception();
        }
    }
    public List<Asistencia> listaAsistencia() throws Exception{
        try {
            return this.repositorio.findAll();
        }catch (Exception Error){
            throw new Exception();
        }
    }
    public Asistencia buscarAsistenciaPorId (Integer id)throws  Exception{
        try{
            Optional<Asistencia> asistenciaQueBusco=this.repositorio.findById(id);
            if (asistenciaQueBusco.isPresent()){
               return asistenciaQueBusco.get();
            }
                else{
                throw new Exception(MensajesAPI.ERROR_ASISTENCIA_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public Asistencia modificarAsistencia (Integer id, Asistencia datosNuevosAsistencia) throws Exception {
        try {
            Optional<Asistencia> asistenciaQueModificare = this.repositorio.findById(id);
            if (asistenciaQueModificare.isPresent()) {
                asistenciaQueModificare.get().setEstado(datosNuevosAsistencia.getEstado());
                return this.repositorio.save(asistenciaQueModificare.get());
            } else {
                throw new Exception(MensajesAPI.ERROR_ASISTENCIA_NO_ENCONTRADO.getMensaje());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
        public boolean eliminarAsistencia (Integer id) throws Exception{
             try {
                 Optional<Asistencia> asistenciaQueEliminare=this.repositorio.findById(id);
                 if (asistenciaQueEliminare.isPresent()){
                      this.repositorio.deleteById(id);
                     return true;

                 }  else{
                       throw  new Exception(MensajesAPI.ERROR_ASISTENCIA_NO_ENCONTRADO.getMensaje());
                 }
             }catch (Exception error){
                 throw new  Exception(error.getMessage());
             }
        }


}
