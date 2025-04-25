package com.example.momento1.palabras;

public enum MensajesAPI {
    ERROR_DOCENTE_NO_ENCONTRADO("El docente que buscas no est en la base de datos"),
    ERROR_ESTUDIANTE_NO_ENCONTRADO("El estudiante que buscas no est en la base de datos"),
    ERROR_ASISTENCIA_NO_ENCONTRADO("El asistencia que buscas no est en la base de datos"),
    ERROR_CALIFICACION_NO_ENCONTRADO("El calificacion que buscas no est en la base de datos"),
    ERROR_INSCRIPCION_NO_ENCONTRADO("La inscripcion que buscas no est en la base de datos"),
    ERROR_MATERIA_ENCONTRADO("La materia que buscas no est en la base de datos"),
    ERROR_CURSO_NO_ENCONTRADO("El curso que buscas no est en la base de datos"),
    ERROR_USUARIO_NO_ENCONTRADO("El usuario que buscas no est en la base de datos")
    ;
    private   String mensaje;

    MensajesAPI(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
