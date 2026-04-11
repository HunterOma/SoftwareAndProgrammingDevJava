import java.util.Scanner;

public class CardGame {
  static Cards card1;
  static Cards card2;
  static Cards card3;
  static Cards playerCard;
  static boolean repeatGame= true; //Establishes starting variables
  static boolean debugging = true;
  public static void main(String[] args) { 
    int x;
    int y;
        Deck deck= new Deck(); //Creates the deck for this file using the one in Deck.java I believe.
        while (repeatGame == true) { // Allows for game repeats
        deck.shuffle(); //Attempts to shuffle the deck so the number is random
        if (debugging == true) {
          System.out.println("Shuffling Deck."); //Debugging statement to make it known to a debugger that the deck is finished shuffling.
        }
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
          if (debugging == true) {
          System.out.println("Card chosen successfully, starting game."); //Alerts a debugger if a card was chosen successfully, and establishes that the game's code is activating.
        }
        System.out.println("Your card is " + playerCard.getValue() + " of " + playerCard.getSuite());
        System.out.println("Opponents card is " + card2.getValue() + " of " + card2.getSuite()); //Prints the value and suite of both you and your opponents cards
        x=playerCard.getValue(); //playerCard is what allows the user to use their picked card without complicated code.
        y=card3.getValue(); //sets the removed cards as x and y values for future reference
        if (debugging == true) {
          System.out.println("Card comparison starting..."); //Alerts a debugger that the card comparison is starting, differentiated from the previous statement due to the importance of this code.
        }
         if (x > y) {
          System.out.println("You Win"); //Compares the two values to see which number is larger, and compares them to decide who wins using if/else if/else
        } else if (x < y) {
          System.out.println("Opponent Wins");
        }  else {
          System.out.println("Tie");
    }
    if (debugging == true) {
          System.out.println("Card comparison completed successfully."); //Alerts a debugger that the card comparison is completed successfully.
        }
        System.out.println ("Would you like to play again? Please write true or false in all lowercase.");
        try {
        boolean playAgain = cardQuestion.nextBoolean(); //Uses previously established scanner to ask the user for game repeats.
          if (playAgain == false) {
            repeatGame = false;
            if (debugging == true) {
          System.out.println("Game stopped."); //Alerts a debugger that the game has succesfully stopped.
        }
          }
        } catch (Exception e) { //Catches bugs in case the user inputs information unable to be used by the boolean.
          System.out.println("Something went wrong, repeating game by default.");
        }
      cardQuestion.close(); //Closes scanner for game repeats.
   }
   
 }
}
        
      