package model;
import java.util.List;

public abstract class Cliente {
    private String nombre;
    private String cedula;
    private String direccion;
    private List<Producto> listaProductos;
    private List<Factura> listaFacturas;

    public Cliente(String nombre, String cedula, String direccion, List<Producto> listaProductos, List<Factura> listaFacturas) {
        if(nombre==null || nombre.isBlank()||cedula==null ||cedula.isEmpty()||direccion==null || direccion.isBlank()){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,lea bien");
        }
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.listaProductos = listaProductos;
        this.listaFacturas = listaFacturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }
}

