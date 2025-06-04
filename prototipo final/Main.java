import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Inicializar la base de datos
        DatabaseManager.initDatabase();

        // Sembrar los datos iniciales
        DataSeeder.seedDatabase();

        // Lanzar la aplicación gráfica
        SwingUtilities.invokeLater(() -> {
            GameView app = new GameView();
            app.setVisible(true);
        });
    }
}
