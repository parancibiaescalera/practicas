package ejercicio3_6;

import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Calcular promedio del curso");
            System.out.println("5. Obtener cantidad de estudiantes que aprobaron");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del estudiante: ");
                    String nombre = scanner.next();
                    System.out.print("Apellidos del estudiante: ");
                    String apellidos = scanner.next();
                    System.out.print("Código del estudiante: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Semestre del estudiante: ");
                    int semestre = scanner.nextInt();
                    System.out.print("Nota Final del estudiante: ");
                    double notaFinal = scanner.nextDouble();
                    curso.agregarEstudiante(nombre, apellidos, codigo, semestre, notaFinal);
                    break;
                case 2:
                    System.out.print("Ingrese el código del estudiante a buscar: ");
                    int codigoBuscar = scanner.nextInt();
                    curso.buscarEstudiante(codigoBuscar);
                    break;
                case 3:
                    System.out.print("Ingrese el código del estudiante a eliminar: ");
                    int codigoEliminar = scanner.nextInt();
                    curso.eliminarEstudiante(codigoEliminar);
                    break;
                case 4:
                    curso.calcularPromedioCurso();
                    break;
                case 5:
                    curso.obtenerCantidadAprobados();
                    break;
            }
        } while (opcion != 0);
    }
}

