package fabrica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Fabrica {
    private String nombre;
    private String nit;
    private String telefono;
    private String ubicacion;
    private ArrayList <Venta>listaVentas;
    private ArrayList <Automovil>listaAutomoviles;
    private ArrayList <Empleado>listaEmpleados;

    // Constructor
    public Fabrica(String nombre, String nit, String telefono, String ubicacion) {
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.listaVentas=new ArrayList<>();
        this.listaAutomoviles=new ArrayList<>();
        this.listaEmpleados=new ArrayList<>();
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getNit() { return nit; }
    public String getTelefono() { return telefono; }
    public String getUbicacion() { return ubicacion; }
    public ArrayList<Venta> getListaVentas() {return listaVentas;}
    public ArrayList<Automovil> getListaAutomoviles() {return listaAutomoviles;}
    public ArrayList<Empleado> getListaEmpleados() {return listaEmpleados;}

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNit(String nit) { this.nit = nit; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public void setListaVentas(ArrayList<Venta> listaVentas) {this.listaVentas = listaVentas;}
    public void setListaAutomoviles(ArrayList<Automovil> listaAutomoviles) {this.listaAutomoviles = listaAutomoviles;}
    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {this.listaEmpleados = listaEmpleados;}

    // Mostrar info de la fábrica
    @Override
    public String toString() {
        return "=== FÁBRICA DE AUTOMÓVILES ===\n" +
                "Nombre: " + nombre + "\n" +
                "NIT: " + nit + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Ubicación: " + ubicacion + "\n";
    }
    public Venta buscarVenta(String codigo){
        for(Venta venta:listaVentas){
            if (venta.getCodigo().equals(codigo)){
                return venta;
            }
        }
        return null;
    }
    public String registrarVenta(Venta venta){
        String resultado="";
        if (buscarVenta(venta.getCodigo())==null){
            listaVentas.add(venta);
            resultado="esta registrada correctamente";
        } else {resultado="ya existe";
        }return resultado;
        }
        public String eliminarVenta(Venta venta){
        String resultado="";
        if (buscarVenta(venta.getCodigo())!=null){
            listaVentas.remove(venta);
            resultado="eliminado";
        }else {resultado="este ususario ya no existe";
        }
            return resultado;
        }


        public void actualizarVenta(LocalDate fecha, String codigo, double totalv){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Que codigo desea actualizar?");
            String Codigo = scanner.nextLine();
            for (Venta venta:listaVentas){
                boolean equals = venta.getCodigo().equals(codigo);
                if (venta.getCodigo().equals(codigo)) {
                    venta.setFecha(fecha);
                    venta.setCodigo(codigo);
                    venta.setTotalVenta(totalv);
                }
            }
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
        if (automovil.buscarAutomovil(automovil.getNombre())==null){
            listaAutomoviles.add(automovil);
            resultado="esta registradO correctamente";
        } else {resultado="ya existe";
        }return resultado;
    }
    public String eliminarAutomovil(Automovil automovil){
        String resultado="";
        if (automovil.buscarAutomovil(automovil.getNombre())!=null){
            listaAutomoviles.remove(automovil);
            resultado="eliminado";
        }else {resultado="este automovil ya no existe";
        }
        return resultado;
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
    public Empleado buscarEmpleado(String identificacion){
        for(Empleado empleado :listaEmpleados){
            if (empleado.getIdentificacion().equals(identificacion)){
                return empleado;
            }
        }
        return null;
    }
    public String registrarEmpledo(Empleado empleado){
        String resultado="";
        if (buscarEmpleado(empleado.getIdentificacion())==null){
            listaEmpleados.add(empleado);
            resultado="esta registrado correctamente";
        } else {resultado="ya existe";
        }return resultado;
    }
    public String eliminarEmpleado(Empleado empleado){
        String resultado="";
        if (buscarEmpleado(empleado.getIdentificacion())!=null){
            listaEmpleados.remove(empleado);
            resultado="eliminado";
        }else {resultado="este ususario ya no existe";
        }
        return resultado;
    }

    public void actualizarEmpleado(String nombres, String apellidos, String identificacion,
                                   String departamento, String posicion, double salario){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Que empleado desea actualizar?");
        String Identificacion = scanner.nextLine();
        for (Empleado empleado:listaEmpleados){
            boolean equals = empleado.getIdentificacion().equals(identificacion);
            if (empleado.getIdentificacion().equals(identificacion)) {
                empleado.setNombres(nombres);
                empleado.setApellidos(apellidos);
                empleado.setIdentificacion(identificacion);
                empleado.setDepartamento(departamento);
                empleado.setPosicion(posicion);
                empleado.setSalario(salario);
            }
        }
    }
    }

