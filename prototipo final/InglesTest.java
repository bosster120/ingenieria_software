import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InglesTest {
    @Test
    public void testGenerarPregunta() {
        Ingles ingles = new Ingles();
        String pregunta = ingles.generarPregunta();
        assertNotNull(pregunta, "La pregunta generada no debe ser nula");
        assertTrue(pregunta.startsWith("¿Cómo se dice '"), "La pregunta debe comenzar con '¿Cómo se dice ''");
    }

    @Test
    public void testVerificarRespuestaCorrecta() {
        Ingles ingles = new Ingles();
        ingles.palabraActual = "casa"; // Configura la palabra actual para la prueba
        assertTrue(ingles.verificarRespuesta("house"), "La respuesta 'house' debe ser correcta para 'casa'");
    }

    @Test
    public void testVerificarRespuestaIncorrecta() {
        Ingles ingles = new Ingles();
        ingles.palabraActual = "casa"; // Configura la palabra actual para la prueba
        assertFalse(ingles.verificarRespuesta("dog"), "La respuesta 'dog' debe ser incorrecta para 'casa'");
    }
}
