import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        try {
            // UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

            // JTattoo
            // UIManager.setLookAndFeel("com.jtattoo.plaf.smart.McWinLookAndFeel ");
            // UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            // UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
        }
        catch (UnsupportedLookAndFeelException e) {
            // Nic nie rob
        }
        catch (ClassNotFoundException e) {
            // Nic nie rob
        }
        catch (InstantiationException e) {
            // Nic nie rob
        }
        catch (IllegalAccessException e) {
            // Nic nie rob
        }

        new GUIGameFrame();
    }
}
