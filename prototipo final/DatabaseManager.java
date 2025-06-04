import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:sqlite:educacion.db";

    public static void initDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {

            // Crear tabla Español
            String createEspanol = "CREATE TABLE IF NOT EXISTS Espanol (" +
                                   "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                   "palabra TEXT NOT NULL, " +
                                   "respuesta TEXT NOT NULL)";
            stmt.execute(createEspanol);

            // Crear tabla Sociales
            String createSociales = "CREATE TABLE IF NOT EXISTS Sociales (" +
                                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                    "pais TEXT NOT NULL, " +
                                    "capital TEXT NOT NULL)";
            stmt.execute(createSociales);

            // Crear tabla Inglés
            String createIngles = "CREATE TABLE IF NOT EXISTS Ingles (" +
                                   "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                   "espanol TEXT NOT NULL, " +
                                   "ingles TEXT NOT NULL)";
            stmt.execute(createIngles);

            System.out.println("Base de datos inicializada.");
        } catch (Exception e) {
            System.out.println("Error al inicializar la base de datos: " + e.getMessage());
        }
    }
}
