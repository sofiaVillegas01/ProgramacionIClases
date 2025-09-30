import java.util.ArrayList;

public class BurbujaPersonam {
    // Método burbuja para ordenar por nombre alfabéticamente
    public static void ordenarPorNombre(ArrayList<Personam> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // compareToIgnoreCase → ignora mayúsculas/minúsculas
                if (lista.get(j).getNombre().compareToIgnoreCase(lista.get(j + 1).getNombre()) > 0) {
                    // Intercambio
                    Personam temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }

}
