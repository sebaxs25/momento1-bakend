package com.example.momento1.modelos;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table (name ="asistencia")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idasistencia")
    private Integer IdAsistencia;
    @Column (name= "idestudiante")
    private Integer IdEstudiante;
    @Column (name = "idcurso")
    private Integer IdCurso;
    @Column (name ="fecha", nullable = false)
    private Date fecha;
    @Column (name = "estado", nullable = false)
    private String Estado;

    public Asistencia() {

    }

    public Asistencia(Integer idAsistencia, Integer idEstudiante, Integer idCurso, Date fecha, String estado) {
        IdAsistencia = idAsistencia;
        IdEstudiante = idEstudiante;
        IdCurso = idCurso;
        this.fecha = fecha;
        Estado = estado;
    }

    public Integer getIdAsistencia() {
        return IdAsistencia;
    }

    public void setIdAsistencia(Integer idAsistencia) {
        IdAsistencia = idAsistencia;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}