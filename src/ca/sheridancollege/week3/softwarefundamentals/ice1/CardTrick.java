/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel
 * @modifier Zehao Chen
 * ID: 991583852
 */
import java.util.Scanner;

public class CardTrick {

	public static void main(String[] args) {
		Card[] magicHand = new Card[7];

		for (int i = 0; i < magicHand.length; i++) {
			Card c = new Card();
			c.setValue((int) (0 + Math.random() * 12));
			c.setSuit(Card.SUITS[(int) (0 + Math.random() * 3)]);
			System.out.println(c.toString());
			magicHand[i] = c;
			//c.setValue(insert call to random number generator here)
			//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
		}

		//insert code to ask the user for Card value and suit, create their card
		// and search magicHand here
		//Then report the result here
		Scanner sc = new Scanner(System.in);
		Card userCard = new Card();
		System.out.print("Enter card's value: ");
		userCard.setValue(sc.nextInt());
		System.out.print("Enter card's suit: ");
		userCard.setSuit(sc.next());
		sc.close();

		for (int j = 0; j < magicHand.length; j++) {
			if (userCard.toString().equals(magicHand[j].toString())) {
				System.out.println("Your card is found!");
			} else {
				System.out.println("Your card is not found!");
			}
		}
	}
}
