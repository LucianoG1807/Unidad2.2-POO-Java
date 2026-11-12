public class Main {

    public static void main(String[] args) {

        ControladorDeAcceso controlador = new ControladorDeAcceso();
        LectorTarjetas lector = new LectorTarjetas(controlador);

        Credencial tarjetaValida = new Credencial( "RFID001", 3);
        Credencial tarjetaInvalida = new Credencial( "RFID999", 1);

        lector.leerTarjeta(tarjetaValida, "RFID001");
        System.out.println(" ");
        lector.leerTarjeta(tarjetaInvalida, "RFID001");
    }
}