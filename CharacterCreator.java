//Java Character Creator Version 0.1, Created by HunterOma in 2026.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class CharacterCreator {
String selection = null;
String fileName = null;
    public static void main(String[] args) {
        Scanner questionAsker = new Scanner(System.in);
        System.out.println("Java Character Creator 0.1, Created by HunterOma in 2026.");
        System.out.println("Would you like to select a previous character file or create a new one? (s/c)");
        String selection = questionAsker.nextLine(); //Gets user input for creating or selecting a character file.
            if (selection=="c"); {
                System.out.println("Creating a new character file. Please enter the name of your character file.");
                String fileName = questionAsker.nextLine();
                File characterFile = new File(fileName + ".txt"); //Creates a new file with the selected filename by the user.
                try {
                    if (characterFile.createNewFile()) {
                        System.out.println("File created: " + characterFile.getName()); //Tries to make the new file to check if it exists or not.
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                }
            }
            if (selection=="s"); { //Selection algorithm for the user to select a character file to read from.
                System.out.println("Please enter the name of the character file."); //Gets user input for the file name of the character file they wish to select.
                String fileName = questionAsker.nextLine();
                File selectedFile = new File(fileName + ".txt"); //Selects the file for testing
                try (Scanner fileReader = new Scanner(selectedFile)) {
                    System.out.println("Testing if file exists"); //If file is found, tests if it truly exists
                        while (fileReader.hasNextLine()) {
                            String characterInfo = fileReader.nextLine(); //If it exists, prints out the contents of the file for the character information.
                            System.out.println(characterInfo);
                        }
                        //Eventually make a system to check for a signature to make sure it's a character file made through the program
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred. Please check the file name."); //Error message if file does not exist.
                }
                System.out.println("This system is unfinished, future program code will establish the editing and creation of characters through different inputs.");
                //Future system to add different character questions from a seperate operation text file?
            }
    }
}
