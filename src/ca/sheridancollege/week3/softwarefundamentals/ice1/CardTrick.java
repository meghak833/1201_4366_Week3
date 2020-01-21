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
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int)(Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            magicHand[i] = c;
            
            //System.out.println(c.tostring());
            
            System.out.println(magicHand[i].tostring());
            
        }
        
        Card lucky = new Card();
        lucky.setValue(8);
        lucky.setSuit("Hearts");
       
       
       System.out.println("my lucky card is: " + lucky.tostring());
        
       
         for (int i=0; i<magicHand.length; i++)
        {
            
            
                
                 
                if((magicHand[i].getSuit() == lucky.getSuit()) && 
                        (magicHand[i].getValue() == lucky.getValue())){
                System.out.println("lucky card has been found");
                break;
            }else{
                    System.out.println("Lucky card not found");
                }
            
        }
        
        /*
        Card aCard = new Card();
        aCard.setSuit("g");
        aCard.setValue(1);
*/
        //System.out.println("aCard" + aCard.tostring());
      /*  
        if((uCard.getValue() ==  aCard.getValue()) && (uCard.getSuit() ==  aCard.getSuit())){
            System.out.println("a and b match");
        }else{
            System.out.println("a and b dismatch");
        }
*/
        
       
       
        
        //lucky card feature 
        
       
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
