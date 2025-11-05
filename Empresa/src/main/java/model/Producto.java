package model;

public abstract class Producto {
    private String codigo;
    private String nombre;
    private double precioUnitario;

    public Producto(String codigo, String nombre, double precioUnitario) {
        if(nombre==null || nombre.isEmpty()||codigo==null||precioUnitario==0){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,lea bien");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
