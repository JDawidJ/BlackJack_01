import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


@SuppressWarnings("serial")
    public class GUILowerButtonPanel extends JPanel {

        private JButton takeCardButton = new JButton("DOBIERZ KARTĘ");
        private JButton passButton = new JButton("PASS");
        private final Color backgroundColor = Color.white;

        public GUILowerButtonPanel(int w, int h, GUIGamePanel game) {
            setPreferredSize(new Dimension(w,h));
            setBorder(new EmptyBorder(10, 10, 10, 10));
            setBackground(backgroundColor);

            takeCardButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            passButton.setAlignmentX(Component.CENTER_ALIGNMENT);

            takeCardButton.addActionListener(new TakeCardAction(game));
            passButton.addActionListener(new GUIPassCardAction(game));

            add(takeCardButton);
            add(passButton);
        }

        public void disableButtons() {
            takeCardButton.setEnabled(false);
            passButton.setEnabled(false);
        }

    }


