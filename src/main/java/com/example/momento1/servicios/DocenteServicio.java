package com.example.momento1.servicios;

import
        com.example.momento1.modelos.Docente;
import com.example.momento1.palabras.MensajesAPI;
import com.example.momento1.repositorio.IDocenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public  Docente buscarDocentePorId (Integer id) throws Exception{
        try{
            Optional<Docente> docenteQueEstoyBuscando=this.repositorio.findById(id);
            if (docenteQueEstoyBuscando.isPresent()){
                return docenteQueEstoyBuscando.get();
            }else{
                throw new Exception(MensajesAPI.ERROR_DOCENTE_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //metodo para modificar
    public  Docente modificarDocente(Integer id, Docente datosNuevosDocente) throws Exception{
        try {
            Optional<Docente>docenteQueEstoyBuscando=this.repositorio.findById(id);
            if (docenteQueEstoyBuscando.isPresent()){
                docenteQueEstoyBuscando.get().setEspecialidad(datosNuevosDocente.getEspecialidad());
                //guardo las modificaciones
                return this.repositorio.save(docenteQueEstoyBuscando.get());
            }else {
                throw new Exception(MensajesAPI.ERROR_DOCENTE_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception error){
            throw new Exception( error.getMessage());
        }


    }
    //metodo para eliminar
    public boolean eliminarDocente (Integer id) throws Exception{
        try{
            Optional<Docente>docenteQueBuscando=this.repositorio.findById(id);
            if (docenteQueBuscando.isPresent()){

                this.repositorio.deleteById(id);
                return true;
            }else{
                throw  new Exception(MensajesAPI.ERROR_DOCENTE_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
