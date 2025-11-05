package model;

import java.util.List;

public class ClienteFrecuente extends Cliente  {
private double puntosdeFidelidad;
private double descuento=0.05;

    public ClienteFrecuente(String nombre, String cedula, String direccion, List<Producto> listaProductos, List<Factura> listaFacturas, double puntosdeFidelidad, double descuento) {
        super(nombre, cedula, direccion, listaProductos, listaFacturas);
        if(nombre==null || nombre.isEmpty()||cedula==null ||cedula.isEmpty()||direccion==null || direccion.isEmpty() || puntosdeFidelidad==0 || descuento==0){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,lea bien");
        }
        this.puntosdeFidelidad = puntosdeFidelidad;
        this.descuento = descuento;
    }

    public double getPuntosdeFidelidad() {
        return puntosdeFidelidad;
    }

    public void setPuntosdeFidelidad(double puntosdeFidelidad) {
        this.puntosdeFidelidad = puntosdeFidelidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    @Override
    public double descuento(){
        return 0.05;
    }
}
