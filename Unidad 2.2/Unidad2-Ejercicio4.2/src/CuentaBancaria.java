import java.util.ArrayList;

public class CuentaBancaria {

    private String cbu;
    private ArrayList<String> titulares;
    private double saldo;

    public CuentaBancaria(String cbu, ArrayList<String> titulares, double saldo) {
        this.cbu = cbu;
        this.titulares = titulares;
        this.saldo = saldo;
    }

    public boolean debitar(double monto) {
        if (monto <= 0 || monto > saldo || monto > 100000) {
            return false;
        }

        saldo -= monto;
        return true;
    }

    public void acreditar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public String getCbu() {
        return cbu;
    }

    public ArrayList<String> getTitulares() {
        return new ArrayList<>(titulares);
    }

    public double getSaldo() {
        return saldo;
    }
}