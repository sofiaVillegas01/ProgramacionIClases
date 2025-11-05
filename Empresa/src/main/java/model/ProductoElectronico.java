package model;

public class ProductoElectronico extends Producto {
    private int garantia;

    public ProductoElectronico(double codigo, String nombre, double precioUnitario,int garantia) {
        super(codigo, nombre, precioUnitario);
        if(nombre==null || nombre.isEmpty()||codigo==0 ||precioUnitario==0 ||garantia==0){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,lea bien");
        }
        this.garantia=garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "ProductoElectronico{" +
                "garantia=" + garantia +
                '}';
    }
}
