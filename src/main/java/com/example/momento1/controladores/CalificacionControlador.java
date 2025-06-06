package com.example.momento1.controladores;

import com.example.momento1.modelos.Calificacion;
import com.example.momento1.servicios.CalificacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/calificaciones")
@RestController
public class CalificacionControlador {
    @Autowired
    CalificacionServicio servicio;
    //guardar
    @PostMapping
    public ResponseEntity<?> guardarCalificacion(@RequestBody Calificacion datosNuevos) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.servicio.guardarCalificacion(datosNuevos));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
