import java.util.HashMap;

public class ControladorDeAcceso {

    private HashMap<String, Integer> permisos;

    public ControladorDeAcceso() {
        permisos = new HashMap<>();

        permisos.put("RFID001", 3);
        permisos.put("RFID002", 1);
    }

    public boolean verificarAcceso(Credencial tarjeta, String zona) {

        Integer nivelPermitido = permisos.get(tarjeta.getCodigo());

        return nivelPermitido != null
                && tarjeta.getNivelAcceso() >= nivelPermitido;
    }
}