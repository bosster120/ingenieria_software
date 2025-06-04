import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SocialesTest {
    @Test
    public void testGenerarPregunta() {
        Sociales sociales = new Sociales();
        String pregunta = sociales.generarPregunta();
        assertNotNull(pregunta, "La pregunta generada no debe ser nula");
        assertTrue(pregunta.startsWith("¿Cuál es la capital de "), "La pregunta debe comenzar con '¿Cuál es la capital de '");
    }

    @Test
    public void testVerificarRespuestaCorrecta() {
        Sociales sociales = new Sociales();
        sociales.paisActual = "Colombia"; // Configura el país actual para la prueba
        assertTrue(sociales.verificarRespuesta("Bogotá"), "La respuesta 'Bogotá' debe ser correcta para 'Colombia'");
    }

    @Test
    public void testVerificarRespuestaIncorrecta() {
        Sociales sociales = new Sociales();
        sociales.paisActual = "Colombia"; // Configura el país actual para la prueba
        assertFalse(sociales.verificarRespuesta("Madrid"), "La respuesta 'Madrid' debe ser incorrecta para 'Colombia'");
    }
}
