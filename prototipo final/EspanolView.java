
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EspanolView extends JFrame {
    private Espanol espanol;
    private JLabel lblPalabra;
    private JTextField txtRespuesta;
    private JButton btnVerificar;

    public EspanolView() {
        espanol = new Espanol();
        setTitle("Español");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        lblPalabra = new JLabel("Completa la palabra: " + espanol.generarPalabra());
        txtRespuesta = new JTextField(15);
        btnVerificar = new JButton("Verificar");

        btnVerificar.addActionListener(e -> {
            String palabra = lblPalabra.getText().split(": ")[1];
            String respuesta = txtRespuesta.getText();
            if (espanol.verificarRespuesta(palabra, respuesta)) {
                JOptionPane.showMessageDialog(this, "¡Correcto!");
            } else {
                JOptionPane.showMessageDialog(this, "Incorrecto. Intenta de nuevo.");
            }
        });

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(lblPalabra);
        add(txtRespuesta);
        add(btnVerificar);

        setVisible(true);
    }
}
