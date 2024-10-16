package Domain;

import java.util.Date;

public class Matricula {

    private String numeroDeMatricula;
    private Estudiante estudiante;
    private Date fechaDeMatricula;
    private Curso curso;
    private Administrativo administrativo;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;

    public Matricula(String numeroDeMatricula, Estudiante estudiante, Date fechaDeMatricula, Curso curso, Administrativo administrativo, double calificacion1, double calificacion2, double calificacion3) {
        this.numeroDeMatricula = numeroDeMatricula;
        this.estudiante = estudiante;
        this.fechaDeMatricula = fechaDeMatricula;
        this.curso = curso;
        this.administrativo = administrativo;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Date getFechaDeMatricula() {
        return fechaDeMatricula;
    }

    public void setFechaDeMatricula(Date fechaDeMatricula) {
        this.fechaDeMatricula = fechaDeMatricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Administrativo getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(Administrativo administrativo) {
        this.administrativo = administrativo;
    }

    public double getCalificacion1() {
        return calificacion1;
    }

    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public double getCalificacion2() {
        return calificacion2;
    }

    public void setCalificacion2(float calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public double getCalificacion3() {
        return calificacion3;
    }

    public void setCalificacion3(float calificacion3) {
        this.calificacion3 = calificacion3;
    }


    @Override
    public String toString() {
        return "Matrícula no°: " + numeroDeMatricula + ", Estudiante: " + estudiante.getNombre() + ", Fecha: " + fechaDeMatricula + ", Curso: " + curso.getNombre() + ", Personal administrativo que realiza la matricula: " + administrativo.getNombre() +
               ", Calificaciones: " + calificacion1 + ", " + calificacion2 + ", " + calificacion3;
    }
}

      

