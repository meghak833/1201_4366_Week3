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
 * @author Megha Patel
 * @modifier Tristan Dangcil Student Number: 991566905
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        Card c = new Card();
        boolean a = false;
        Card[] magicHand = new Card[7];
        
        for (int i=0; i < magicHand.length; i++)
        {
            magicHand[i] = new Card(Card.SUITS[ (int)(Math.random() * 3 + 0) ] , (int) (Math.random() * 13 + 1));
            System.out.println("Suit: " + magicHand[i].getSuit() + " Value: " + magicHand[i].getValue());
        }
        
        System.out.println("Enter a suit: ");
        c.setSuit(input.next());
        System.out.println("Enter a value from 1-13: ");
        c.setValue(input.nextInt());
        
        for(int i = 0; i < magicHand.length; i++){
            if(c.getSuit().equals(magicHand[i].getSuit()) && c.getValue() == magicHand[i].getValue()){
                a = true;
            }
        }
        
        if(a){
            System.out.println("Your card "+ c.getValue() + " of " +  c.getSuit() +" is in the array");
        }else{
            System.out.println("Your card "+ c.getValue() + " of " + c.getSuit() +" is not in the array");
        }
    }
    
}