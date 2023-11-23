package ejercicio4_1;

class Cuenta {
    protected float saldo;
    protected int numConsignaciones;
    protected int numRetiros;
    protected float tasaAnual;
    protected float comisionMensual;
    public Cuenta(float saldoInicial, float tasaAnual) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;
    }
    public void consignar(float cantidad) {
        saldo += cantidad;
        numConsignaciones++;
    }
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            numRetiros++;
        }
    }
    public void calcularInteresMensual() {
        float interesMensual = saldo * (tasaAnual / 12) / 100;
        saldo += interesMensual;
    }
    public void extractoMensual() {
        calcularInteresMensual();
        saldo -= comisionMensual;
    }
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión Mensual: " + comisionMensual);
        System.out.println("Número de Transacciones: " + (numConsignaciones + numRetiros));
    }
}
class CuentaAhorros extends Cuenta {
    private boolean cuentaActiva;
    public CuentaAhorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        cuentaActiva = (saldo >= 10000);
    }
    @Override
    public void consignar(float cantidad) {
        if (cuentaActiva) {
            super.consignar(cantidad);
        }
    }
    @Override
    public void retirar(float cantidad) {
        if (cuentaActiva) {
            super.retirar(cantidad);
        }
    }
    @Override
    public void extractoMensual() {
        if (numRetiros > 4) {
            comisionMensual += (numRetiros - 4) * 1000;
        }
        super.extractoMensual();
    }
    public void imprimir() {
        super.imprimir();
        System.out.println("Cuenta Activa: " + cuentaActiva);
    }
}
class CuentaCorriente extends Cuenta {
    private float sobregiro;

    public CuentaCorriente(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        sobregiro = 0;
    }
    @Override
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            super.retirar(cantidad);
        } else {
            sobregiro += (cantidad - saldo);
            saldo = 0;
        }
    }
    @Override
    public void consignar(float cantidad) {
        super.consignar(cantidad);
        if (sobregiro > 0) {
            if (cantidad <= sobregiro) {
                sobregiro -= cantidad;
            } else {
                sobregiro = 0;
            }
        }
    }
    public void imprimir() {
        super.imprimir();
        System.out.println("Sobregiro: " + sobregiro);
    }
}