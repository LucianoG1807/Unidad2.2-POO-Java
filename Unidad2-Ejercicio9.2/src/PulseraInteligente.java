public class PulseraInteligente {

    private PerfilUsuario perfil;
    private final int META_DIARIA = 10000;
    private boolean metaCumplida;

    public PulseraInteligente(PerfilUsuario perfil) {
        this.perfil = perfil;
        this.metaCumplida = false;
    }

    public void registrarPasos(int cantidad) {
        if (cantidad > 0) {
            perfil.agregarPasos(cantidad);

            System.out.println("Pasos registrados: " + perfil.getPasosAcumulados());

            if (perfil.getPasosAcumulados() >= META_DIARIA && !metaCumplida) {
                perfil.otorgarInsignia("Meta diaria cumplida");
                metaCumplida = true;
            }
        }
    }
}