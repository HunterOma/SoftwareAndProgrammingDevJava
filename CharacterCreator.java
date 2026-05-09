//Java Character Creator Version 0.1, Created by HunterOma in 2026.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class CharacterCreator {
String selection = "c";
String fileName = null;
String validFile = null;
    public static void main(String[] args) {
        Scanner questionAsker = new Scanner(System.in);
        System.out.println("Java Character Creator 0.1, Created by HunterOma in 2026.");
        System.out.println("Would you like to select a previous character file or create a new one? (s/c)");
        String selection = questionAsker.nextLine(); //Gets user input for creating or selecting a character file.
            if ("c".equals(selection)) {
                System.out.println("Creating a new character file. Please enter the name of your character file.");
                String fileName = questionAsker.nextLine();
                File characterFile = new File(fileName + ".txt"); //Creates a new file with the selected filename by the user.
                try {
                    if (characterFile.createNewFile()) {
                        System.out.println("File created: " + characterFile.getName()); //Tries to make the new file to check if it exists or not.
                        FileWriter fileSignature = new FileWriter(characterFile);
                        fileSignature.write("CharCreaSignature");
                        fileSignature.close();
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                }
            } else if("s".equals(selection)) { //Selection algorithm for the user to select a character file to read from. //Else if is a bugfix for the error that caused the if statements to run no matter what the selection was.
                System.out.println("Please enter the name of the character file."); //Gets user input for the file name of the character file they wish to select.
                String fileName = questionAsker.nextLine();
                File selectedFile = new File(fileName + ".txt"); //Selects the file for testing
                try (Scanner fileReader = new Scanner(selectedFile)) {
                    System.out.println("Testing if file is valid."); //If file is found, tests if it truly exists
                        while (fileReader.hasNextLine()) {
                            String data = fileReader.nextLine();
                            if("CharCreaSignature".equals(fileReader.nextLine().trim())) { //Checks for the signature within the character file.
                                System.out.println("File is valid."); 
                                } else {
                                    System.out.println("File is not valid. Please select a valid character file.");
                                }
                                System.out.println(data);
                            }
                        }
                        //Eventually make a system to check for a signature to make sure it's a character file made through the program
                 catch (FileNotFoundException e) {
                    System.out.println("An error occurred. Please check the file name."); //Error message if file does not exist.
                }
                System.out.println("This system is unfinished, future program code will establish the editing and creation of characters through different inputs.");
                //Future system to add different character questions from a seperate operation java function file?
            }
            else {
                System.out.println("Invalid selection. Please select either 's' or 'c'. It is case sensitive."); 
                }
            
    }
}

