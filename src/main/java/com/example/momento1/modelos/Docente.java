package com.example.momento1.modelos;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name ="docente")
public class Docente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_docente")
    private Integer IdDocente;
    @OneToOne
    @JoinColumn (name = "fk_usuario", referencedColumnName = "id_usuario")
    @JsonManagedReference(value ="docente-usuario")
    private Usuario usuario;
    @Column (name= "espacialidad", nullable = false, length = 100)
    private String Especialidad;

     // CREANDO RELACION 1 A MUCHOS
     @OneToMany (mappedBy = "docente")
     @JsonManagedReference
     private List<Curso> curso;


    public Docente() {
    }

    public Docente(String especialidad, Usuario usuario, Integer idDocente) {
        Especialidad = especialidad;
        this.usuario = usuario;
        IdDocente = idDocente;
    }

    public Integer getIdDocente() {
        return IdDocente;
    }

    public void setIdDocente(Integer idDocente) {
        IdDocente = idDocente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }
}

