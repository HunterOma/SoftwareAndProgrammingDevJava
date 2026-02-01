//Created by HunterOma
//File Reading Program

//Imports required dependencies
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class fileReader {
    public static void main(String[] args) {
        File toRead = new File("student.txt");
            //Try/Catch system for required file exception.
            try(Scanner readingSystem = new Scanner(toRead)) {
                //Scans and prints out each line of the file.
                while (readingSystem.hasNextLine()) {
                    String contents = readingSystem.nextLine();
                    System.out.println(contents);    
                }
            }
            //Catches errors with the file.
            catch (FileNotFoundException e) {
                System.out.println("Unable to locate your file.");
            }
        }
    }