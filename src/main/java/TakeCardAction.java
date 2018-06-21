import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



    public class TakeCardAction implements ActionListener {

        private GUIGamePanel game;
        boolean playerInGame = true;

        public TakeCardAction(GUIGamePanel game) {
            this.game = game;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            game.getPlayer().addCardToHand(game.getDeck().handOutCard());
            playerInGame = !game.getPlayer().checkIfBusted();
            game.getGUIPlayerPanel().setText(game.getPlayer().getCardsOnHand(true));

            if (!playerInGame) {
                game.finishGame();
            }
        }

    }



