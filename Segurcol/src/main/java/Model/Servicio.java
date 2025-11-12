package Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Servicio {
    private String codigoContrato;
    private String cliente;
    private double tarifaMensual;
    private TipoEstado tipoEstado;
    private List<Empleado> empleadosAsignados = new ArrayList<>();

    public Servicio(String codigoContrato, String cliente, double tarifaMensual, TipoEstado tipoEstado, List<Empleado> empleadosAsignados) {
        this.codigoContrato = codigoContrato;
        this.cliente = cliente;
        this.tarifaMensual = tarifaMensual;
        this.tipoEstado = tipoEstado;
        this.empleadosAsignados = empleadosAsignados;
    }

    public abstract double calcularCostoMensual();

    public void asignarEmpleado(Empleado e) {
        empleadosAsignados.add(e);
    }

    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    // Getters y setters...

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTarifaMensual() {
        return tarifaMensual;
    }

    public void setTarifaMensual(double tarifaMensual) {
        this.tarifaMensual = tarifaMensual;
    }

    public TipoEstado getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(TipoEstado tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public void setEmpleadosAsignados(List<Empleado> empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }
}
