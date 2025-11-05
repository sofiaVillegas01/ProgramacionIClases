package model;


public class ClienteFrecuente extends Cliente  {
private double puntosdeFidelidad;


    public ClienteFrecuente(String nombre, String cedula, String direccion, double puntosdeFidelidad) {
        super(nombre, cedula, direccion);
        if(nombre==null || nombre.isEmpty()||cedula==null ||cedula.isEmpty()||direccion==null || direccion.isEmpty() || puntosdeFidelidad==0){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,lea bien");
        }
        this.puntosdeFidelidad = puntosdeFidelidad;
    }

    public double getPuntosdeFidelidad() {
        return puntosdeFidelidad;
    }

    public void setPuntosdeFidelidad(double puntosdeFidelidad) {
        this.puntosdeFidelidad = puntosdeFidelidad;
    }

    @Override
    public double calcularDescuento(double total) {
        return total*0.05;
    }
}
