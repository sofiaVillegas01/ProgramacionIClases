package fabrica;

import java.util.ArrayList;
import java.util.Scanner;

public class Automovil {
    private String nombre;
    private String modelo;
    private String motor;
    private String capacidad;
    private String preciobase;
    private ArrayList <Automovil>listaAutomoviles;
    private TipoCarroceria tipoCarroceria;
   //constructor
    public Automovil(String nombre, String modelo, String motor, String capacidad, String preciobase, TipoCarroceria tipoCarroceria) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.motor = motor;
        this.capacidad = capacidad;
        this.preciobase = preciobase;
        this.listaAutomoviles=new ArrayList<>();
        this.tipoCarroceria = tipoCarroceria;
    }
//getter and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    public double getPrecioBase() {
        return 0;
    }

    public void setPreciobase() {
        this.preciobase = preciobase;
    }

    public String getPreciobase() {
        return preciobase;
    }

    public void setListaAutomoviles(ArrayList<Automovil> listaAutomoviles) {
        this.listaAutomoviles = listaAutomoviles;
    }
    public ArrayList<Automovil> getListaAutomoviles(ArrayList<Automovil> listaAutomoviles){
    return listaAutomoviles;
    }
    public Automovil buscarAutomovil(String nombre){
        for(Automovil automovil:listaAutomoviles){
            if (automovil.getNombre().equals(nombre)){
                return automovil;
            }
        }
        return null;
    }
    public String registrarAutomovil(Automovil automovil){
        String resultado="";
        if (buscarAutomovil(automovil.getNombre())==null){
            listaAutomoviles.add(automovil);
            resultado="esta registradO correctamente";
        } else {resultado="ya existe";
        }return resultado;
    }
    public String eliminarAutomovil(Automovil automovil){
        String resultado="";
        if (buscarAutomovil(automovil.getNombre())!=null){
            listaAutomoviles.remove(automovil);
            resultado="eliminado";
        }else {resultado="este automovil ya no existe";
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "=== FÁBRICA DE AUTOMÓVILES ===\n" +
                "Nombre: " + nombre + "\n" +
                "Modelo: " + modelo + "\n" +
                "Motor: " + motor + "\n" +
                "Capacidad: " + capacidad + "\n" +
                "Precio base: " + preciobase + "\n" +
                "Tipo carroceria" + tipoCarroceria;
    }

    public void actualizarAutomovil(String nombre, String modelo, String motor, String capacidad, String preciobase){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Que auto desea actualizar?");
        String Nombre = scanner.nextLine();
        for (Automovil automovil:listaAutomoviles){
            boolean equals = automovil.getNombre().equals(nombre);
            if (automovil.getNombre().equals(nombre)) {
                automovil.setNombre(nombre);
                automovil.setModelo(modelo);
                automovil.setMotor(motor);
                automovil.setCapacidad(capacidad);
                automovil.setPreciobase();
            }
        }




}
    }