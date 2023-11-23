package ejercicio3_6;

import java.util.ArrayList;
import java.util.Scanner;
// importaciones  de array

class Estudiante {
    String nombre;
    String apellidos;
    int codigo;
    int semestre;
    double notaFinal;

    public Estudiante(String nombre, String apellidos, int codigo, int semestre, double notaFinal) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.semestre = semestre;
        this.notaFinal = notaFinal;
    }
}

class Curso {
    ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    public void agregarEstudiante(String nombre, String apellidos, int codigo, int semestre, double notaFinal) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.codigo == codigo) {
                System.out.println("El código ya existe. No se puede agregar el estudiante.");
                return;
            }
        }
        Estudiante nuevoEstudiante = new Estudiante(nombre, apellidos, codigo, semestre, notaFinal);
        estudiantes.add(nuevoEstudiante);
        System.out.println("Estudiante agregado correctamente.");
    }
    public void buscarEstudiante(int codigo) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.codigo == codigo) {
                System.out.println("Nombre: " + estudiante.nombre + " " + estudiante.apellidos);
                System.out.println("Código: " + estudiante.codigo);
                System.out.println("Semestre: " + estudiante.semestre);
                System.out.println("Nota Final: " + estudiante.notaFinal);
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }
    public void eliminarEstudiante(int codigo) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.codigo == codigo) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiante.nombre + " " + estudiante.apellidos);
                System.out.println("Código: " + estudiante.codigo);
                System.out.println("Semestre: " + estudiante.semestre);
                System.out.println("Nota Final: " + estudiante.notaFinal);

                Scanner scanner = new Scanner(System.in);
                System.out.print("¿Confirmar eliminación? (S/N): ");
                String confirmacion = scanner.nextLine().trim().toLowerCase();

                if (confirmacion.equals("s")) {
                    estudiantes.remove(estudiante);
                    System.out.println("Estudiante eliminado correctamente.");
                } else {
                    System.out.println("Eliminación cancelada.");
                }
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }
    public void calcularPromedioCurso() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes en el curso.");
            return;
        }
        double sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.notaFinal;
        }
        double promedio = sumaNotas / estudiantes.size();
        System.out.println("El promedio del curso es: " + promedio);
    }
    public void obtenerCantidadAprobados() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes en el curso.");
            return;
        }
        int aprobados = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.notaFinal >= 3.0) {
                aprobados++;
            }
        }
        double porcentajeAprobados = (aprobados * 100.0) / estudiantes.size();
        System.out.println("Cantidad de estudiantes que aprobaron: " + aprobados);
        System.out.println("Porcentaje de estudiantes que aprobaron: " + porcentajeAprobados + "%");
    }
}
