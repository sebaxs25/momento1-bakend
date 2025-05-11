package com.example.momento1.controladores;

import com.example.momento1.modelos.Asistencia;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/asistencia")
@RestController
public class AsistenciaControlador {
    @Autowired
    AsistenciaControlador servicio;

    //guardar
    @PostMapping
    public ResponseEntity<?>guardarAsistencia(@RequestBody Asistencia datosAsistenia){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.servicio.guardarAsistencia(datosAsistenia));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
