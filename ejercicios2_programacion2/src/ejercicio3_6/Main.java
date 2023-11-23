package ejercicio3_6;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Mi Tienda", "Juan Pérez", "123456789");
        tienda.agregarComputador(new Computador("HP", 8, "Intel i5", "Windows 10", 800.0));
        tienda.agregarComputador(new Computador("Dell", 16, "AMD Ryzen 7", "Windows 11", 1200.0));

        tienda.eliminarComputadorPorMarca("HP");

        Computador encontrado = tienda.buscarComputadorPorMarca("Dell");
        if (encontrado != null) {
            System.out.println("Computador encontrado: " + encontrado.getMarca());
        } else {
            System.out.println("Computador no encontrado.");
        }
        List<Computador> computadores = tienda.listarComputadores();
        System.out.println("Lista de computadores en la tienda:");
        for (Computador computador : computadores) {
            System.out.println(computador.getMarca() + " - Precio: " + computador.getPrecio());
        }
    }
}
