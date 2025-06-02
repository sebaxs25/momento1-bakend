package com.example.momento1.controladores;

import com.example.momento1.modelos.Usuario;
import com.example.momento1.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/usuarios")
@RestController
public class UsuarioControlador {
    @Autowired
    UsuarioServicio servicio;
    @PostMapping
    public ResponseEntity<?> guardarUsuario(@RequestBody Usuario datosNuevos){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.servicio.guardarUsuario(datosNuevos));
        }catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }


}
