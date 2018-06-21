import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUINewGameAction implements ActionListener {

    JFrame frame;

    public GUINewGameAction(JFrame jframe) {
        frame = jframe;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        frame.dispose();
        new GUIGameFrame();

    }

}
