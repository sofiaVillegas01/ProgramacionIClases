package fabrica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Venta {
    private String codigo;
    private LocalDate fecha;
    private Automovil automovil;
    private double totalVenta;
    private ArrayList <Venta>listaVentas;

    // Constructor
    public Venta(String codigo, LocalDate fecha, Automovil automovil) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.automovil = automovil;
        this.totalVenta = calcularTotalVenta();
        this.listaVentas=new ArrayList<>();

    }

    // Función que calcula el valor de la venta con el 10% de impuestos
    public double calcularTotalVenta() {
        double precioBase = automovil.getPrecioBase();
        double impuesto = precioBase * 0.10;  // 10%
        return precioBase + impuesto;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public LocalDate getFecha() { return fecha; }
    public Automovil getAutomovil() { return automovil; }
    public double getTotalVenta() { return totalVenta; }
    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    // Setters
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public void setAutomovil(Automovil automovil) { this.automovil = automovil; }
    public void setTotalVenta(double totalVenta) { this.totalVenta = totalVenta; }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    // Mostrar la venta en consola
    public void mostrarVenta() {
        System.out.println("=== VENTA DE AUTOMÓVIL ===");
        System.out.println("Código de venta: " + codigo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Vehículo: " + automovil.getNombre() + " " + automovil.getModelo());
        System.out.println("Precio base: $" + automovil.getPrecioBase());
        System.out.println("Total con impuestos: $" + totalVenta);
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
        }else {resultado="esta venta ya no existe";
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

    @Override
    public String toString() {
        return "=== VENTA ===\n" +
                "Codigo: " + codigo + "\n" +
                "Fecha: " + fecha + "\n" +
                "Automovil: " + automovil + "\n" +
                "totalventa: " + totalVenta + "\n";}
    }