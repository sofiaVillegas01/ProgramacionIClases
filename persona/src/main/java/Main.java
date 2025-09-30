import java.util.ArrayList;

public class Main {
    static void ordenarPorNombre(ArrayList<Personam> personas) {
        int n = personas.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (personas.get(j).getNombre().compareToIgnoreCase(personas.get(j + 1).getNombre()) > 0) {
                    // Intercambio
                    Personam temp = personas.get(j);
                    personas.set(j, personas.get(j + 1));
                    personas.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Personam> personas = new ArrayList<>();
        personas.add(new Personam("Carlos"));
        personas.add(new Personam("Ana"));
        personas.add(new Personam("Beatriz"));
        personas.add(new Personam("andrés"));

        System.out.println("Antes de ordenar: " + personas);
        ordenarPorNombre(personas);
        System.out.println("Después de ordenar: " + personas);
    }


}
