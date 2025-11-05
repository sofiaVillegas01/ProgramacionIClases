package model;


import java.util.LinkedList;
import java.util.List;

public class DetalleFactura {
private Producto producto;
private int cantidad;
private List<Factura> listaFacturas;

    public DetalleFactura(Producto producto, int cantidad) {
        if(cantidad <= 0 || producto == null){
            throw new IllegalArgumentException("tiene que haber un producto");
        }
        this.producto = producto;
        this.cantidad = cantidad;
        this.listaFacturas = new LinkedList<>();
    }

    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecioUnitario() * cantidad;
    }

    @Override
    public String toString() {
        return "DetalleFactura [producto=" + producto + ", cantidad=" + cantidad + ", subtotal=" + calcularSubtotal() + "]";
    }


}
