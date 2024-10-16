package Domain;

import java.util.List;

public class Curso {

    private String nombre;
    private List<Matricula> matriculas;
    private int creditos;
    private Departamento departamento;
    private Profesor profesor;

    public Curso(String nombre, List<Matricula> matriculas, int creditos, Departamento departamento, Profesor profesor) {
        this.nombre = nombre;
        this.matriculas = matriculas;
        this.creditos = creditos;
        this.departamento = departamento;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Curso: " + nombre + ", Créditos: " + creditos + ", Departamento: " + departamento.getNombreDelDepartamento() + ", Profesor: " + profesor.getNombre();
    }
}
