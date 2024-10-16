package Domain;

import java.util.List;

public class Administrativo {

    private List<Matricula> matriculas;
    private String nombre;
    private Departamento departamento;
    private String identificacion;


    public Administrativo(List<Matricula> matriculas, String nombre, Departamento departamento, String identificacion) {
        this.matriculas = matriculas;
        this.nombre = nombre;
        this.departamento = departamento;
        this.identificacion = identificacion;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Administrativo: " + nombre + ", Identificación: " + identificacion + ", Departamento: " + departamento.getNombreDelDepartamento();
    }
    

}
