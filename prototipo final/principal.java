import javax.swing.*;

public class principal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GameView().setVisible(true);
        });
    }
}

