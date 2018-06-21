import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GUIGamePanel extends JPanel {

    private Deck deck;
    private Player player;
    private Player dealer;

    private final Dimension panelSize = new Dimension(600, 400);
    private final Color backgroundColor = Color.white;

    private GUIPlayerPanel GUIPlayerPanel;
    private GUIPlayerPanel dealerPanel;
    private GUILowerButtonPanel lowerPanel;

    public GUIGamePanel() {

        deck = new Deck();
        deck.shuffle();
        player = new Player("Ja");
        dealer = new Player("Krupier");

        setPreferredSize(panelSize);
        setBackground(backgroundColor);
        setLayout(new BorderLayout());

        GUIPlayerPanel = new GUIPlayerPanel(300,150);
        dealerPanel = new GUIPlayerPanel(300,150);
        lowerPanel = new GUILowerButtonPanel(600, 50, this);

        add(GUIPlayerPanel, BorderLayout.WEST);
        add(dealerPanel, BorderLayout.EAST);
        add(lowerPanel, BorderLayout.SOUTH);

    }

    public void runGame() {

        player.addCardToHand(deck.handOutCard());
        dealer.addCardToHand(deck.handOutCard());
        player.addCardToHand(deck.handOutCard());
        dealer.addCardToHand(deck.handOutCard());

        GUIPlayerPanel.setText(player.getCardsOnHand(true));
        dealerPanel.setText(dealer.getCardsOnHand(false));

    }

    public void doDealerTurn() {

        boolean dealerInGame = true;

        while (dealerInGame) {
            if (dealer.getHandSum() < 17) {

                dealer.addCardToHand(deck.handOutCard());
                dealerInGame = !dealer.checkIfBusted();
                dealerPanel.setText(dealer.getCardsOnHand(false));

            } else {
                dealerInGame = false;
            }
        }
    }

    public void finishGame() {

        lowerPanel.disableButtons();

        int playerSum = player.getHandSum();
        int dealerSum = dealer.getHandSum();

        if (playerSum > dealerSum && playerSum <= 21 || dealerSum > 21) {
            GUIPlayerPanel.setWinnerLabelText("<html> <b> Wygrałeś! </b> </html>");
        } else {
            dealerPanel.setWinnerLabelText("<html> <b> Krupier wygrał! </b> </html>");
        }

        GUIPlayerPanel.setText(player.getCardsOnHand(true));
        dealerPanel.setText(dealer.getCardsOnHand(true));

    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getDealer() {
        return dealer;
    }

    public void setDealer(Player dealer) {
        this.dealer = dealer;
    }

    public GUIPlayerPanel getGUIPlayerPanel() {
        return GUIPlayerPanel;
    }

    public void setGUIPlayerPanel(GUIPlayerPanel GUIPlayerPanel) {
        this.GUIPlayerPanel = GUIPlayerPanel;
    }

    public GUIPlayerPanel getDealerPanel() {
        return dealerPanel;
    }

    public void setDealerPanel(GUIPlayerPanel dealerPanel) {
        this.dealerPanel = dealerPanel;
    }

    public GUILowerButtonPanel getLowerPanel() {
        return lowerPanel;
    }

    public void setLowerPanel(GUILowerButtonPanel lowerPanel) {
        this.lowerPanel = lowerPanel;
    }

}
