package Domain;

import java.util.List;

public class Profesor {

    private String nombre;
    private String identificacion;
    private String experiencia;
    private List<Curso> cursos;


    public Profesor(String nombre, String identificacion, String experiencia, List<Curso> cursos) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.experiencia = experiencia;
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    @Override
    public String toString() {
        return "Profesor: " + nombre + ", Identificación: " + identificacion + ", Experiencia: " + experiencia + ", Cursos: " + cursos;
    }
    

}
