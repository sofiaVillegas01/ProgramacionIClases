package Model;

import java.util.List;

public class CustodiaFija extends Servicio {
    private int cantidadPuestos;

    public CustodiaFija(String codigoContrato, String cliente, double tarifaMensual, TipoEstado tipoEstado, List<Empleado> empleadosAsignados, int cantidadPuestos) {
        super(codigoContrato, cliente, tarifaMensual, tipoEstado, empleadosAsignados);
        this.cantidadPuestos = cantidadPuestos;
    }

    public int getCantidadPuestos() {
        return cantidadPuestos;
    }

    public void setCantidadPuestos(int cantidadPuestos) {
        this.cantidadPuestos = cantidadPuestos;
    }

    @Override
    public double calcularCostoMensual() {
        return getTarifaMensual() + (cantidadPuestos * 200000);
    }
}
