package Main;

import Domain.Universidad;
import Domain.Curso;
import Domain.Departamento;
import Domain.Estudiante;
import Domain.Matricula;
import Domain.Profesor;
import Domain.Administrativo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//CREACION DE LISTAS
        List<Departamento> departamentos = new ArrayList<>();
        List<Curso> cursos = new ArrayList<>();
        List<Administrativo> administrativosDep1  = new ArrayList<>();
        List<Administrativo> administrativosDep2  = new ArrayList<>();
        List<Matricula> matriculasEstudiante1  = new ArrayList<>();
        List<Matricula> matriculasEstudiante2  = new ArrayList<>();
        List<Matricula> matriculasEstudiante3  = new ArrayList<>();
        List<Matricula> matriculasCurso1  = new ArrayList<>();
        List<Matricula> matriculasCurso2  = new ArrayList<>();
        List<Curso> cursosDep1  = new ArrayList<>();
        List<Curso> cursosDep2  = new ArrayList<>();
        List<Matricula> matriculasAdmin1  = new ArrayList<>();
        List<Matricula> matriculasAdmin2  = new ArrayList<>();
        List<Matricula> matriculasAdmin3  = new ArrayList<>();

        
//CREACION DE OBJETO UNIVERSIDAD
        Universidad universidad = new Universidad("Universidad de Cartagena", "890.480.123-5", "Carrera sexta # 36 - 100", null);

//CREACION DE OBJETOS DEPARTAMENTOS
        Departamento departamento1 = new Departamento(universidad, "Ingenieria", "Ciencias de la salud y ciencias exactas", null, null);

        Departamento departamento2 = new Departamento(universidad, "Ciencias exactas", "Ingenieria y lenguas", null, null);

        departamentos.add(departamento1);
        departamentos.add(departamento2);

//CREACION DE OBJETOS ADMINISTRATIVOS
        Administrativo administrativo1 = new Administrativo(null, "Andres Villalobos", departamento1, "CC-1387208031");
        
        Administrativo administrativo2 = new Administrativo(null, "Andrés Martínez", departamento1, "CC-2468101357");

        Administrativo administrativo3 = new Administrativo(null, "Sofía Ramírez", departamento2, "CE-9876543210");

        administrativosDep1.add(administrativo1);
        administrativosDep1.add(administrativo2);
        administrativosDep2.add(administrativo3);

//CREACION DE OBJETOS ESTUDIANTES
        Estudiante estudiante1 = new Estudiante("Kevin Ramirez", "30189238901", null, 2);
        
        Estudiante estudiante2 = new Estudiante("Juan de la oz", "324134452", null, 3);
        
        Estudiante estudiante3 = new Estudiante("Andrea Veracruz", "3580990834", null, 2);

//CREACION DE OBJETOS PROFESORES
        Profesor profesor1 = new Profesor("Felipe Ramos", "CC-128930121", "2 años en matemáticas", null);

//CREACION DE OBJETOS CURSOS

        Curso curso1 = new Curso("Matematicas",null, 2, departamento1, profesor1);
        Curso curso2 = new Curso("POO",null, 3, departamento2, profesor1);

//CREACION DE OBJETOS MATRICULAS

        Matricula matricula1 = new Matricula("M-01", estudiante1, new Date(), curso1, administrativo1,2.5,4.5,3.8);
        Matricula matricula2 = new Matricula("M-02", estudiante2, new Date(), curso1, administrativo2,3.6,4.7,5.0);
        Matricula matricula3 = new Matricula("M-03", estudiante2, new Date(), curso2, administrativo2, 3.8,4.7,2.8);
        Matricula matricula4 = new Matricula("M-04", estudiante3, new Date(), curso2, administrativo3, 3.3,4.1,2.8);

//AÑADIR LISTAS
        matriculasEstudiante1.add(matricula1);
        matriculasEstudiante2.add(matricula2);
        matriculasEstudiante2.add(matricula3);
        matriculasEstudiante3.add(matricula4);

        matriculasCurso1.add(matricula1);
        matriculasCurso1.add(matricula2);
        matriculasCurso2.add(matricula3);
        matriculasCurso2.add(matricula4);

        cursosDep1.add(curso1);
        cursosDep2.add(curso2);

        matriculasAdmin1.add(matricula1);
        matriculasAdmin2.add(matricula2);
        matriculasAdmin2.add(matricula2);
        matriculasAdmin3.add(matricula3);

        cursos.add(curso1);
        cursos.add(curso2);


//SET A ATRIBUTOS
        //DEPARTAMENTO
        departamento1.setCursos(cursosDep1);
        departamento2.setCursos(cursosDep2);

        //UNIVERSIDAD
        universidad.setDepartamentos(departamentos);

        //ADMINISTRATIVO
        administrativo1.setMatriculas(matriculasAdmin1);
        administrativo2.setMatriculas(matriculasAdmin2);
        administrativo3.setMatriculas(matriculasAdmin3);

        //ESTUDIANTE
        estudiante1.setMatriculas(matriculasEstudiante1);
        estudiante2.setMatriculas(matriculasEstudiante2);
        estudiante3.setMatriculas(matriculasEstudiante3);

        //PROFESOR
        profesor1.setCursos(cursos);

        //CURSO
        curso1.setMatriculas(matriculasCurso1);
        curso2.setMatriculas(matriculasCurso2);

        
        System.out.println("DATOS UNIVERSIDAD");
        System.out.println(universidad);
        System.out.println("");
        System.out.println("DATOS DEPARTAMENTO");
        System.out.println("");
        System.out.println(departamento1);
        System.out.println(departamento2);
        System.out.println("");
        System.out.println("DATOS PERSONAL ADMINISTRATIVO");
        System.out.println("");
        System.out.println(administrativo1);
        System.out.println(administrativo2);
        System.out.println(administrativo3);
        System.out.println("");
        System.out.println("DATOS DE ESTUDIANTES");
        System.out.println("");
        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante3);

    }
}


