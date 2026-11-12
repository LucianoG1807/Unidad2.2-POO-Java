public class Main {

    public static void main(String[] args) {

        PerfilUsuario usuario = new PerfilUsuario("Lucho");

        PulseraInteligente pulsera = new PulseraInteligente(usuario);

        pulsera.registrarPasos(4500);
        pulsera.registrarPasos(6000);

        System.out.println("\nUsuario: " + usuario.getNombre());
        System.out.println("Total de pasos: " + usuario.getPasosAcumulados());
        System.out.println("Insignias obtenidas: " + usuario.getInsigniasObtenidas());
    }
}