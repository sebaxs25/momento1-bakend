package com.example.momento1.modelos;
import jakarta.persistence.*;
@Entity
@Table (name ="materia")
public class Materia {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "idmateria")
    private Integer IdMateria;
    @Column (name = "nombre", nullable = false, length = 100 )
    private String Nombre;
    @Column (name = "idcurso")
    private Integer IdCurso;

    public Materia() {

    }

    public Materia(Integer idMateria, String nombre, Integer idCurso) {
        IdMateria = idMateria;
        Nombre = nombre;
        IdCurso = idCurso;
    }

    public Integer getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(Integer idMateria) {
        IdMateria = idMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(Integer idCurso) {
        IdCurso = idCurso;
    }
}
