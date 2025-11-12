package Model;

import java.util.List;

public class MonitoreoRemoto extends Servicio {
    private int dispositivos;

    public MonitoreoRemoto(String codigoContrato, String cliente, double tarifaMensual, TipoEstado tipoEstado, List<Empleado> empleadosAsignados, int dispositivos) {
        super(codigoContrato, cliente, tarifaMensual, tipoEstado, empleadosAsignados);
        this.dispositivos = dispositivos;
    }

    public int getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(int dispositivos) {
        this.dispositivos = dispositivos;
    }

    @Override
    public double calcularCostoMensual() {
        return getTarifaMensual() + (dispositivos * 5000);
    }
}

