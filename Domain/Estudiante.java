package Domain;

import java.util.List;

public class Estudiante {

    private String nombre;
    private String codigoEstudiantil;
    private List<Matricula> matriculas;
    private int semestre;


    public Estudiante(String nombre, String codigoEstudiantil, List<Matricula> matriculas, int semestre) {
        this.nombre = nombre;
        this.codigoEstudiantil = codigoEstudiantil;
        this.matriculas = matriculas;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEstudiantil() {
        return codigoEstudiantil;
    }

    public void setCodigoEstudiantil(String codigoEstudiantil) {
        this.codigoEstudiantil = codigoEstudiantil;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    @Override
    public String toString() {
        return "Estudiante: " + nombre + ", Código: " + codigoEstudiantil + ", Semestre: " + semestre + ", Matrículas: " + matriculas;
    }
    

}
