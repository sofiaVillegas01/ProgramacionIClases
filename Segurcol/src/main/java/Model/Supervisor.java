package Model;
import java.util.List;

public class Supervisor extends Empleado {
    private List<Vigilante> listavigilantes;
    private double bonoCoordinacion;

    public Supervisor(String nombre, String documento, TipoTurno tipoTurno, double salarioBase, List<Vigilante> listavigilantes, double bonoCoordinacion) {
        super(nombre, documento, tipoTurno, salarioBase);
        this.listavigilantes = listavigilantes;
        this.bonoCoordinacion = bonoCoordinacion;
    }

    public void agregarVigilante(Vigilante v) {
        listavigilantes.add(v);
    }

    public List<Vigilante> getListavigilantes() {
        return listavigilantes;
    }

    public void setListavigilantes(List<Vigilante> listavigilantes) {
        this.listavigilantes = listavigilantes;
    }

    public double getBonoCoordinacion() {
        return bonoCoordinacion;
    }

    public void setBonoCoordinacion(double bonoCoordinacion) {
        this.bonoCoordinacion = bonoCoordinacion;
    }

    @Override
    public double calcularSalarioTotal(int horasExtras) {
        double extra = horasExtras * 1.5 * 5000;
        return getSalarioBase() + extra + bonoCoordinacion;
    }
}

