import java.io.FileOutputStream;
import java.util.Scanner;

public class scannerwritter {
    public static void main(String[] args) {
        Scanner Inputs = new Scanner(System.in);

        System.out.println("Please enter your name, grade and school.");
        //Try catch block that tries to catch errors in the strings.
        try {
        //Sets the user inputs
        String name = Inputs.nextLine();
        String grade = Inputs.nextLine();
        String school = Inputs.nextLine();
        //Creates Student.txt
        FileOutputStream outputStream = new FileOutputStream("student.txt");
        //Turns the string data into bytes
        byte[] nameBytes = name.getBytes();
        byte[] gradeBytes = grade.getBytes();
        byte[] schoolBytes = school.getBytes();
        //Writes the byte data into the file
        outputStream.write(nameBytes);
        outputStream.write(gradeBytes);
        outputStream.write(schoolBytes);
} 
    //Catches any errors in the code
    catch (Exception e) {
    System.out.println("An error occured.");
        }
    
    }
    }

