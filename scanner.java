import java.util.Scanner;
public class scanner {
public static void main(String[] args) {
Scanner Inputs = new Scanner(System.in);
System.out.println("Enter a word, a number and a float number.");
//Try catch block that tries to catch errors in the string/float/int
try {
    //Sets the user inputs
    String word = Inputs.nextLine();
    int number = Inputs.nextInt();
    float fnumber = Inputs.nextFloat();
    //Prints out the inputs
    System.out.println("Your word was" + word);
    System.out.println("Your number was" + number);
    System.out.println("Your float was" + fnumber);
} 
catch (Exception e) {
    System.out.println("Please input valid information for each input.");
}
}
}
