public class SensorPerimetral {
    private String idZona;
    private String tipoSensor;
    private CentralMonitoreo central;

    public SensorPerimetral(String idZona, String tipoSensor, CentralMonitoreo central) {
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.central = central;
    }

    public void detectarMovimiento() {
        String hora = java.time.LocalTime.now().withNano(0).toString();

        Alerta alerta = new Alerta(idZona, tipoSensor, hora);

        central.procesarAlerta(alerta);
    }
}