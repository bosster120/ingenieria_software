
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Sociales {
    private static final Map<String, String> PAISES_CAPITALES = new HashMap<>();

    static {
        PAISES_CAPITALES.put("Colombia", "Bogotá");
        PAISES_CAPITALES.put("Argentina", "Buenos Aires");
        PAISES_CAPITALES.put("España", "Madrid");
        PAISES_CAPITALES.put("Francia", "París");
        PAISES_CAPITALES.put("México", "Ciudad de México");
    }

    private String paisActual;

    public String generarPregunta() {
        Random random = new Random();
        Object[] paises = PAISES_CAPITALES.keySet().toArray();
        paisActual = (String) paises[random.nextInt(paises.length)];
        return "¿Cuál es la capital de " + paisActual + "?";
    }

    public boolean verificarRespuesta(String respuesta) {
        return PAISES_CAPITALES.getOrDefault(paisActual, "").equalsIgnoreCase(respuesta);
    }
}
