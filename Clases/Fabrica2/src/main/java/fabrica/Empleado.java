package fabrica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Empleado {
    private String nombres;
    private String apellidos;
    private String identificacion;
    private String departamento;
    private String posicion;
    private double salario;
    private ArrayList <Empleado>listaEmpleados;

    // Constructor
    public Empleado(String nombres, String apellidos, String identificacion,
                    String departamento, String posicion, double salario) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.departamento = departamento;
        this.posicion = posicion;
        this.salario = salario;
        this.listaEmpleados=new ArrayList<>();
    }

    // Setters
    public void setNombres(String nombres) { this.nombres = nombres; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    public void setPosicion(String posicion) { this.posicion = posicion; }
    public void setSalario(double salario) { this.salario = salario; }

    // Getters
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getIdentificacion() { return identificacion; }
    public String getDepartamento() { return departamento; }
    public String getPosicion() { return posicion; }
    public double getSalario() { return salario; }


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
    public String toString() {
        return "=== EMPLEADO ===\n" +
                "Nombres: " + nombres + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "identificacion: " + identificacion + "\n" +
                "Departamento: " + departamento + "\n"+ "Posicion: " + posicion + "\n"+
                 "salario;" + salario + "\n";

    }
        }