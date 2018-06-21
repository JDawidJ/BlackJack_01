import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

 @SuppressWarnings("serial")
public class GUIPlayerPanel extends JPanel {

    private JLabel textLabel = new JLabel();
    private JLabel winnerLabel = new JLabel();
    private final Color backgroundColor = Color.white;

    public GUIPlayerPanel(int w, int h) {
        setPreferredSize(new Dimension(w,h));
        setBackground(backgroundColor);
        setBorder(new EmptyBorder(10, 10, 10, 10));

        setLayout(new BorderLayout());
        add(textLabel, BorderLayout.NORTH);
        add(winnerLabel, BorderLayout.SOUTH);
    }

    public void setText(String text) {
        textLabel.setText(text);
    }

    public void setWinnerLabelText(String text) {
        winnerLabel.setText(text);
    }

}


