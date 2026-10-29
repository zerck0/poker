import java.util.List;

public class Poker {
    public static int score(List<Hand> hands) {
        Hand hand = hands.get(0);
        int max = 0;
        for (Card card : hand.cards()) {
            if (card.value() > max) {
                max = card.value();
            }
        }
        return max;
    }
}