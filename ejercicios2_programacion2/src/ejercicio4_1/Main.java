package ejercicio4_1;

public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(15000, 5);
        cuentaAhorros.consignar(5000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.retirar(500);
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();

        CuentaCorriente cuentaCorriente = new CuentaCorriente(1000, 3);
        cuentaCorriente.consignar(2000);
        cuentaCorriente.retirar(2500);
        cuentaCorriente.consignar(1500);
        cuentaCorriente.extractoMensual();
        cuentaCorriente.imprimir();
    }
}
