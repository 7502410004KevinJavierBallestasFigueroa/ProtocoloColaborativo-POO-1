package Domain;

import java.util.List;

public class Universidad {

    private String nombre;
    private String NIT;
    private String direccion;
    private List<Departamento> departamentos;


    public Universidad(String nombre, String NIT, String direccion, List<Departamento> departamentos) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.direccion = direccion;
        this.departamentos = departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "Universidad: " + nombre + ", NIT: " + NIT + ", Dirección: " + direccion + ", Departamentos: " + departamentos;
    }    
}

