package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Guest on 8/3/17.
 */
public class App {

    public static void main(String[] args) {
        boolean yourHandisActive = true;

        BlackJack newBlackJack = new BlackJack();
        System.out.println("Lets Play BlackJack");

        List<Card> playerHand = newBlackJack.dealFirst2Cards();
        List<Card> dealerHand = newBlackJack.dealFirst2Cards();

        System.out.println("Players hand : " + newBlackJack.getHandAsString(playerHand));
        System.out.println("Dealers hand : " + newBlackJack.getHandAsString(dealerHand));


        BufferedReader newBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {

        while (yourHandisActive) {

            if (newBlackJack.getTotal(playerHand) == 21 ) {
                System.out.println("You Win Game over");
                yourHandisActive = false;
            } else if (newBlackJack.getTotal(playerHand) > 21) {
                System.out.println("You are over 21, Bust! Game Over");
                yourHandisActive = false;
            }else {
                    System.out.println("Would you like to Hit or Stand");
                    String userOption = newBufferedReader.readLine();
                    if (userOption.equalsIgnoreCase("hit")) {
                        playerHand.add(newBlackJack.dealRandomCard());
                        System.out.println("Players hand : " + newBlackJack.getHandAsString(playerHand));
                    } else {
                        yourHandisActive = false;
                    }

                }
            }


            } catch (IOException e) {
            e.printStackTrace();
        }



        //  }



    }

}
