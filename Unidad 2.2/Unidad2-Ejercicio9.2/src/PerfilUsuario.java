import java.util.ArrayList;

public class PerfilUsuario {

    private String nombre;
    private int pasosAcumulados;
    private ArrayList<String> insigniasObtenidas;

    public PerfilUsuario(String nombre) {
        this.nombre = nombre;
        this.pasosAcumulados = 0;
        this.insigniasObtenidas = new ArrayList<>();
    }

    public void agregarPasos(int cantidad) {
        pasosAcumulados += cantidad;
    }

    public void otorgarInsignia(String nombreInsignia) {
        if (!insigniasObtenidas.contains(nombreInsignia)) {
            insigniasObtenidas.add(nombreInsignia);
            System.out.println("Insignia obtenida: " + nombreInsignia);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getPasosAcumulados() {
        return pasosAcumulados;
    }

    public ArrayList<String> getInsigniasObtenidas() {
        return new ArrayList<>(insigniasObtenidas);
    }
}