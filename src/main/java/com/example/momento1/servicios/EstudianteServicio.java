package com.example.momento1.servicios;

import com.example.momento1.modelos.Estudiante;
import com.example.momento1.repositorio.IEstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
