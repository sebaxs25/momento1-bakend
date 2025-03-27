package com.example.momento1.modelos;
import jakarta.persistence.*;
import java.sql.Date;
@Entity
@Table (name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name= "id_estudiante")
    private Integer IdEstudiante;
    @Column (name ="id_usuario")
    private Integer IdUsuario;
    @Column (name = "grado", nullable = false)
    private Integer Grado;
    @Column (name = "fecha_nacimento", nullable = false)
    private Date FechaNacimiento;
    @Column (name = "direccion", nullable = false, length = 255)
    private String direccion;

    public Estudiante() {

    }

    public Estudiante(Integer idEstudiante, Integer idUsuario, Integer grado, Date fechaNacimiento, String direccion) {
        IdEstudiante = idEstudiante;
        IdUsuario = idUsuario;
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

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        IdUsuario = idUsuario;
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







