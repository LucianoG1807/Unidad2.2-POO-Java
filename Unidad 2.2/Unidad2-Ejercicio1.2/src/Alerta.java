public class Alerta {

    private String idZona;
    private String tipoSensor;
    private String marcaTemporal;

    Alerta (String idZona, String tipoSensor, String marcaTemporal) {

        this.idZona = idZona;
        this.marcaTemporal = marcaTemporal;
        this.tipoSensor = tipoSensor;

    }

    public String getMarcaTemporal() {
        return marcaTemporal;
    }

    public String getIdZona() {
        return idZona;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }
}
