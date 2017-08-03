package models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        String actualValue = testBlackJack.getDeck().get(0).getSuit();
        String actualValue2 = testBlackJack.getDeck().get(51).getSuit();
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
    @Test
    public void getTotal_Integer() throws Exception {
        BlackJack testBlackJack = new BlackJack ();
        Card testCard1 = new Card ("Spades","K");
        List<Card> testHand = new ArrayList<>();
        testHand.add(testCard1);
        Card testCard2 = new Card ("Hearts","9");
        testHand.add(testCard2);
        Integer expected = 19;
        assertEquals (expected, testBlackJack.getTotal(testHand) );
    }


}