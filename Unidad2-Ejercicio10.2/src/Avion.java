public class Avion {

    private String codigoVuelo;
    private String aerolinea;
    private String estadoVuelo;

    public Avion(String codigoVuelo, String aerolinea) {
        this.codigoVuelo = codigoVuelo;
        this.aerolinea = aerolinea;
        this.estadoVuelo = "En vuelo";
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public String getEstadoVuelo() {
        return estadoVuelo;
    }

    public void cambiarEstado(String nuevoEstado) {
        estadoVuelo = nuevoEstado;
    }
}