package Model;

public class Equipo {
    private String codigo;
    private TipoEquipo tipoEquipo; // radio, arma, vehículo, uniforme
    private String estado;
    private double valorReposicion;

    public Equipo(String codigo, TipoEquipo tipoEquipo, String estado, double valorReposicion) {
        this.codigo = codigo;
        this.tipoEquipo = tipoEquipo;
        this.estado = estado;
        this.valorReposicion = valorReposicion;
    }

    public double getValorReposicion() {
        return valorReposicion;
    }

    // Getters y setters...

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoEquipo getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(TipoEquipo tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setValorReposicion(double valorReposicion) {
        this.valorReposicion = valorReposicion;
    }
    public Double CalcularValorTotal(){

        return 0.0;
    }
}
