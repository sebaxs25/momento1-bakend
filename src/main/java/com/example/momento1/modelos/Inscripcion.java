package com.example.momento1.modelos;
import jakarta.persistence.*;
import java.sql.Date;
@Entity
@Table (name ="inscripcion")
public class Inscripcion {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "idinscripcion")
   private Integer IdInscripcion;
    @Column (name = "idestudiante")
   private Integer IdEstudiante;
    @Column (name ="idcurso")
    private Integer IdCurso;
    @Column (name= "fechainscripcion")
   private Date FechaInscripcion;

    public Inscripcion() {

    }

    public Inscripcion(Integer idInscripcion, Integer idEstudiante, Integer idCurso, Date fechaInscripcion) {
        IdInscripcion = idInscripcion;
        IdEstudiante = idEstudiante;
        IdCurso = idCurso;
        FechaInscripcion = fechaInscripcion;
    }

    public Integer getIdInscripcion() {
        return IdInscripcion;
    }

    public void setIdInscripcion(Integer idInscripcion) {
        IdInscripcion = idInscripcion;
    }

    public Integer getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        IdEstudiante = idEstudiante;
    }

    public Integer getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(Integer idCurso) {
        IdCurso = idCurso;
    }

    public Date getFechaInscripcion() {
        return FechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        FechaInscripcion = fechaInscripcion;
    }
}
