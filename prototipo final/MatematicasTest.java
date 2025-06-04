import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatematicasTest {
    @Test
    public void testGenerarOperacion() {
        Matematicas matematicas = new Matematicas();
        String operacion = matematicas.generarOperacion();
        assertNotNull(operacion, "La operación generada no debe ser nula");
        assertTrue(operacion.matches("\\d+ [\\+\\-\\*/] \\d+"), "La operación debe coincidir con el formato esperado");
    }

    @Test
    public void testVerificarRespuestaSuma() {
        Matematicas matematicas = new Matematicas();
        matematicas.num1 = 10;
        matematicas.num2 = 5;
        matematicas.operacion = "+";

        assertTrue(matematicas.verificarRespuesta("15"), "La respuesta 15 debe ser correcta para 10 + 5");
        assertFalse(matematicas.verificarRespuesta("20"), "La respuesta 20 debe ser incorrecta para 10 + 5");
    }
}
