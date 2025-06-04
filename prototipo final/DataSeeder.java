import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataSeeder {
    private static final String DB_URL = "jdbc:sqlite:educacion.db";

    public static void seedDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            if (!datosYaSembrados(conn)) {
                insertarDatosEspanol(conn);
                insertarDatosSociales(conn);
                insertarDatosIngles(conn);
                System.out.println("Datos iniciales insertados.");
            } else {
                System.out.println("Los datos ya existen en la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error al sembrar datos: " + e.getMessage());
        }
    }

    private static boolean datosYaSembrados(Connection conn) throws SQLException {
        String sql = "SELECT COUNT(*) FROM Espanol";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            var rs = pstmt.executeQuery();
            return rs.next() && rs.getInt(1) > 0;
        }
    }

    private static void insertarDatosEspanol(Connection conn) throws SQLException {
        String sql = "INSERT INTO Espanol (palabra, respuesta) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "cas_");
            pstmt.setString(2, "casa");
            pstmt.executeUpdate();

            pstmt.setString(1, "perr_");
            pstmt.setString(2, "perro");
            pstmt.executeUpdate();

            pstmt.setString(1, "gat_");
            pstmt.setString(2, "gato");
            pstmt.executeUpdate();
        }
    }

    private static void insertarDatosSociales(Connection conn) throws SQLException {
        String sql = "INSERT INTO Sociales (pais, capital) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "Colombia");
            pstmt.setString(2, "Bogotá");
            pstmt.executeUpdate();

            pstmt.setString(1, "Argentina");
            pstmt.setString(2, "Buenos Aires");
            pstmt.executeUpdate();

            pstmt.setString(1, "España");
            pstmt.setString(2, "Madrid");
            pstmt.executeUpdate();
        }
    }

    private static void insertarDatosIngles(Connection conn) throws SQLException {
        String sql = "INSERT INTO Ingles (espanol, ingles) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "casa");
            pstmt.setString(2, "house");
            pstmt.executeUpdate();

            pstmt.setString(1, "perro");
            pstmt.setString(2, "dog");
            pstmt.executeUpdate();

            pstmt.setString(1, "gato");
            pstmt.setString(2, "cat");
            pstmt.executeUpdate();
        }
    }
}
