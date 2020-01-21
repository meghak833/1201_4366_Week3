/*991421314*/
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/** Imports the Scanner utility. */
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * @modifier Matt Dutra
 * Date modified: 2020-01-20
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
    	Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)((Math.random()*13)+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
        }
        
        Card c = new Card();
        // creates scanner for the card value
        Scanner in = new Scanner(System.in);
        System.out.print("Enter card value: ");
        int value = in.nextInt();
        // sets the random value for the card value
        c.setValue((int)((Math.random()*13)+1));
        // creates scanner for the card suit
        Scanner in2 = new Scanner(System.in); 
        System.out.print("Enter card suit: ");
        String suit = in2.nextLine();
        // sets the random suit for the card suit
        c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
        
        // prints your lucky card
        System.out.println("Your lucky card is the "+c.getValue()+" of "
        		+c.getSuit());
    } 
}