package com.example.momento1.modelos;
import jakarta.persistence.*;
@Entity
@Table (name ="docente")
public class Docente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "iddocente")
    private Integer IdDocente;
    @Column (name = "idusuario")
   private Integer IdUsuario;
     @Column (name= "espacialidad", nullable = false, length = 100)
   private String Especialidad;

    public Docente() {
    }

    public Docente(Integer idDocente, Integer idUsuario, String especialidad) {
        IdDocente = idDocente;
        IdUsuario = idUsuario;
        Especialidad = especialidad;
    }

    public Integer getIdDocente() {
        return IdDocente;
    }

    public void setIdDocente(Integer idDocente) {
        IdDocente = idDocente;
    }

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }
}
