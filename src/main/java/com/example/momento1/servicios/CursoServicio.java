package com.example.momento1.servicios;

import com.example.momento1.modelos.Curso;
import com.example.momento1.palabras.MensajesAPI;
import com.example.momento1.repositorio.ICursoRepositorio;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    //buscarportodos
    public Curso buscarCursoPorId (Integer id) throws Exception{
        try {
            Optional<Curso> buscarCurso=this.repositorio.findById(id);
            if (buscarCurso.isPresent()){
                return buscarCurso.get();
            }else {
                throw new Exception(MensajesAPI.ERROR_CURSO_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception error){
            throw new Exception(MensajesAPI.ERROR_DOCENTE_NO_ENCONTRADO.getMensaje());

        }
    }
    //modificar
    public Curso modificarCurso(Integer id, Curso datosNuevosCurso) throws Exception{
        try{
            Optional<Curso>cambiarCurso=this.repositorio.findById(id);
            if (cambiarCurso.isPresent()){
                cambiarCurso.get().setIdDoncete(datosNuevosCurso.getIdDoncete());
                return this.repositorio.save(cambiarCurso.get());

            }else{
                throw new Exception(MensajesAPI.ERROR_CURSO_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
    public boolean eliminarCurso (Integer id) throws Exception{
        try {
            Optional<Curso>cursoEliminado=this.repositorio.findById(id);
            if (cursoEliminado.isPresent()){
                this.repositorio.deleteById(id);
                return true;

            }else{
                throw new Exception(MensajesAPI.ERROR_CURSO_NO_ENCONTRADO.getMensaje());

            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
