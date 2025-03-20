package com.example.momento1.modelos;
import jakarta.persistence.*;
import java.sql.Date;
@Entity
@Table (name ="calificacion")
public class Calificacion {
     @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "idcalificacion")
    private Integer IdCalificacion;
    @Column (name = "idestudiante")
    private Integer IdEstudiante;
    @Column (name = "idmateria")
    private Integer IdMateria;
    @Column (name = "nota", nullable = false, scale = 2, precision = 5 )
    private Integer  Nota;
    @Column (name= "fechaevaluacion", nullable = false)
    private Date FechaEvaluacion;

    public Calificacion() {
    }

    public Calificacion(Integer idCalificacion, Integer idEstudiante, Integer idMateria, Integer nota, Date fechaEvaluacion) {
        IdCalificacion = idCalificacion;
        IdEstudiante = idEstudiante;
        IdMateria = idMateria;
        Nota = nota;
        FechaEvaluacion = fechaEvaluacion;
    }

    public Integer getIdCalificacion() {
        return IdCalificacion;
    }

    public void setIdCalificacion(Integer idCalificacion) {
        IdCalificacion = idCalificacion;
    }

    public Integer getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        IdEstudiante = idEstudiante;
    }

    public Integer getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(Integer idMateria) {
        IdMateria = idMateria;
    }

    public Integer getNota() {
        return Nota;
    }

    public void setNota(Integer nota) {
        Nota = nota;
    }

    public Date getFechaEvaluacion() {
        return FechaEvaluacion;
    }

    public void setFechaEvaluacion(Date fechaEvaluacion) {
        FechaEvaluacion = fechaEvaluacion;
    }
}
