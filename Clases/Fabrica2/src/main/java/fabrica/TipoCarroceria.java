package fabrica;

import java.util.ArrayList;

public class TipoCarroceria {
    private int codigo;
    private String nombre;
    private ArrayList <Automovil>listaAutomoviles;

        private TipoCarroceria(int codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
        }

        // Tipos de carrocería "quemados"
        public static final TipoCarroceria COUPE = new TipoCarroceria(0, "Coupé");
        public static final TipoCarroceria ROADSTER = new TipoCarroceria(1, "Roadster");
        public static final TipoCarroceria MINIVAN = new TipoCarroceria(2, "Minivan");
        public static final TipoCarroceria SEDAN = new TipoCarroceria(3, "Sedán");

        // Getters
        public int getCodigo() {
            return codigo;
        }

        public String getNombre() {
            return nombre;
        }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        @Override
        public String toString() {
            return nombre + " (código: " + codigo + ")";
        }
    }

