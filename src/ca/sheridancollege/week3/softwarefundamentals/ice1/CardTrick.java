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
 *
 * @author Megha Patel
 * altered by Afton Moore #991449334 1/20/2020
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         magicHand[i] = new Card();
         magicHand[i].setValue(randomNumber(13, 1));
         magicHand[i].setSuit(Card.SUITS[randomNumber(0, 3)]);
      }

      //insert code to ask the user for Card value and suit, create their card
      Scanner input = new Scanner(System.in);
      Card myCard = new Card();
      boolean valid = false;
      do {
         System.out.println(">Please input the card value (1-13) of your card");
         myCard.setValue(input.nextInt());
         if (myCard.getValue() > 0 && myCard.getValue() < 14) {
            valid = true;
         }
         else {
            System.out.println(">ERROR - please input a number between 1 and 13");
         }
      }
      while (!valid);
      valid = false;
      do {
         System.out.println(">Please input the suite (Hearts, Diamonds, Spades, Clubs) of your card");
         myCard.setSuit(input.nextLine());
         myCard.setSuit(input.nextLine());
         if (myCard.getSuit().equals("Hearts") || myCard.getSuit().equals("Diamonds") || myCard.getSuit().equals("Spades") || myCard.getSuit().equals("Clubs")) {
            valid = true;
         }
         else {
            System.out.println(">ERROR - please input Hearts, Diamonds, Spades, or Clubs");
         }
      }
      while (!valid);


      // and search magicHand here
      boolean cardMatch = false;
      int matchNum = 0;
      for (int i = 0; i < magicHand.length; i++) {
         if (myCard.compareCard(magicHand[i])) {
            cardMatch = true;
         }

      }
      //Then report the result here
      if (cardMatch) {
         System.out.println(">There was a match in the magic hand!");

      }
      else {
         System.out.println(">Nope! There were no matches to your card!");
      }
      for (int i = 0; i < magicHand.length; i++) {
         System.out.println(magicHand[i]);
      }

   }

   public static int randomNumber (int max, int min)
   {
      int randomNum = min + (int) (Math.random() * ((max - min) + 1));
      return randomNum;
   }

}
