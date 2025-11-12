package Model;

public class SegurcolP {
    private  String nit;
    private String nombre;
    private String ubicacion;


    public SegurcolP(String nit, String nombre, String ubicacion) {
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
