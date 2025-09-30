import javax.swing.*;

public class Cuenta {
    protected float saldo;
    protected int numConsignaciones = 0;
    protected int numRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        if (cantidad <= 0) {
            JOption("La cantidad debe ser mayor a 0");
            return;
        }
        this.saldo += cantidad;
        this.numConsignaciones++;
    }

    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            numRetiros++;
            JOption("Retiro exitoso");
        } else {
            JOption("Fondos insuficientes, no se pudo retirar: " + cantidad);
        }
    }

    public float calcularInteresMensual() {
        float tasaMensual = tasaAnual / 12;
        return saldo * tasaMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        saldo += calcularInteresMensual();
    }

    public void imprimir() {
        JOption("Saldo: " + saldo);
        JOption("Consignaciones: " + numConsignaciones);
        JOption("Retiros: " + numRetiros);
        JOption("Tasa anual: " + tasaAnual);
        JOption("Comisión mensual: " + comisionMensual);
    }

    public void JOption(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
