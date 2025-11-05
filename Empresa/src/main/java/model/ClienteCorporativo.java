package model;

import java.util.List;

public class ClienteCorporativo extends Cliente {
    private String nit;
    private double descuento;

    public ClienteCorporativo(String nombre, String cedula, String direccion, List<Producto> listaProductos, List<Factura> listaFacturas, String nit, double descuento) {
        super(nombre, cedula, direccion, listaProductos, listaFacturas);
        if(nombre==null || nombre.isEmpty()||cedula==null ||cedula.isEmpty()||direccion==null || direccion.isEmpty() || nit==null || nit.isEmpty() || descuento<0){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,lea bien");
        }
        this.nit = nit;
        this.descuento = descuento;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

   @Override
    public double descuento(){
        return descuento;
   }
}
