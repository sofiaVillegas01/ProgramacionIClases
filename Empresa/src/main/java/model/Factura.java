package model;

import java.time.LocalDate;
import java.util.List;

public class Factura {
   private int codigo;
    private LocalDate fecha;
    private Cliente cliente;
    private List<DetalleFactura>listaDetalles;


    public Factura(int codigo, LocalDate fecha, Cliente cliente) {
      if(codigo <= 0 || fecha == null || cliente == null){
            throw new IllegalArgumentException("Número de factura debe ser positivo, fecha no puede ser nula, total no puede ser negativo y cliente no puede ser nulo");
        }
      this.codigo = codigo;
      this.fecha = fecha;
      this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "fecha=" + fecha +
                ", codigo=" + codigo +
                '}';
    }
    public double calcularSubTotal(){
        double subtotal=0;
        for(DetalleFactura detalle:listaDetalles){
            subtotal +=detalle.getProducto().getPrecioUnitario()*detalle.getCantidad();
        }
        return subtotal;
    }
}


