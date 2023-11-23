package ejercicio3_7;

public class TiendaDeComputadores {
    private String nombreTienda;
    private String propietarioTienda;
    private String identificadorTributario;
    private Computador[] computadores;
    private int cantidadComputadores;
    public TiendaDeComputadores(String nombreTienda, String propietarioTienda, String identificadorTributario, int capacidadMaxima) {
        this.nombreTienda = nombreTienda;
        this.propietarioTienda = propietarioTienda;
        this.identificadorTributario = identificadorTributario;
        this.computadores = new Computador[capacidadMaxima];
        this.cantidadComputadores = 0;
    }
    public void agregarComputador(Computador computador) {
        if (cantidadComputadores < computadores.length) {
            computadores[cantidadComputadores] = computador;
            cantidadComputadores++;
        } else {
            System.out.println("La tienda está llena, no se puede agregar más computadoras.");
        }
    }
    public void eliminarComputadorPorMarca(String marca) {
        for (int i = 0; i < cantidadComputadores; i++) {
            if (computadores[i] != null && computadores[i].getMarca().equalsIgnoreCase(marca)) {
                for (int j = i; j < cantidadComputadores - 1; j++) {
                    computadores[j] = computadores[j + 1];
                }
                computadores[cantidadComputadores - 1] = null;
                cantidadComputadores--;
                System.out.println("Computador eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ningún computador con la marca especificada.");
    }
    public void buscarComputadorPorMarca(String marca) {
        for (int i = 0; i < cantidadComputadores; i++) {
            if (computadores[i] != null && computadores[i].getMarca().equalsIgnoreCase(marca)) {
                System.out.println("Información del computador encontrado:");
                System.out.println(computadores[i]);
                return;
            }
        }
        System.out.println("No se encontró ningún computador con la marca especificada.");
    }
    public void listarInformacionDeComputadores() {
        System.out.println("Información de todos los computadores en la tienda:");
        for (int i = 0; i < cantidadComputadores; i++) {
            System.out.println(computadores[i]);
        }
    }
    public static void main(String[] args) {
        TiendaDeComputadores tienda = new TiendaDeComputadores("Mi Tienda", "Propietario", "12345", 10);

        Computador computador1 = new Computador("Marca1", 8, "Procesador1", "Sistema1", 1000.0);
        Computador computador2 = new Computador("Marca2", 16, "Procesador2", "Sistema2", 1500.0);

        tienda.agregarComputador(computador1);
        tienda.agregarComputador(computador2);

        tienda.listarInformacionDeComputadores();

        tienda.eliminarComputadorPorMarca("Marca1");
        tienda.listarInformacionDeComputadores();

        tienda.buscarComputadorPorMarca("Marca2");
    }
}
/*
Despues de mucho esfuerzo al fin pude encontrar, la solucion para el problema del vector tenia que agregar
una nueva clase para el mismo, despues de 2 semanas programando y quemando mi cabeza... XD
*/
class Computador {
    private String marca;
    private int cantidadMemoria;
    private String caracteristicasProcesador;
    private String sistemaOperativo;
    private double precio;

    public Computador(String marca, int cantidadMemoria, String caracteristicasProcesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.cantidadMemoria = cantidadMemoria;
        this.caracteristicasProcesador = caracteristicasProcesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    @Override
    public String toString() {
        return "Marca: " + marca + ", Memoria: " + cantidadMemoria + " GB, Procesador: " + caracteristicasProcesador + ", Sistema Operativo: " + sistemaOperativo + ", Precio: $" + precio;
    }
}
