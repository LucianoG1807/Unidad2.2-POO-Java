public class Butaca {

    private String fila;
    private int numero;
    private boolean disponible;

    public Butaca(String fila, int numero) {
        this.fila = fila;
        this.numero = numero;
        this.disponible = true;
    }

    public String getCodigo() {
        return fila + numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void ocupar() {
        disponible = false;
    }

    @Override
    public String toString() {
        return getCodigo() + " - " + (disponible ? "Disponible" : "Ocupada");
    }
}