public class TorreControl {

    private boolean pistaLibre;

    public TorreControl() {
        pistaLibre = true;
    }

    public boolean autorizarAterrizaje(Avion avion) {

        if (pistaLibre) {
            pistaLibre = false;

            System.out.println("Aterrizaje autorizado para el vuelo "
                    + avion.getCodigoVuelo());

            avion.cambiarEstado("Aterrizando");

            return true;
        } else {
            System.out.println("Aterrizaje denegado para el vuelo "
                    + avion.getCodigoVuelo() + ". Pista ocupada.");

            return false;
        }
    }

    public void liberarPista(Avion avion) {
        avion.cambiarEstado("En tierra");
        pistaLibre = true;

        System.out.println("Vuelo " + avion.getCodigoVuelo()
                + " aterrizó. Pista liberada.");
    }
}