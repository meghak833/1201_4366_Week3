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
 * @modifer Mamoun Diab
 * Student ID: 991512241
 * Date: Jan,20, 2020
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        //Creating the Scanner class
        Scanner scanN = new Scanner(System.in);
        Scanner scanS = new Scanner(System.in);
        Random rand = new Random();
        int randValue = rand.nextInt(7);
        
        
        Card[] magicHand = new Card[7];
      
        System.out.println("Enter the card number");
        int cardNum = scanN.nextInt();
        
        
        System.out.println("Enter card suit");
        String cardSuit = scanS.next();
        
        
        
                
        for (int i=0; i<magicHand.length; i++)
        {
        
         Card c = new Card();
         c.setSuit(Card.SUITS[rand.nextInt(3) + 1]);
         //c.setValue(insert call to random number generator here)
            
         c.setValue(rand.nextInt(12) + 1);
        //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
                  
         if(magicHand.equals(c.getSuit())){
             
             System.out.println("You Win!");
             
         }
         
            //Print object
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
 
               
           
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
