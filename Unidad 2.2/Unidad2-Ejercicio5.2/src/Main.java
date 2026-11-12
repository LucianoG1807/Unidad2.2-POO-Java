public class Main {

    public static void main(String[] args) {

        CentroLogistico centro = new CentroLogistico();

        CamionDeReparto camion1 = new CamionDeReparto("AB123CD");
        CamionDeReparto camion2 = new CamionDeReparto("EF456GH");

        camion1.agregarPaquete(new Paquete("P001", "Mendoza", "En Depósito"));
        camion1.agregarPaquete(new Paquete("P002", "San Martín", "En Depósito"));
        camion2.agregarPaquete(new Paquete("P003", "Maipú", "En Depósito"));

        centro.agregarCamion(camion1);
        centro.agregarCamion(camion2);

        centro.difundirActualizacion("P001", "En Tránsito");
        centro.difundirActualizacion("P003", "Entregado");

        centro.mostrarEstadoCamiones();
    }
}