package Domain;

import java.util.List;
public class Departamento {

    private Universidad universidad;
    private String nombreDelDepartamento;
    private String facultades;
    private List<Curso> cursos;
    private List<Administrativo> administrativos;


    public Departamento(Universidad universidad, String nombreDelDepartamento, String facultades, List<Curso> cursos, List<Administrativo> administrativos) {
        this.universidad = universidad;
        this.nombreDelDepartamento = nombreDelDepartamento;
        this.facultades = facultades;
        this.cursos = cursos;
        this.administrativos = administrativos;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public String getNombreDelDepartamento() {
        return nombreDelDepartamento;
    }

    public void setNombreDelDepartamento(String nombreDelDepartamento) {
        this.nombreDelDepartamento = nombreDelDepartamento;
    }

    public String getFacultades() {
        return facultades;
    }

    public void setFacultades(String facultades) {
        this.facultades = facultades;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(List<Administrativo> administrativos) {
        this.administrativos = administrativos;
    }

    @Override
    public String toString() {
        return "Departamento: " + nombreDelDepartamento + ", Facultades: " + facultades + ", Universidad: " + universidad.getNombre();
    }
    

}
