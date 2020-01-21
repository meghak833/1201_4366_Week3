/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * @Modifier Tyler Makris
 */
import java.lang.Math;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // Used for user input
        int cardValue = 0; // Card value
        int suitNum = 0; // Suit value
        Card[] magicHand = new Card[7];
        Card[] userHand = new Card[1];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.random() + 11);
            c.setSuit(Card.SUITS[(int) Math.random() + 3]);
        }
        
       
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
