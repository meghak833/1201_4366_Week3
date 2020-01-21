/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 *
 * @author Megha Patel
 * altered by Afton Moore #991449334 1/20/2020
 */
public class Card
{

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

   /**
    * @return the suit
    */
   public String getSuit ()
   {
      return suit;
   }

   /**
    * @param suit the suit to set
    */
   public void setSuit (String suit)
   {
      this.suit = suit;
   }

   /**
    * @return the value
    */
   public int getValue ()
   {
      return value;
   }

   /**
    * @param value the value to set
    */
   public void setValue (int value)
   {
      this.value = value;
   }

   public boolean compareCard (Card otherCard)
   {
      if (this.value == otherCard.getValue() && this.suit.equals(otherCard.getSuit())) {
         return true;
      }
      else {
         return false;
      }
   }

   public String toString ()
   {
      String cardValue = "";
      if (this.value == 1) {
         cardValue = "Ace";
      }
      else {
         if (this.value > 1 && this.value < 11) {
            cardValue = "" + value;
         }
         else {
            if (this.value == 11) {
               cardValue = "Jack";
            }
            else {
               if (this.value == 12) {
                  cardValue = "Queen";
               }
               else {
                  if (this.value == 13) {
                     cardValue = "King";
                  }
               }
            }
         }
      }
      return "" + cardValue + " of " + this.suit;
   }



}
