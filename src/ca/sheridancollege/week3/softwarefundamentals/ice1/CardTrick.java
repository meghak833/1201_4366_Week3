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
 */

import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        int num1 = 0;
        Card[] magicHand = new Card[7];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            
            
            c.setValue((int)(Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            System.out.println(c);
        }
        
        
       
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
