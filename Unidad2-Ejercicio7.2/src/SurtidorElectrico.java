public class SurtidorElectrico {

    private double potenciaPorMinuto;

    public SurtidorElectrico(double potenciaPorMinuto) {
        this.potenciaPorMinuto = potenciaPorMinuto;
    }

    public void iniciarCarga(VehiculoElectrico vehiculo, int minutos) {

        for (int i = 1; i <= minutos; i++) {

            if (vehiculo.getNivelActual() >= vehiculo.getCapacidadBateria()) {
                System.out.println("Batería al 100%. Carga finalizada.");
                break;
            }

            vehiculo.recibirCarga(potenciaPorMinuto);

            System.out.printf(
                    "Minuto %d - Batería: %.2f%% (%.2f kWh)%n",
                    i,
                    vehiculo.getPorcentajeCarga(),
                    vehiculo.getNivelActual()
            );
        }

        if (vehiculo.getNivelActual() >= vehiculo.getCapacidadBateria()) {
            System.out.println("Batería al 100%. Carga finalizada.");
        }
    }
}