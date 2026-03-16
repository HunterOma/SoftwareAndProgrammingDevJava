//By @hunteroma, fork of  Kim.gross@malad.us 's original code
import java.util.Scanner;

public class Accounts {
    private String username;
    private String password;

    // constructor for the student object class. Takes in a name, address and
    // student ID and sets the fields to those values.
    Accounts(String username, String password) {
        this.username = username;
        this.password = password;
    }
    // toString method for the student object class. This is used to print out the
    // student object in a readable format. You will need to use this method in your
    // linked list implementation to print out the student objects stored in the
    // nodes of the linked list.

    public String toString() {
        return username + "password: " + password;
    }

    // getter and setter methods for the student object class. These are used to set
    // and get the name, address and student ID fields of the student object. You
    // will need to use these methods in your linked list implementation to
    // manipulate the student objects stored in the nodes of the linked list.
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public void changeUsername(String newUsername) {
        username = newUsername;
    }
    // This method is used to change the student ID of the student object. Since
    // student ID's should not be changed, this method will ask the user if they are
    // sure they want to change the student ID before changing it. You will need to
    // use this method in your linked list implementation to manipulate the student
    // objects stored in the nodes of the linked list.
    public void changePassword(String newPassword) {
        System.out.println("Are you sure you want to change your password? (y/n)");
        @SuppressWarnings("resource")
        Scanner inp = new Scanner(System.in);
        String test = inp.nextLine();
        if (test.equals("y") || test.equals("Y")) {// if the user confirms that they want to change the student ID, then
                                                   // change it confirmation can be lower or uppercase y

            password = newPassword;
        }
    }
}
