import java.util.Scanner;

public class CardGame {
  static Cards card1;
  static Cards card2;
  static Cards card3;
  static Cards playerCard;
  static boolean repeatGame= true; //Establishes starting variables
  public static void main(String[] args) { 
    int x;
    int y;
        Deck deck= new Deck(); //Creates the deck for this file using the one in Deck.java I believe.
        while (repeatGame == true) { // Allows for game repeats
        deck.shuffle(); //Attempts to shuffle the deck so the number is random
        card1=deck.remove(0);
        card2=deck.remove(0);
        card3=deck.remove(0); //allows for retrieval of removed card values and suitesz
        Scanner cardQuestion = new Scanner(System.in); //creates scanner for input
        System.out.println("Would you like to choose card 1 or card 2? Please write your answer in numbers.");
        int cardChoice = cardQuestion.nextInt();
          if (cardChoice == 1) { 
            playerCard = card1;
          }
          else if (cardChoice == 2) {
            playerCard = card2;
          }
          else {
            System.out.println("An error has occured, this is likely because a letter was included, or an incompatable number. Defaulting to card 1");
            playerCard = card1;
          } //Allows user to pick their card
        System.out.println("Your card is " + playerCard.getValue() + " of " + card1.getSuite());
        System.out.println("Opponents card is " + card2.getValue() + " of " + card2.getSuite()); //Prints the value and suite of both you and your opponents cards
        x=playerCard.getValue(); //playerCard is what allows the user to use their picked card without complicated code.
        y=card3.getValue(); //sets the removed cards as x and y values for future reference
         if (x > y) {
          System.out.println("You Win"); //Compares the two values to see which number is larger, and compares them to decide who wins using if/else if/else
        } else if (x < y) {
          System.out.println("Opponent Wins");
        }  else {
          System.out.println("Tie");
    }
        System.out.println ("Would you like to play again? Please write true or false in all lowercase.");
        try {
        boolean playAgain = cardQuestion.nextBoolean(); //Uses previously established scanner to ask the user for game repeats.
          if (playAgain == false) {
            repeatGame = false;
          }
        } catch (Exception e) { //Catches bugs in case the user inputs information unable to be used by the boolean.
          System.out.println("Something went wrong, repeating game by default.");
        }
      cardQuestion.close(); //Closes scanner for game repeats.
   }
   
 }
}
        
      