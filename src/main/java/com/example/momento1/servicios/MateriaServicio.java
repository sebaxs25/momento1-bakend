package com.example.momento1.servicios;


import com.example.momento1.modelos.Materia;
import com.example.momento1.palabras.MensajesAPI;
import com.example.momento1.repositorio.IMateriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaServicio {
    @Autowired
    IMateriaRepositorio repositorio;
    public Materia guardarMateria(Materia datosMateria) throws Exception {
        try {
            return this.repositorio.save(datosMateria);
        }catch (Exception Error){
            throw new Exception();
        }

    }
    public List<Materia> listaMateria () throws Exception{
        try {
            return this.repositorio.findAll();
        }catch (Exception Error){
            throw new Exception();
        }
    }
    //buscar por id
    public Materia buscarMateria(Integer id) throws Exception{
       try {
           Optional<Materia> encontrarMateria=this.repositorio.findById(id);
           if (encontrarMateria.isPresent()) {
               return encontrarMateria.get();
           }else{
              throw new Exception (MensajesAPI.ERROR_MATERIA_ENCONTRADO.getMensaje());
           }

       }catch (Exception error){
           throw new Exception(error.getMessage());


       }

    }
    //modificar
    public Materia modificarMateria (Integer id ,Materia datosNuevosMateria) throws Exception{
        try {
            Optional<Materia>materiaModificada=this.repositorio.findById(id);
            if (materiaModificada.isPresent()){
                materiaModificada.get().setNombre(datosNuevosMateria.getNombre());
                return this.repositorio.save(materiaModificada.get());
            }else {
                throw new Exception (MensajesAPI.ERROR_MATERIA_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
    public boolean eliminarMateria (Integer id) throws Exception{
        try {
            Optional<Materia>materiaEliminada=this.repositorio.findById(id);
            if (materiaEliminada.isPresent()){
                this.repositorio.deleteById(id);
                return true;
            }else{
                throw new Exception (MensajesAPI.ERROR_MATERIA_ENCONTRADO.getMensaje());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
