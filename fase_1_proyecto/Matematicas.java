
import java.util.Random;

public class Matematicas {
    private Random random = new Random();
    private int num1, num2;
    private String operacion;

    public String generarOperacion() {
        num1 = random.nextInt(20) + 1;
        num2 = random.nextInt(20) + 1;
        String[] operaciones = {"+", "-", "*", "/"};
        operacion = operaciones[random.nextInt(operaciones.length)];
        return num1 + " " + operacion + " " + num2;
    }

    public boolean verificarRespuesta(String respuesta) {
        double resultadoReal = switch (operacion) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / (double) num2;
            default -> 0;
        };
        return Math.abs(Double.parseDouble(respuesta) - resultadoReal) < 0.01;
    }
}
