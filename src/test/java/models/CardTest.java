package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/3/17.
 */
public class CardTest {

    @Test
    public void newCard_instantiatesCorrectly() throws Exception{
        Card testCard = new Card ("spade","2");
        assertEquals(true, testCard instanceof Card);
    }

    @Test
    public void getDeck_create52UniqueCards_String() throws Exception{
        BlackJack testBlackJack = new BlackJack ();
        String actualValue = testBlackJack.getDeck().get(0).suit;
        String actualValue2 = testBlackJack.getDeck().get(51).suit;
        assertEquals("Spades", actualValue );
        assertEquals("Diamonds", actualValue2 );
    }
    @Test
    public void dealRandomCard_returnsACard_Boolean() throws Exception{
        BlackJack testBlackJack = new BlackJack ();
        assertEquals(true, testBlackJack.dealRandomCard() instanceof Card);

    }
    @Test
    public void dealFirst2Cards_Integer() throws Exception {
        BlackJack testBlackJack = new BlackJack ();
        assertEquals(2, testBlackJack.dealFirst2Cards().size());
    }

}