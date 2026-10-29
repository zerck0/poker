import java.util.List;

public class Poker {
    public static int score(List<Hand> hands) {
        int total = 0;
        for (Hand hand : hands) {
            total += highestCardValue(hand);
        }
        return total;
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
