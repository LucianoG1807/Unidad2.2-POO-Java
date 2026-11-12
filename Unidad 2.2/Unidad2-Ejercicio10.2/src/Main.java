public class Main {

    public static void main(String[] args) {

        TorreControl torre = new TorreControl();

        Avion avion1 = new Avion("AR123", "Aerolíneas Argentinas");
        Avion avion2 = new Avion("LA456", "LATAM");
        Avion avion3 = new Avion("IB789", "Iberia");

        torre.autorizarAterrizaje(avion1);
        torre.autorizarAterrizaje(avion2);

        torre.liberarPista(avion1);

        torre.autorizarAterrizaje(avion3);

        System.out.println("\nEstados finales:");
        System.out.println(avion1.getCodigoVuelo() + ": " + avion1.getEstadoVuelo());
        System.out.println(avion2.getCodigoVuelo() + ": " + avion2.getEstadoVuelo());
        System.out.println(avion3.getCodigoVuelo() + ": " + avion3.getEstadoVuelo());
    }
}