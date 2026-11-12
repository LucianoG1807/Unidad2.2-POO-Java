import java.util.List;

public class PlataformaReserva {

    private SalaCine sala;

    public PlataformaReserva(SalaCine sala) {
        this.sala = sala;
    }

    public void reservarButacas(List<String> codigosButacas) {
        if (sala.bloquearButacas(codigosButacas)) {
            System.out.println("Reserva realizada correctamente.");
        } else {
            System.out.println("No se pudo realizar la reserva.");
        }
    }
}