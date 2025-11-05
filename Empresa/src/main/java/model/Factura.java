package model;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private int numero;
    private Date fecha;
    private Cliente cliente;
    private ArrayList<DetalleFactura> detalles;

    public Factura(int numero, Date fecha, Cliente cliente) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(Producto producto, int cantidad) {
        detalles.add(new DetalleFactura(producto, cantidad));
    }

    public double calcularTotal() {
        double subtotal = 0;
        for (DetalleFactura d : detalles) {
            subtotal += d.calcularSubtotal();
        }
        double descuento = cliente.calcularDescuento(subtotal);
        return subtotal - descuento;
    }

    public void mostrarFactura() {
        System.out.println("Factura #" + numero);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Detalles:");
        for (DetalleFactura d : detalles) {
            System.out.println("- " + d);
        }
        System.out.println("Total a pagar: $" + calcularTotal());
    }
    public String generarResumen() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura #").append(numero).append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
        sb.append("Detalles:\n");
        for (DetalleFactura d : detalles) {
            sb.append("- ").append(d.getProducto().getNombre())
                    .append(" x").append(d.getCantidad())
                    .append(" = $").append(d.calcularSubtotal()).append("\n");
        }
        sb.append("Total a pagar: $").append(calcularTotal()).append("\n");
        return sb.toString();
    }

}