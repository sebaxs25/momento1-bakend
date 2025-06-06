package com.example.momento1.modelos;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table (name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Integer IdEstudiante;
    @OneToOne
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id_usuario", nullable = false)
    @JsonManagedReference(value = "estudiante-usuario")
    private Usuario usuario;
    @Column(name = "grado", nullable = false)
    private Integer Grado;
    @Column(name = "fecha_nacimento", nullable = false)
    private Date FechaNacimiento;
    @Column(name = "direccion", nullable = false, length = 255)
    private String direccion;


    @OneToOne(mappedBy = "estudiante")
    @JsonManagedReference
    private Inscripcion inscripcion;

    @OneToMany(mappedBy = "estudiante")
    @JsonManagedReference
    private List<Calificacion> calificacion;

    @OneToMany(mappedBy = "estudiante")
    @JsonManagedReference
    private List<Asistencia> asistencia;

    public Estudiante() {

    }

    public Estudiante(Integer idEstudiante, Usuario usuario, Integer grado, Date fechaNacimiento, String direccion) {
        IdEstudiante = idEstudiante;
        this.usuario = usuario;
        Grado = grado;
        FechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public Integer getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        IdEstudiante = idEstudiante;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getGrado() {
        return Grado;
    }

    public void setGrado(Integer grado) {
        Grado = grado;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}







