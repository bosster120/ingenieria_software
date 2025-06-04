
import java.util.Random;

public class Espanol {
    private static final String[] PALABRAS = {"cas_", "perr_", "gat_", "cami_"};
    private static final String[] RESPUESTAS = {"casa", "perro", "gato", "camion"};

    public String generarPalabra() {
        Random random = new Random();
        int index = random.nextInt(PALABRAS.length);
        return PALABRAS[index];
    }

    public boolean verificarRespuesta(String palabra, String respuesta) {
        for (int i = 0; i < PALABRAS.length; i++) {
            if (PALABRAS[i].equals(palabra)) {
                return RESPUESTAS[i].equalsIgnoreCase(respuesta);
            }
        }
        return false;
    }
}
