package com.example.momento1.modelos;
import jakarta.persistence.*;
@Entity
@Table (name ="curso")
public class Curso {
     @Id
     @GeneratedValue (strategy = GenerationType.IDENTITY)
     @Column (name = "idcurso")
    private Integer IdCurso;
     @Column (name = "nombre", nullable = false, length = 100)
    private String Nombre;
     @Column ( name = "iddocente")
    private Integer IdDoncete;

    public Curso() {

    }

    public Curso(Integer idCurso, String nombre, Integer idDoncete) {
        IdCurso = idCurso;
        Nombre = nombre;
        IdDoncete = idDoncete;
    }

    public Integer getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(Integer idCurso) {
        IdCurso = idCurso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getIdDoncete() {
        return IdDoncete;
    }

    public void setIdDoncete(Integer idDoncete) {
        IdDoncete = idDoncete;
    }
}
