import java.util.List;

public class Poker {
    private static final int BRELAN_POINTS = 30;
    private static final int CARRE_POINTS = 60;

    public static int score(List<Hand> hands) {
        int total = 0;
        for (Hand hand : hands) {
            total += scoreOf(hand);
        }
        return total;
    }

    private static int scoreOf(Hand hand) {
        if (hasCarre(hand)) {
            return CARRE_POINTS;
        }
        if (hasBrelan(hand)) {
            return BRELAN_POINTS;
        }
        return highestCardValue(hand);
    }

    private static boolean hasBrelan(Hand hand) {
        for (Card card : hand.cards()) {
            if (countCardsWithValue(hand, card.value()) == 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasCarre(Hand hand) {
        for (Card card : hand.cards()) {
            if (countCardsWithValue(hand, card.value()) == 4) {
                return true;
            }
        }
        return false;
    }

    private static int countCardsWithValue(Hand hand, int value) {
        int count = 0;
        for (Card card : hand.cards()) {
            if (card.value() == value) {
                count++;
            }
        }
        return count;
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
