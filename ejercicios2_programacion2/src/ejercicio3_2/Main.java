package ejercicio3_2;

public class Main {
    public static void main(String[] args) {
    Cadena cadena = new Cadena("Programación Orientada a Objetos ");

    // Realizar las operaciones
        System.out.println("Longitud: " + cadena.obtenerLongitud());
        cadena.eliminarEspacios();
        cadena.convertirAMayusculas();
        cadena.concatenar12345();
    String sub = cadena.extraerSubstring();
        if (sub != null) {
        System.out.println("Substring: " + sub);
    }
        cadena.reemplazarLetra();
        System.out.println("Comparación con 'Programación': " + cadena.compararConProgramacion());

    // Ejercicios propuestos
        System.out.println("Mayúsculas en el texto: " + cadena.contarMayusculas());
        System.out.println("Ocurrencias de 'a': " + cadena.contarOcurrenciasDeLetra('a'));

        System.out.print("Texto sin espacios: ");
        cadena.eliminarEspaciosEnBlanco();

        System.out.println("Texto al revés: " + cadena.obtenerReverso());
    }
}

