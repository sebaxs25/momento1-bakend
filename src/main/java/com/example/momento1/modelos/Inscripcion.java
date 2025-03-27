package com.example.momento1.modelos;
import jakarta.persistence.*;
import java.sql.Date;
@Entity
@Table (name ="inscripcion")
public class Inscripcion {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_inscripcion")
   private Integer IdInscripcion;
    @Column (name = "id_estudiante")
   private Integer IdEstudiante;
    @Column (name ="id_curso")
    private Integer IdCurso;
    @Column (name= "fecha_inscripcion")
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
