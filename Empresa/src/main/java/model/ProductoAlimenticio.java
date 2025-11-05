package model;

import java.time.LocalDate;

public class ProductoAlimenticio extends Producto {
    private LocalDate fechaVencimiento;

    public ProductoAlimenticio(double codigo, String nombre, double precioUnitario, LocalDate fechaVencimiento) {
        super(codigo, nombre, precioUnitario);
        if(nombre==null || nombre.isEmpty()||codigo==0 ||precioUnitario==0){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,lea bien");
        }
        this.fechaVencimiento = fechaVencimiento;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "ProductoAlimenticio{" +
                "fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}
