package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel 
 * Branch: Zhaoxu Han 
 * No:991581014
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Card c = new Card();
        Scanner input = new Scanner(System.in);
        System.out.println("What is your card number?");
        c.setValue(input.nextInt());
        input.nextLine();
        System.out.println("What is  your card suit?");
        c.setSuit(input.nextLine());

        boolean result = false;
        for (Card card : magicHand) {
            if (card.getValue() == c.getValue() && card.getSuit().equals(c.getSuit())) {
                result = true;
            }
            break;
        }
        System.out.println(result ? "Found" : "Not Found");
        for (Card card : magicHand) {
            System.out.println(card);
        }
    }
}
