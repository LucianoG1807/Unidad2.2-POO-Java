public class LectorTarjetas {

    private ControladorDeAcceso controlador;

    public LectorTarjetas(ControladorDeAcceso controlador) {
        this.controlador = controlador;
    }

    public void leerTarjeta(Credencial tarjeta, String zona) {

        System.out.println("Leyendo tarjeta: " + tarjeta.getCodigo());

        boolean autorizado = controlador.verificarAcceso(tarjeta, zona);

        if (autorizado) {
            System.out.println("Acceso autorizado a la zona: " + zona);
        } else {
            System.out.println("Acceso denegado a la zona: " + zona);
        }
    }
}