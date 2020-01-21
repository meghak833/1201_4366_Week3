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
 * @author Antesh Kumar Sharma
 */
public class CardTrick {
    
    public static void main(String[] args)
    { Random rnd = new Random();
    Scanner scan = new Scanner(System.in);
     Card[] magicHand = new Card[7];
      System.out.println("Kindly enter the Card Suit -- [Hearts , Diamonds , Spades , Clubs]");
         String cardSuit = scan.nextLine();
        System.out.println("Kindly enter the Card Value ");
        int cardValue = scan.nextInt();
        System.out.println("You Chose");
         if ( cardValue == 0) {
            System.out.println(" Ace of " + cardSuit); }
            else if ( cardValue == 1) {
            System.out.println(" Ace of " + cardSuit); }
            else if ( cardValue == 11) {
            System.out.println(" Jack of " + cardSuit); }
            else if ( cardValue == 12) {
            System.out.println(" Queen of " + cardSuit); }
            else if ( cardValue == 13) {
            System.out.println(" King of " + cardSuit); }
               else if (cardValue > 13){
            System.out.println( " Card Number only between 0 and 13 please !!");
              }
               else {   System.out.println("You Chose : " + "\n" + cardValue + " of " + cardSuit);
                   
               }
           System.out.println("\n" + "7 cards are :" );
        for (int i=0; i<magicHand.length; i++)
        { Card c = new Card();
        int num = rnd.nextInt(14);
          System.out.println("\n");
            c.setValue(num);
            int num2 = rnd.nextInt(4);
            c.setSuit(Card.SUITS[num2]);
            if ( num == 0) {
            System.out.println(" Ace of " + Card.SUITS[num2]); }
            else if ( num == 1) {
            System.out.println(" Ace of " + Card.SUITS[num2]); }
            else if ( num == 11) {
            System.out.println(" Jack of " + Card.SUITS[num2]); }
            else if ( num == 12) {
            System.out.println(" Queen of " + Card.SUITS[num2]); }
            else if ( num == 13) {
            System.out.println(" King of " + Card.SUITS[num2]); }
            else if ( num > 13) {
            System.out.println( " Card Number only between 0 and 13 please !!");
              break;}
            else { System.out.println(num + " of " + Card.SUITS[num2]);
                
            }
            if (cardValue==num && Card.SUITS[num2].equals(cardSuit))
            { System.out.println("Congratulions , You are really Lucky"); }
            else if (cardValue!=num || Card.SUITS[num2].equals(cardSuit))
            { System.out.println("Oooops , Try Again !!!"); }
            
        }
        
    
    }
    
}
