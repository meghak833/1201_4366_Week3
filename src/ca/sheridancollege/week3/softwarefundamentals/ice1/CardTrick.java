/*991421314*/
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * @modifier Matt Dutra
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
        
        Card c = new C();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter card value: ");
        int value = in.nextInt();
        c.setValue((int)((Math.random()*13)+1));
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter card suit: ");
        String suit = in2.nextLine();
        c.setSuit(C.SUITS[(int)(Math.random()*4)]);
        
        System.out.println("Your lucky card is the "+c.getValue()+" of "
        		+c.getSuit());
    } 
}