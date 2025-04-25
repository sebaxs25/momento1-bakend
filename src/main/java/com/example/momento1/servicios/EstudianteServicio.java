package com.example.momento1.servicios;

import com.example.momento1.modelos.Estudiante;
import com.example.momento1.palabras.MensajesAPI;
import com.example.momento1.repositorio.IEstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServicio {
    @Autowired
    IEstudianteRepositorio repositorio;
    public Estudiante guardarEstudiante(Estudiante datosEstudainte) throws Exception {
        try {
            return this.repositorio.save(datosEstudainte);
        } catch (Exception Error) {
            throw new Exception();
        }
    }
        public List<Estudiante> listaEstudiante() throws Exception{
        try {
            return this.repositorio.findAll();
        }catch (Exception Error) {
            throw new Exception();
        }
    }
    //bucar por id
    public Estudiante buscarEstudiante(Integer id) throws Exception{
        try{
            Optional<Estudiante> estudianteBuscar = this.repositorio.findById(id);
            if (estudianteBuscar.isPresent()){
                return estudianteBuscar.get();
            }else{
                throw new Exception(MensajesAPI.ERROR_ESTUDIANTE_NO_ENCONTRADO.getMensaje());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    public Estudiante modificarEstudiante (Integer id, Estudiante datosNuevosEstudiantes) throws Exception{
        try {
            Optional<Estudiante>estudianteAModficar=this.repositorio.findById(id);
            if (estudianteAModficar.isPresent()){
                estudianteAModficar.get().setGrado(datosNuevosEstudiantes.getGrado());
                return this.repositorio.save(estudianteAModficar.get());

            }else{
                throw new Exception(MensajesAPI.ERROR_ESTUDIANTE_NO_ENCONTRADO.getMensaje());
            }
        } catch (Exception error) {
                throw new Exception(error.getMessage());

        }
    }
    //eliminar
    public boolean eleminarEstudiante(Integer id) throws Exception{
        try{
            Optional<Estudiante>estudianteEliminado=this.repositorio.findById(id);
            if (estudianteEliminado.isPresent()){
                this.repositorio.deleteById(id);
                return true;
            }else {
                throw new Exception(MensajesAPI.ERROR_ESTUDIANTE_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
}
