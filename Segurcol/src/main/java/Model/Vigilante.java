package Model;

import java.util.List;

public class Vigilante extends Empleado {
        private int numeroPuesto;
        private TipArma tipoArma; // "letal", "no letal", "sin arma"

    public Vigilante(String nombre, String documento, TipoTurno tipoTurno, double salarioBase, int numeroPuesto, TipArma tipoArma) {
        super(nombre, documento, tipoTurno, salarioBase);
        this.numeroPuesto = numeroPuesto;
        this.tipoArma = tipoArma;
    }

    public int getNumeroPuesto() {
            return numeroPuesto;
        }

        public void setNumeroPuesto(int numeroPuesto) {
            this.numeroPuesto = numeroPuesto;
        }

        public TipArma getTipoArma() {
            return tipoArma;
        }

        public void setTipoArma(TipArma tipoArma) {
            this.tipoArma = tipoArma;
        }

        @Override
        public double calcularSalarioTotal(int horasExtras) {
            double extra = horasExtras * 1.5 * 5000;
            return getSalarioBase() + extra;
        }
    }

