import javax.swing.*;
import java.awt.*;

public class GameView extends JFrame {
    private JButton btnEspanol, btnMatematicas, btnSociales, btnIngles;

    public GameView() {
        setTitle("Aplicación de Enseñanza");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Menú principal
        JMenuBar menuBar = new JMenuBar();
        JMenu menuOpciones = new JMenu("Opciones");

        // Ítem "Acerca de..."
        JMenuItem menuAcercaDe = new JMenuItem("Acerca de...");
        menuAcercaDe.addActionListener(e -> mostrarAcercaDe());

        // Ítem "Salir"
        JMenuItem menuSalir = new JMenuItem("Salir");
        menuSalir.addActionListener(e -> System.exit(0));

        menuOpciones.add(menuAcercaDe);
        menuOpciones.addSeparator(); // Línea separadora
        menuOpciones.add(menuSalir);
        menuBar.add(menuOpciones);

        setJMenuBar(menuBar);

        // Panel principal con botones
        JPanel mainPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        btnEspanol = new JButton("Español");
        btnMatematicas = new JButton("Matemáticas");
        btnSociales = new JButton("Sociales");
        btnIngles = new JButton("Inglés");

        mainPanel.add(btnEspanol);
        mainPanel.add(btnMatematicas);
        mainPanel.add(btnSociales);
        mainPanel.add(btnIngles);

        add(mainPanel, BorderLayout.CENTER);

        // Conexión de botones a las vistas
        btnEspanol.addActionListener(e -> new EspanolView());
        btnMatematicas.addActionListener(e -> new MatematicasView());
        btnSociales.addActionListener(e -> new SocialesView());
        btnIngles.addActionListener(e -> new InglesView());
    }

    // Método para mostrar el cuadro "Acerca de..."
    public void mostrarAcercaDe() {
        String mensaje = """
                Aprende facil
                -----------------------
                Esta aplicación está diseñada para enseñar materias básicas a los niños
                de primaria las cuales son: Español, Matemáticas, Sociales e Inglés.
                estas son las mas basicas e importantes durante los primeros años de
                aprendizaje, permite una guia mas sencilla y facil de entender

                Autores:
                - Juan Esteban Tabares
                
                Fecha de desarrollo: Diciembre 2024
                """;

        JOptionPane.showMessageDialog(this, mensaje, "Acerca de...", JOptionPane.INFORMATION_MESSAGE);
    }
}


