public class Main {

    public static void main(String[] args) {

        VehiculoElectrico vehiculo = new VehiculoElectrico(60, 10);

        SurtidorElectrico surtidor = new SurtidorElectrico(5);

        System.out.println("Iniciando carga...");
        surtidor.iniciarCarga(vehiculo, 15);

        System.out.printf(
                "Nivel final de batería: %.2f kWh (%.2f%%)%n",
                vehiculo.getNivelActual(),
                vehiculo.getPorcentajeCarga()
        );
    }
}