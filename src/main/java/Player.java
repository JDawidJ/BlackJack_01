import java.util.ArrayList;

public class Player {private String name;
    private ArrayList<Card> hand;

    public Player (String playerName) {
        hand = new ArrayList<>();
        name = playerName;
    }

    public String getName() {
        return name;
    }

    public void addCardToHand(Card newCard) {
        hand.add(newCard);
    }

    public int getHandSum() {

        int sumOfPoints = 0;
        int cardPoints;
        int numberOfAces = 0;

        for (int i = 0; i < hand.size(); i++) {

            cardPoints = hand.get(i).getCardValue().getValue();

            if (cardPoints == 11) {
                numberOfAces++;
                sumOfPoints += 11;
            } else {
                sumOfPoints += cardPoints;
            }
        }

        while (sumOfPoints > 21 && numberOfAces > 0) {
            sumOfPoints -= 10;
            numberOfAces--;
        }

        return sumOfPoints;
    }

    public void printHand(boolean showFirstHand) {

        System.out.print(name + ":");
        System.out.println(getHandText(showFirstHand));

        if (showFirstHand) {
            System.out.println("Punkty: [" + getHandSum() + "] \n");
        } else {
            System.out.println("Punkty: [?] \n");
        }
    }

    public String getHandText (boolean showFirstHand) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < hand.size(); i++) {

            if (i == 0 && !showFirstHand) {
                sb.append("\n[Ukryta]");
            } else {
                sb.append("\n" + hand.get(i).toString());
            }
        }
        return sb.toString();
    }

    public boolean checkIfBusted() {
        if (getHandSum() < 22) {
            return false;
        } else {
            return true;
        }
    }
}
