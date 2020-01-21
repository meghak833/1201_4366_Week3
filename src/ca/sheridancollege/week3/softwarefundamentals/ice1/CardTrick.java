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
 * @Student #: 991571812
 */
import java.lang.Math;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // Used for user input
        int cardValue = 0; // Card value
        int suitNum = 0; // Suit value
        Card[] magicHand = new Card[7]; // Mystery hand
        Card[] userHand = new Card[1]; // User hand
        boolean ifFound = false; // Used to check if users card is in deck
        
        // Sets the magicHand with random numbers and suits
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            System.out.println(c.toString());
            magicHand[i] = c;
        }
        
       //User creates card here
       Card d = new Card();
       System.out.print("Enter a card value: ");
       d.setValue(sc.nextInt());
       System.out.print("Enter suit value: ");
       d.setSuit(Card.SUITS[sc.nextInt()]);
       userHand[0] = d;
      
       //Results are displayed
       for(int i = 0; i< magicHand.length; i++) {
           if(userHand[0].toString().equals(magicHand[i].toString())){
               System.out.println("Your card was found!");
               ifFound = true;
               break;
           }
       }
       
       if(ifFound == true){
           System.out.println("Card was not in deck");
       }
        
    }
    
}
