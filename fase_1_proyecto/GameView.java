
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameView extends JFrame {
    private JButton btnEspanol, btnMatematicas, btnSociales, btnIngles;
    private JPanel panel;

    public GameView() {
        setTitle("Aplicación de Enseñanza");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        btnEspanol = new JButton("Español");
        btnMatematicas = new JButton("Matemáticas");
        btnSociales = new JButton("Sociales");
        btnIngles = new JButton("Inglés");

        panel.add(btnEspanol);
        panel.add(btnMatematicas);
        panel.add(btnSociales);
        panel.add(btnIngles);

        add(panel);

        btnEspanol.addActionListener(e -> new EspanolView());
        btnMatematicas.addActionListener(e -> new MatematicasView());
        btnSociales.addActionListener(e -> new SocialesView());
        btnIngles.addActionListener(e -> new InglesView());

        // Faltan las otras vistas; se implementarán más adelante.
    }
}
