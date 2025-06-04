
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ingles {
    private static final Map<String, String> PALABRAS = new HashMap<>();

    static {
        PALABRAS.put("casa", "house");
        PALABRAS.put("perro", "dog");
        PALABRAS.put("gato", "cat");
        PALABRAS.put("libro", "book");
        PALABRAS.put("escuela", "school");
    }

    public String palabraActual;

    public String generarPregunta() {
        Random random = new Random();
        Object[] palabras = PALABRAS.keySet().toArray();
        palabraActual = (String) palabras[random.nextInt(palabras.length)];
        return "¿Cómo se dice '" + palabraActual + "' en inglés?";
    }

    public boolean verificarRespuesta(String respuesta) {
        return PALABRAS.getOrDefault(palabraActual, "").equalsIgnoreCase(respuesta);
    }
}
