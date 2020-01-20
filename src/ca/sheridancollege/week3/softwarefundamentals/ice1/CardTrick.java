/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Emeshe Nagy-Zambo 991561578
 * @author Megha Patel
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) ((Math.random()*13) + 1));
            c.setSuit(Card.SUITS[(int) (Math.random()*4)]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getValue() + " " +
                        magicHand[i].getSuit());
        }
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your card value");
        int cardValue = in.nextInt();
        in.nextLine();
        System.out.println("Enter your card suit");
        String cardSuit = in.nextLine();
        Card theirCard = new Card();
        theirCard.setValue(cardValue);
        theirCard.setSuit(cardSuit);
        
        System.out.println("Your luck card is " + theirCard.getValue() + " " + 
                theirCard.getHearts());

        
        
        
       
    }
    
}













