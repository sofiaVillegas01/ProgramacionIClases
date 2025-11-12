package Model;

import java.util.List;

public class Operador extends Empleado {
        private int zonasMonitoreadas;

    public Operador(String nombre, String documento, TipoTurno tipoTurno, double salarioBase, int zonasMonitoreadas) {
        super(nombre, documento, tipoTurno, salarioBase);
        this.zonasMonitoreadas = zonasMonitoreadas;
    }

    @Override
        public double calcularSalarioTotal(int horasExtras) {
            double extra = horasExtras * 1.5 * 5000;
            return getSalarioBase() + extra + (zonasMonitoreadas * 1000);
        }
    }
