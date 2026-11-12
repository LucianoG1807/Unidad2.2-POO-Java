public class GestorInmobiliario {

    private String nombreGestor;
    private int matricula;
    RegistroPropiedad propiedad;
    Propiedad propiedad1;

    GestorInmobiliario (String nombreGestor, int matricula, RegistroPropiedad propiedad, Propiedad propiedad1) {

        this.nombreGestor = nombreGestor;
        this.matricula = matricula;
        this.propiedad = propiedad;
        this.propiedad1 = propiedad1;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombreGestor() {
        return nombreGestor;
    }

    public void ejecutarTransaccion(RegistroPropiedad gestor) {
        gestor.transferirInmueble(propiedad1, propiedad);

        System.out.println("ACA IRIA LA INFO");
    }
}
