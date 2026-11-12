import java.util.ArrayList;
import java.util.List;

public class SalaCine {

    private List<Butaca> butacas;

    public SalaCine() {
        butacas = new ArrayList<>();
    }

    public void agregarButaca(Butaca butaca) {
        butacas.add(butaca);
    }

    public boolean bloquearButacas(List<String> codigosButacas) {

        for (String codigo : codigosButacas) {
            boolean encontrada = false;

            for (Butaca butaca : butacas) {
                if (butaca.getCodigo().equals(codigo)) {
                    encontrada = true;

                    if (!butaca.isDisponible()) {
                        return false;
                    }

                    break;
                }
            }

            if (!encontrada) {
                return false;
            }
        }

        for (String codigo : codigosButacas) {
            for (Butaca butaca : butacas) {
                if (butaca.getCodigo().equals(codigo)) {
                    butaca.ocupar();
                    break;
                }
            }
        }

        return true;
    }

    public void mostrarButacas() {
        for (Butaca butaca : butacas) {
            System.out.println(butaca);
        }
    }
}