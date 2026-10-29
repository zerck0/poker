import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class PokerTest {

    @Test
    void highCardScoresHighestCardValue() {
        Hand hand = hand(
            card(3, Suit.CLUBS),
            card(8, Suit.DIAMONDS),
            card(10, Suit.HEARTS),
            card(12, Suit.SPADES),
            card(13, Suit.CLUBS)
        );

        assertEquals(13, Poker.score(List.of(hand)));
    }

    @Test
    void highCardWithAceScores14() {
        Hand hand = hand(
            card(14, Suit.HEARTS),
            card(4, Suit.CLUBS),
            card(7, Suit.DIAMONDS),
            card(9, Suit.SPADES),
            card(11, Suit.HEARTS)
        );

        assertEquals(14, Poker.score(List.of(hand)));
    }

    @Test
    void scoresSumOfAllHands() {
        Hand kingHigh = hand(
            card(3, Suit.CLUBS),
            card(8, Suit.DIAMONDS),
            card(10, Suit.HEARTS),
            card(12, Suit.SPADES),
            card(13, Suit.CLUBS)
        );
        Hand aceHigh = hand(
            card(14, Suit.HEARTS),
            card(4, Suit.CLUBS),
            card(7, Suit.DIAMONDS),
            card(9, Suit.SPADES),
            card(11, Suit.HEARTS)
        );

        assertEquals(27, Poker.score(List.of(kingHigh, aceHigh)));
    }


    private static Hand hand(Card... cards) {
        return new Hand(List.of(cards));
    }

    private static Card card(int value, Suit suit) {
        return new Card(value, suit);
    }
}
