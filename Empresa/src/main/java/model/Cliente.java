package model;
import java.util.List;

public abstract class Cliente {
    private String nombre;
    private String cedula;
    private String direccion;

    public Cliente(String nombre, String cedula, String direccion) {
        if(nombre==null || nombre.isBlank()||cedula==null ||cedula.isEmpty()||direccion==null || direccion.isBlank()){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,lea bien");
        }
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
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
    public abstract double calcularDescuento(double total);

}

