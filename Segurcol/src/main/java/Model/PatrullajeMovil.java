package Model;

import java.util.List;

public class PatrullajeMovil extends Servicio {
    private int rutas;
    private double kilometros;

    public PatrullajeMovil(String codigoContrato, String cliente, double tarifaMensual, TipoEstado tipoEstado, List<Empleado> empleadosAsignados, int rutas, double kilometros) {
        super(codigoContrato, cliente, tarifaMensual, tipoEstado, empleadosAsignados);
        this.rutas = rutas;
        this.kilometros = kilometros;
    }

    @Override
    public double calcularCostoMensual() {
        return getTarifaMensual() + (kilometros * 1000);
    }
}

