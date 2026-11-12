import java.util.ArrayList;

public class CentralMonitoreo {

    private ArrayList<Alerta> alertas;

    public CentralMonitoreo() {
        alertas = new ArrayList<>();
    }

    public void procesarAlerta(Alerta alerta) {
        alertas.add(alerta);
        System.out.println("Alerta registrada.");
    }

    public void mostrarReporte() {
        System.out.println("=== REPORTE DE ALERTAS ===");

        for (Alerta alerta : alertas) {
            System.out.println("Zona: " + alerta.getIdZona());
            System.out.println("Sensor: " + alerta.getTipoSensor());
            System.out.println("Hora: " + alerta.getMarcaTemporal());
            System.out.println("-------------------------");
        }

    }
}
