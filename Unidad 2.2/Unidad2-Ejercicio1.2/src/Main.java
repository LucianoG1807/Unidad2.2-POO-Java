public class Main {

    public static void main(String[] args) {

        CentralMonitoreo central = new CentralMonitoreo();

        SensorPerimetral sensor1 = new SensorPerimetral( "Patio" , "Camara", central);
        SensorPerimetral sensor2 = new SensorPerimetral("Cochera" , "Camara" , central);

        sensor1.detectarMovimiento();
        sensor2.detectarMovimiento();

        central.mostrarReporte();
    }
}
