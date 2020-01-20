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
 * @modifier Genevieve Jose Bautista (991537802)
 */

import java.util.Scanner;
public class CardTrick {
    
    private int cardNum;
    private String cardSuit;
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        for(int i = 0; i<magicHand.length; i++ )
        {
            Card c = new Card();
            c.setValue((int)((Math.random()*13) + 1));
            c.setSuit(Card.SUITS[(int) (Math.random()*3)]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your card number: ");
        int cardNum = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter yout card suit");//promts the user to enter their card suit
        String cardSuit = scan.nextLine();
       
        Card userCard = new Card();
        userCard.setValue(cardNum);
        userCard.setSuit(cardSuit);
        
        switch (cardNum) {
            case 13:
                System.out.println("Your card is King of " + cardSuit); //prints out the user input
                break;
            case 12:
                System.out.println("Your card is Queen of " + cardSuit); //prints out the user input
                break;
            case 11:
                System.out.println("Your card is Jsck of " + cardSuit); //prints out the user input
                break;
            case 1:             
                System.out.println("Your card is Ace of " + cardSuit); //prints out the user input
                break;
            default:
                System.out.println("Your card is " + cardNum + " of " + cardSuit); //prints out the user input
                break;
        }
        
    }
    
   // @Override


   // public String toString(){
    //    return "Your card is " + cardNum + " of " + cardSuit; 
   // }

}
