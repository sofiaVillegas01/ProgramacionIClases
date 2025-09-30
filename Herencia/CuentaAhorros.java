public class CuentaAhorros extends Cuenta {
    private boolean isActiva;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        actualizarEstado();
    }

    private void actualizarEstado() {
        isActiva = saldo >= 10000;
    }

    @Override
    public void consignar(float cantidad) {
        if (isActiva) {
            super.consignar(cantidad);
        } else {
            JOption("No se puede consignar porque la cuenta está inactiva");
        }
        actualizarEstado();
    }

    @Override
    public void retirar(float cantidad) {
        if (isActiva) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                numRetiros++;
                JOption("Retiro exitoso");
            } else {
                JOption("Fondos insuficientes");
            }
        } else {
            JOption("No se puede retirar porque la cuenta está inactiva");
        }
        actualizarEstado();
    }

    @Override
    public void extractoMensual() {
        if (numRetiros > 4) {
            comisionMensual += (numRetiros - 4) * 1000;
        }
        super.extractoMensual();
        actualizarEstado();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cuenta activa: " + isActiva);
    }
}
