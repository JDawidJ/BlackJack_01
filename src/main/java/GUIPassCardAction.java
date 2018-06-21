import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPassCardAction implements ActionListener {

    private GUIGamePanel game;

    public GUIPassCardAction(GUIGamePanel game) {
        this.game = game;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        game.doDealerTurn();
        game.finishGame();
    }

}
