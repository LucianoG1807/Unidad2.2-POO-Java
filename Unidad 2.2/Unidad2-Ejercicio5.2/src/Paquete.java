public class Paquete {

    private String codigo;
    private String destino;
    private String estado;

    public Paquete(String codigo, String destino, String estado) {
        this.codigo = codigo;
        this.destino = destino;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}