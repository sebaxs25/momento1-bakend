package com.example.momento1.controladores;

import com.example.momento1.modelos.Estudiante;
import com.example.momento1.servicios.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/estudiantes")
@RestController
public class EstudianteControlador {
    @Autowired
    EstudianteServicio servicio;
    @PostMapping
    public ResponseEntity<?> guardarEstudiante (@RequestBody Estudiante datosNuevos) {
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.servicio.guardarEstudiante(datosNuevos));
        }catch (Exception error) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(error.getMessage());
    }
    }

}
