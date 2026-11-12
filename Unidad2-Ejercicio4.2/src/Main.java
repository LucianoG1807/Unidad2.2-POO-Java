import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> titulares = new ArrayList<>();
        titulares.add("Lucho");

        CuentaBancaria cuenta = new CuentaBancaria(
                "1234567890123456789012",
                titulares,
                150000
        );

        CajeroAutomatico cajero = new CajeroAutomatico(cuenta);

        cajero.extraerDinero(50000);
        System.out.println(" ");
        cajero.extraerDinero(200000);
        System.out.println(" ");
        cajero.depositarDinero(25000);
    }
}