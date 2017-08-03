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
        List<Card> dealerHand = newBlackJack.dealFirst2Cards();
        System.out.println("Dealers hand : " + newBlackJack.getHandAsString(dealerHand));

        List<Card> playerHand = newBlackJack.dealFirst2Cards();
        System.out.println("Players hand : " + newBlackJack.getHandAsString(playerHand));
        String status = newBlackJack.checkHand(playerHand);
        while (status.equalsIgnoreCase("userFeedback")) {
            //if (status.equalsIgnoreCase("userFeedback"))
            System.out.println("Would you like to Hit or Stand");
            BufferedReader newBufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String userOption = newBufferedReader.readLine();
                if (userOption.equalsIgnoreCase("hit")) {
                    playerHand.add(newBlackJack.dealRandomCard());
                    System.out.println("Players hand : " + newBlackJack.getHandAsString(playerHand));
                    status = newBlackJack.checkHand(playerHand);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        printStatus(status);
    }

    public static void printStatus(String status) {
        if (status.equalsIgnoreCase("blackjack")) {
            System.out.println("BlackJack!! Your a winner");
        } else if (status.equalsIgnoreCase("bust")) {
            System.out.println("Bust! over 21 sucker");
        }
    }
}










//        while (yourHandisActive) {
//            System.out.println("Would you like to Hit or Stand");
//            BufferedReader newBufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            try {
//                String userOption = newBufferedReader.readLine();
//                playerHand = newBlackJack.playHand(playerHand, userOption);
//                System.out.println("Players hand : " + newBlackJack.getHandAsString(playerHand));
//                if
//        }



//        try {
//
//        while (yourHandisActive) {
//
//            if (newBlackJack.getTotal(playerHand) == 21 ) {
//                System.out.println("You Win Game over");
//                yourHandisActive = false;
//            } else if (newBlackJack.getTotal(playerHand) > 21) {
//                System.out.println("You are over 21, Bust! Game Over");
//                yourHandisActive = false;
//            }else {
//                    System.out.println("Would you like to Hit or Stand");
//                    String userOption = newBufferedReader.readLine();
//                    if (userOption.equalsIgnoreCase("hit")) {
//                        playerHand.add(newBlackJack.dealRandomCard());
//                        System.out.println("Players hand : " + newBlackJack.getHandAsString(playerHand));
//                    } else {
//                        yourHandisActive = false;
//                    }
//
//                }
//            }
//
//
//            } catch (IOException e) {
//            e.printStackTrace();
//            }



        //  }

