package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String direccion;
    private String nit;
    private LinkedList<Cliente> listaClientes;
    private LinkedList<Producto>listaProductos;
    private LinkedList<Factura>listaFacturas;
    private DetalleFactura detalleFactura;

    public Empresa(String nombre, String direccion, String nit) {
        if(nombre==null || nombre.isEmpty()||nit==null ||nit.isEmpty()||direccion==null || direccion.isEmpty()){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,lea bien");
        }
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.listaClientes = new LinkedList<>();
        this.listaProductos = new LinkedList<>();
        this.listaFacturas=new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public LinkedList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(LinkedList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public LinkedList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(LinkedList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public LinkedList<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(LinkedList<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(DetalleFactura detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nit='" + nit + '\'' +
                ", listaClientes=" + listaClientes +
                ", listaProductos=" + listaProductos +
                '}';
    }
    public String registrarCliente(Cliente cliente){
        String resultado = "";
        if(buscarCliente(cliente.getCedula()==null){
            listaClientes.add(cliente);
            resultado= "Cliente registrado con exito";
        }else{
            resultado= "El cliente ya se encuentra registrado";
        }
        return resultado;
    }

    public Cliente buscarCliente(String cedula){
       for(Cliente cliente;listaClientes){
           if(cliente.getCedula().equals(cedula)){
               return cliente;
           }
           }
       return null;
       }

    public String eliminarCliente(String cedula){
        String resultado = "";
     if (buscarCliente().getCedula()!=null)
         listaClientes.remove(cliente)
            resultado= "Cliente eliminado con exito";
        } else {
            resultado= "El cliente no se encuentra registrado";
        }
        return resultado;

    public String registrarProducto(Producto nuevoProducto){
        String resultado = "";
        Producto productoEncontrado = null;
        productoEncontrado = buscarProducto(nuevoProducto.getCodigo());
        if(productoEncontrado == null){
            productos.add(nuevoProducto);
            resultado= "Producto registrado con exito";
        } else {
            resultado= "El producto ya se encuentra registrado";
        }
        return resultado;
    }

    public Producto buscarProducto(String codigo){
        Producto productoEncontrado = null;
        boolean encontrado = false;
        for(int i=0; i<productos.size() && !encontrado; i++){
            if(productos.get(i).getCodigo().equals(codigo)){
                productoEncontrado = productos.get(i);
                encontrado = true;
            }
        }
        return productoEncontrado;
    }

    public String eliminarProducto(String codigo){
        String resultado = "";
        Producto productoEncontrado = null;
        productoEncontrado = buscarProducto(codigo);
        if(productoEncontrado != null){
            productos.remove(productoEncontrado);
            resultado= "Producto eliminado con exito";
        } else {
            resultado= "El producto no se encuentra registrado";
        }
        return resultado;
    }


    public String registrarFactura(){
        String resultado = "";
        Factura facturaEncontrada = null;
        facturaEncontrada = buscarFactura(detalleFactura.getNumero());
        if (facturaEncontrada == null) {
            facturas.add(detalleFactura);
            resultado = "Factura registrada con exito";
        } else {
            resultado = "La factura ya se encuentra registrada";
        }
        return resultado;
    }

    public Factura buscarFactura(int numeroFactura){
        Factura facturaEncontrada = null;
        boolean encontrado = false;
        for(int i=0; i<facturas.size() && !encontrado; i++){
            if(facturas.get(i).getNumero() == numeroFactura){
                facturaEncontrada = facturas.get(i);
                encontrado = true;
            }
        }
        return facturaEncontrada;
    }


    public String eliminarFactura(int numeroFactura){
        String resultado = "";
        Factura facturaEncontrada = null;
        facturaEncontrada = buscarFactura(numeroFactura);
        if(facturaEncontrada != null){
            facturas.remove(facturaEncontrada);
            resultado= "Factura eliminada con exito";
        } else {
            resultado= "La factura no se encuentra registrada";
        }
        return resultado;
    }


    public boolean ingresarCliente(ClienteCorporativo cc) {
        return false;
    }
}




