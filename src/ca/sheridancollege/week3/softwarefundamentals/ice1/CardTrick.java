/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author ----
 */
public class CardTrick {

    public static void main(String[] args) {
        Random rand = new Random();
        Card[] magicHand = new Card[7];

        //Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            int randValue = rand.nextInt(13) + 1;
            int randSuitValue = rand.nextInt(3) + 1;
            //c.setValue(insert call to random number generator here)
            c.setValue(randValue);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[randSuitValue]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        Card searchCard = new Card();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the card value and suit you want to search "
                + "for in your hand ");
        System.out.print("Enter card value [1-13]: ");
        searchCard.setValue(input.nextInt());

        System.out.print("Enter suit value [Hearts, Diamonds, Spades, "
                + "Clubs]: ");
        searchCard.setSuit(input.next());

        //Search the magic hand to see if it contains the card the user inputted
        boolean foundSearchCard = false;
        System.out.println();

        for (Card card : magicHand) {
            if (card.getValue() == searchCard.getValue()
                    && card.getSuit().equals(searchCard.getSuit())) {
                foundSearchCard = true;
            }
        }

        //Print the result of whether the card the user searched for is found
        if (foundSearchCard) {
            System.out.println("Found card (" + searchCard.getValue() + ", "
                    + searchCard.getSuit() + ")!");
        } else {
            System.out.println("Did not find card (" + searchCard.getValue() 
                    + ", " + searchCard.getSuit() + ")!");
        }

    }
}
