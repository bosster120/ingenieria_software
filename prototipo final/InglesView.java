
import javax.swing.*;

public class InglesView extends JFrame {
    private Ingles ingles;
    private JLabel lblPregunta;
    private JTextField txtRespuesta;
    private JButton btnVerificar;

    public InglesView() {
        ingles = new Ingles();
        setTitle("Inglés");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        lblPregunta = new JLabel(ingles.generarPregunta());
        txtRespuesta = new JTextField(15);
        btnVerificar = new JButton("Verificar");

        btnVerificar.addActionListener(e -> {
            String respuesta = txtRespuesta.getText();
            if (ingles.verificarRespuesta(respuesta)) {
                JOptionPane.showMessageDialog(this, "¡Correcto!");
            } else {
                JOptionPane.showMessageDialog(this, "Incorrecto. Intenta de nuevo.");
            }
            lblPregunta.setText(ingles.generarPregunta());
            txtRespuesta.setText("");
        });

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(lblPregunta);
        add(txtRespuesta);
        add(btnVerificar);

        setVisible(true);
    }
}
