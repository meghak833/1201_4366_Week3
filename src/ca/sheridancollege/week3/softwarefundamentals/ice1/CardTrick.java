/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;



/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * @modifier Mohammed Siddiqui
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Scanner input= new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.random());
            c.setSuit(Card.SUITS[[new Random().nextInt(SUITS.length)]);
            //Cannot run due to unresolved issue with this line of code.
            
        }
                           
        // and search magicHand here
        // test comment
        //Then report the result here
    }
    
}
