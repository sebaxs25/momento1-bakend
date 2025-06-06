package com.example.momento1.controladores;

import com.example.momento1.modelos.Inscripcion;
import com.example.momento1.servicios.InscripcionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/inscripciones")
@RestController
public class InscripcionControlador {
    @Autowired
    InscripcionServicio servicio;
    @PostMapping
    public ResponseEntity<?> guardarInscripcion (@RequestBody Inscripcion datosNuevos){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.servicio.guardarInscripcion(datosNuevos));
        }catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    }

