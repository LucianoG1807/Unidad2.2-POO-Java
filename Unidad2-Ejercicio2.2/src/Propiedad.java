public class Propiedad {

    private String titular;
    private String direccion;
    private double tasacion;
    private boolean estadoLegal;

    Propiedad (String titular, String direccion, double tasacion, boolean estadoLegal) {

        this.titular = titular;
        this.direccion = direccion;
        this.tasacion = tasacion;
        this.estadoLegal = estadoLegal;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getTasacion() {
        return tasacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean esEstadoLegal () {
        return true;
    }
}
