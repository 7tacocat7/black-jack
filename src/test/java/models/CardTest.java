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
    public void getDeck_() throws Exception{
        BlackJack testBlackJack = new BlackJack ();
        String actualValue = testBlackJack.getDeck().get(0).suit;
        assertEquals("Spades", actualValue );
    }

}