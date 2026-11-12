public class RegistroPropiedad {

    private String propietario;

    RegistroPropiedad (String propietario) {
        this.propietario = propietario;
    }

    public String getPropietario() {
        return propietario;
    }

    public void transferirInmueble (Propiedad propiedad, RegistroPropiedad nuevoTitular ) {

        if (propiedad.esEstadoLegal()) {
            propiedad.setTitular(nuevoTitular.propietario);
        }
        else {
            System.out.println("La propiedad no se puede transferir.");
        }
    }
}
