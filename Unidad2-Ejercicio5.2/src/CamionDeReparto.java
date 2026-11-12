import java.util.ArrayList;

public class CamionDeReparto {

    private String patente;
    private ArrayList<Paquete> paquetes;

    public CamionDeReparto(String patente) {
        this.patente = patente;
        this.paquetes = new ArrayList<>();
    }

    public void agregarPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    public void actualizarEstadoPaquete(String codigoPaquete, String nuevoEstado) {
        for (Paquete paquete : paquetes) {
            if (paquete.getCodigo().equals(codigoPaquete)) {
                paquete.setEstado(nuevoEstado);
                System.out.println("Paquete " + codigoPaquete + ": " + nuevoEstado);
                return;
            }
        }
    }

    public void mostrarPaquetes() {
        System.out.println("Camión: " + patente);

        for (Paquete paquete : paquetes) {
            System.out.println(
                    paquete.getCodigo() + " | " +
                            paquete.getDestino() + " | " +
                            paquete.getEstado()
            );
        }
    }
}