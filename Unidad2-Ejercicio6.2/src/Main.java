import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SalaCine sala = new SalaCine();

        sala.agregarButaca(new Butaca("A", 1));
        sala.agregarButaca(new Butaca("A", 2));
        sala.agregarButaca(new Butaca("A", 3));
        sala.agregarButaca(new Butaca("B", 1));
        sala.agregarButaca(new Butaca("B", 2));

        PlataformaReserva plataforma = new PlataformaReserva(sala);

        plataforma.reservarButacas(Arrays.asList("A1", "A2", "B1"));

        System.out.println("\nEstado de las butacas:");
        sala.mostrarButacas();
    }
}