package com.example.momento1.servicios;

import com.example.momento1.modelos.Asistencia;
import com.example.momento1.repositorio.IAsistenciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsistenciasServicio {
    @Autowired
    IAsistenciaRepositorio repositorio;
    public Asistencia guardarAsistencia (Asistencia datosAsistencia) throws Exception {
        try {
            return this.repositorio.save(datosAsistencia);
        }catch (Exception Error){
            throw new Exception();
        }
    }
    public List<Asistencia> listaAsistencia() throws Exception{
        try {
            return this.repositorio.findAll();
        }catch (Exception Error){
            throw new Exception();
        }
    }
}
