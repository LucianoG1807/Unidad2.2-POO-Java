public class Credencial {

    private String codigo;
    private int nivelAcceso;

    public Credencial(String codigo, int nivelAcceso) {
        this.codigo = codigo;
        this.nivelAcceso = nivelAcceso;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }
}