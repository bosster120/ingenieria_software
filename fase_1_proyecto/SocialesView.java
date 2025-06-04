
import javax.swing.*;

public class SocialesView extends JFrame {
    private Sociales sociales;
    private JLabel lblPregunta;
    private JTextField txtRespuesta;
    private JButton btnVerificar;

    public SocialesView() {
        sociales = new Sociales();
        setTitle("Sociales");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        lblPregunta = new JLabel(sociales.generarPregunta());
        txtRespuesta = new JTextField(15);
        btnVerificar = new JButton("Verificar");

        btnVerificar.addActionListener(e -> {
            String respuesta = txtRespuesta.getText();
            if (sociales.verificarRespuesta(respuesta)) {
                JOptionPane.showMessageDialog(this, "¡Correcto!");
            } else {
                JOptionPane.showMessageDialog(this, "Incorrecto. Intenta de nuevo.");
            }
            lblPregunta.setText(sociales.generarPregunta());
            txtRespuesta.setText("");
        });

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(lblPregunta);
        add(txtRespuesta);
        add(btnVerificar);

        setVisible(true);
    }
}

