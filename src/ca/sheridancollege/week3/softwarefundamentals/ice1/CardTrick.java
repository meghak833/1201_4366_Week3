
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * 
 * @author Junpyo Hong
 * Student id: 991369150
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scan = new Scanner (System.in);
        Card[] magicHand = new Card[7];
        
       
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13)+1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i]=c;
        }
 
        
        
         //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        
        System.out.println ("Enter your card number ");
        int cardNum = scan.nextInt();
        System.out.println ("Enter the card suit ");
        scan.nextLine();
        String cardSuit = scan.nextLine();
        
        Card newCard = new Card ();
        newCard.setValue(cardNum);
        newCard.setSuit(cardSuit);        
        
        for (int j=0; j<magicHand.length; j++){
            
        if (magicHand[j].getValue() == newCard.getValue() && magicHand[j].getSuit().equalsIgnoreCase(newCard.getSuit())){
            System.out.println("We have a match");
        }
        else {
            System.out.println("Card " + j + " doesn't match");
        }
        
        
        
        

    }
    
}
}
