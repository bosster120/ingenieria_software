import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EspanolTest {
    @Test
    public void testGenerarPalabra() {
        Espanol espanol = new Espanol();
        String palabra = espanol.generarPalabra();
        assertNotNull(palabra, "La palabra generada no debe ser nula");
    }

    @Test
    public void testVerificarRespuesta() {
        Espanol espanol = new Espanol();
        assertTrue(espanol.verificarRespuesta("cas_", "casa"), "Debe coincidir con la respuesta correcta");
        assertFalse(espanol.verificarRespuesta("cas_", "auto"), "No debe coincidir con una respuesta incorrecta");
    }
}
