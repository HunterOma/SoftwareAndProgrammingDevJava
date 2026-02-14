import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LetterFrequency {
public static void main(String[] args) {
        File csvFile = new File("letter_frequency.csv");
            try (Scanner fileReader = new Scanner(csvFile)) {
                while (fileReader.hasNextLine()) {
                    String fileData = fileReader.nextLine();
                    StringTokenizer stringT = new StringTokenizer(fileData, ",");
                    while (stringT.hasMoreTokens()) {
                        String letter = stringT.nextToken();
                        String frequency = stringT.nextToken();
                        String percentage = stringT.nextToken();
                        System.out.println(letter + frequency + percentage );
                         int frequencyInt = Integer.parseInt(frequency);
                        float percentageFloat = Float.parseFloat(percentage);
                        System.out.println(letter + frequencyInt + percentageFloat);
                        
                        
                    }
                 }
                }
                catch (FileNotFoundException e) {
                    System.out.println("File Not Found");
                }
        
        
                
    }

}
