public class Main {
    public static void main(String[] args) {
        CuentaAhorros ca = new CuentaAhorros(15000, 0.12f);
        ca.consignar(2000);
        ca.retirar(5000);
        ca.extractoMensual();
        ca.imprimir();



        CuentaCorriente cc = new CuentaCorriente(3000, 0.12f);
        cc.retirar(7000);
        cc.consignar(3000);
        cc.extractoMensual();
        cc.imprimir();
    }

}
