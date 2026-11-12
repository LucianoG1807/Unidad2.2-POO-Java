public class CajeroAutomatico {

    private CuentaBancaria cuentaActiva;

    public CajeroAutomatico(CuentaBancaria cuentaActiva) {
        this.cuentaActiva = cuentaActiva;
    }

    public void extraerDinero(double monto) {
        if (cuentaActiva.debitar(monto)) {
            System.out.println("Extracción exitosa: $" + monto);
            System.out.println("CBU: " + cuentaActiva.getCbu());
            System.out.println("Titulares: " + cuentaActiva.getTitulares());
            System.out.println("Saldo final: $" + cuentaActiva.getSaldo());
        } else {
            System.out.println("Extracción rechazada.");
        }

    }

    public void depositarDinero(double monto) {
        cuentaActiva.acreditar(monto);
        System.out.println("Depósito realizado: $" + monto);
        System.out.println("CBU: " + cuentaActiva.getCbu());
        System.out.println("Titulares: " + cuentaActiva.getTitulares());
        System.out.println("Saldo final: $" + cuentaActiva.getSaldo());
    }
}