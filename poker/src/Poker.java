import java.util.List;

public class Poker {
    public static int score(List<Hand> hands) {
        return highestCardValue(hands.get(0));
    }

    private static int highestCardValue(Hand hand) {
        int max = 0;
        for (Card card : hand.cards()) {
            if (card.value() > max) {
                max = card.value();
            }
        }
        return max;
    }
}
