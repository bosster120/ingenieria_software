
import javax.swing.*;

public class MatematicasView extends JFrame {
    private Matematicas matematicas;
    private JLabel lblPregunta;
    private JTextField txtRespuesta;
    private JButton btnVerificar;

    public MatematicasView() {
        matematicas = new Matematicas();
        setTitle("Matemáticas");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        lblPregunta = new JLabel("Resuelve: " + matematicas.generarOperacion());
        txtRespuesta = new JTextField(15);
        btnVerificar = new JButton("Verificar");

        btnVerificar.addActionListener(e -> {
            try {
                String respuesta = txtRespuesta.getText();
                if (matematicas.verificarRespuesta(respuesta)) {
                    JOptionPane.showMessageDialog(this, "¡Correcto!");
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrecto. Intenta de nuevo.");
                }
                lblPregunta.setText("Resuelve: " + matematicas.generarOperacion());
                txtRespuesta.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa un número válido.");
            }
        });

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(lblPregunta);
        add(txtRespuesta);
        add(btnVerificar);

        setVisible(true);
    }
}
