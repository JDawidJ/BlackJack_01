import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GUIGameFrame extends JFrame {

    public GUIGameFrame(){

        setTitle("Black Jack");
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GUIGamePanel GUIGamePanel = new GUIGamePanel();
        getContentPane().add(GUIGamePanel);


        setJMenuBar(new GUIMenuBar(this));

        pack();
        setVisible(true);

        GUIGamePanel.runGame();

    }

}