package ejercicio3_6;

import java.util.ArrayList;
import java.util.List;

class Computador {
    private String marca;
    private int cantidadMemoria;
    private String procesador;
    private String sistemaOperativo;
    private double precio;

    public Computador(String marca, int cantidadMemoria, String procesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.cantidadMemoria = cantidadMemoria;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }
}

class Tienda {
    private String nombreTienda;
    private String propietario;
    private String identificadorTributario;
    private List<Computador> computadores;

    public Tienda(String nombreTienda, String propietario, String identificadorTributario) {
        this.nombreTienda = nombreTienda;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        this.computadores = new ArrayList<>();
    }

    public void agregarComputador(Computador computador) {
        computadores.add(computador);
    }

    public void eliminarComputadorPorMarca(String marca) {
        computadores.removeIf(computador -> computador.getMarca().equals(marca));
    }

    public Computador buscarComputadorPorMarca(String marca) {
        for (Computador computador : computadores) {
            if (computador.getMarca().equals(marca)) {
                return computador;
            }
        }
        return null;
    }

    public List<Computador> listarComputadores() {
        return computadores;
    }
}