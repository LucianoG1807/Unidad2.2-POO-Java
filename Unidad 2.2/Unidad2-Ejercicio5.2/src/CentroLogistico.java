import java.util.ArrayList;

public class CentroLogistico {

    private ArrayList<CamionDeReparto> camiones;

    public CentroLogistico() {
        camiones = new ArrayList<>();
    }

    public void agregarCamion(CamionDeReparto camion) {
        camiones.add(camion);
    }

    public void difundirActualizacion(String codigoPaquete, String nuevoEstado) {
        for (CamionDeReparto camion : camiones) {
            camion.actualizarEstadoPaquete(codigoPaquete, nuevoEstado);
        }
    }

    public void mostrarEstadoCamiones() {
        for (CamionDeReparto camion : camiones) {
            camion.mostrarPaquetes();
        }
    }
}