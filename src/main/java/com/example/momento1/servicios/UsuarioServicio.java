package com.example.momento1.servicios;

import com.example.momento1.modelos.Materia;
import com.example.momento1.modelos.Usuario;
import com.example.momento1.palabras.MensajesAPI;
import com.example.momento1.repositorio.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.table.TableRowSorter;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio {
    @Autowired
    IUsuarioRepositorio repositorio;
    public Usuario guardarUsuario(Usuario datosUsuario) throws Exception {
        try {
            return this.repositorio.save(datosUsuario);
        }catch (Exception Error){
            throw new Exception();
        }

    }
    public List<Usuario> listaUsuario () throws Exception{
        try {
         return this.repositorio.findAll();
        }catch (Exception Error) {
            throw new Exception();
        }
    }
    //buscar por id
    public Usuario buscarUsuario (Integer id) throws Exception{
        try{
            Optional<Usuario> encontrarUsuario =this.repositorio.findById(id);
            if (encontrarUsuario.isPresent()){
                return encontrarUsuario.get();
            }else{
                throw new Exception(MensajesAPI.ERROR_USUARIO_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
    //modificar
    public Usuario modificarUsuario (Integer id, Usuario datosNuevosUsuarios) throws Exception{
        try {
            Optional<Usuario>usuarioModificados=this.repositorio.findById(id);
            if (usuarioModificados.isPresent()){
                usuarioModificados.get().setTelefono(datosNuevosUsuarios.getTelefono());
                return this.repositorio.save(usuarioModificados.get());
            }else {
                throw new Exception(MensajesAPI.ERROR_USUARIO_NO_ENCONTRADO.getMensaje());
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //eliminar
    public boolean eliminarUsuario (Integer id) throws Exception{
        try{
            Optional<Usuario>usuarioEliminado=this.repositorio.findById(id);
            if(usuarioEliminado.isPresent()){
                 this.repositorio.deleteById(id);
                 return true;
            }else{
                throw new Exception(MensajesAPI.ERROR_USUARIO_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
