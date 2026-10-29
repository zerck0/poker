import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class PokerTest {

    private static final Hand KING_HIGH = hand(
        card(3, Suit.CLUBS),
        card(8, Suit.DIAMONDS),
        card(10, Suit.HEARTS),
        card(12, Suit.SPADES),
        card(13, Suit.CLUBS)
    );

    private static final Hand ACE_HIGH = hand(
        card(14, Suit.HEARTS),
        card(4, Suit.CLUBS),
        card(7, Suit.DIAMONDS),
        card(9, Suit.SPADES),
        card(11, Suit.HEARTS)
    );

    @Test
    void highCardScoresHighestCardValue() {
        assertEquals(13, Poker.score(List.of(KING_HIGH)));
    }

    @Test
    void highCardWithAceScores14() {
        assertEquals(14, Poker.score(List.of(ACE_HIGH)));
    }

    @Test
    void scoresSumOfAllHands() {
        assertEquals(27, Poker.score(List.of(KING_HIGH, ACE_HIGH)));
    }

    private static Hand hand(Card... cards) {
        return new Hand(List.of(cards));
    }

    private static Card card(int value, Suit suit) {
        return new Card(value, suit);
    }
}
