import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class PokerTest {

    @Test
    void singleHighCardHandScoresValueOfHighestCard() {
        Hand hand = new Hand(List.of(
            new Card(3, Suit.CLUBS),
            new Card(8, Suit.DIAMONDS),
            new Card(10, Suit.HEARTS),
            new Card(12, Suit.SPADES),
            new Card(13, Suit.CLUBS)
        ));

        assertEquals(13, Poker.score(List.of(hand)));
    }
}
