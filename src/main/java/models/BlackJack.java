package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Guest on 8/3/17.
 */
public class BlackJack {



    public List<Card> getDeck () {

        List<Card> deck = new ArrayList<Card>();
        String [] suits = {"Spades","Hearts","Clubs","Diamonds"};
        String [] faces = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for (String suit: suits) {
            for (String face : faces) {
                Card newCard = new Card(suit, face);
                deck.add(newCard);
            }
        }
        return deck;
    }

    public Card dealRandomCard (){
        List<Card> dealersDeck = getDeck();
        Random myRandomCardGenerator = new Random();
        int randomIndex = myRandomCardGenerator.nextInt(52);
        return dealersDeck.get(randomIndex);
    }

    public List<Card> dealFirst2Cards () {
        List<Card> hand = new ArrayList<>();
        hand.add(dealRandomCard());
        hand.add(dealRandomCard());
        return hand;
    }

    public Integer getTotal (List<Card> hand) {
        Integer value;
        int sum = 0;
        for ( Card card : hand) {
            if ( card.getFace().charAt(0) == 'A'){
                value = 11;
            } else if ( card.getFace().charAt(0) == 'J' ||
                        card.getFace().charAt(0) =='Q' ||
                        card.getFace().charAt(0) == 'K' ) {
                value = 10;
            } else {
                //for 1-10
                value = Integer.parseInt(card.getFace());
            }
            sum += value;

        }
        return sum;

    }
    public String getHandAsString(List<Card>hand){
        String cardString = "";
        for (int i = 0; i < hand.size(); i++) {
             cardString = cardString + "Card" + i + ": " + hand.get(i).getFace() +" of "+ hand.get(i).getSuit()+ "      ";
        }
        cardString = cardString + "   Total : " + getTotal(hand);
        return cardString;
    }

}
