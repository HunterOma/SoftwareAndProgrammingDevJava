//StringBreaker Program; Breaks a string into words, and counts the amount of words in the string.
//Creator: HunterOma
import java.util.Scanner;
public class stringBreaker {
    public static void main(String[] args) {
        String testString = "the quick Brown Fox Jumped over the lazy dog";
        //Sets up punctuation to detect
        String regexSplitter = "[,\\.\\s]";
        //Uses arrays to split the string into multiple strings
        String [] testArray = testString.split(regexSplitter);
             for (String splitTest : testArray) {
            System.out.println(splitTest);
            }
        //Counts number of strings in the array.
        System.out.println("Word Count is: " + testArray.length);
        //Sets up a scanner for user input.
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Type out your own sentence to split.");
        String userInput = inputReader.nextLine();
        //Uses the established regex to split the user's input.
        String [] userArray = userInput.split(regexSplitter);
            for (String userSplit : userArray) {
            System.out.println(userSplit);
            }
        System.out.println("Word Count is: " + userArray.length);
        inputReader.close();
    }
}
