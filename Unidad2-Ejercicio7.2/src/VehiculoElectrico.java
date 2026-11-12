public class VehiculoElectrico {

    private double capacidadBateria;
    private double nivelActual;

    public VehiculoElectrico(double capacidadBateria, double nivelActual) {
        this.capacidadBateria = capacidadBateria;
        this.nivelActual = nivelActual;
    }

    public void recibirCarga(double kw) {
        if (kw > 0) {
            nivelActual += kw;

            if (nivelActual > capacidadBateria) {
                nivelActual = capacidadBateria;
            }
        }
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public double getNivelActual() {
        return nivelActual;
    }

    public double getPorcentajeCarga() {
        return (nivelActual / capacidadBateria) * 100;
    }
}