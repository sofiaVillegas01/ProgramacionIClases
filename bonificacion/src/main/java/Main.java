public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Circulo(3), new Cuadrado(6), new TrianguloEquilatero(3)
        };
        for (Figura f : figuras) {
            System.out.println("Figura: " + f.getClass().getSimpleName());
            System.out.println("Área: " + f.calcularArea());
            System.out.println("Perímetro: " + f.calcularPerimetro());
            System.out.println("------");
    }
    }
}
