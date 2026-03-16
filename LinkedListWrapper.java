// this program is written to help explain a linked list.  this program will create 4 student objects, and add them to the linked list
//By @hunteroma, fork of Kim.gross@malad.us's original code
//This is to help explain a linked list.  this program will create 4 student objects, and add them to the linked list.  
// Your linked list will need more methods than this. You will need to be able to traverse
import java.util.Scanner;

public class LinkedListWrapper {

    public static void main(String[] args) {
        //Data saved for reference
        //System.out.println(
                //"This program uses a student object that is stored in a linked list.  The student object has a name, address and studentID");
        //System.out.println(
                //"This is to help explain a linked list.  this program will create 4 student objects, and add them to the linked list");
        //System.out.println(
                //"Your linked list will need more methods than this. You will need to be able to traverse the linked list using the data in the nodes");
                System.out.println("Administrator panel, settings for all accounts are allowed.");
                Scanner userQuestion = new Scanner(System.in);
                    System.out.println("Please enter the username and password of accounts you wish to edit. Please seperate username and password, and enter at least 5 accounts.");
                    String username1 = userQuestion.nextLine();
                    String password1 = userQuestion.nextLine();
                    String username2 = userQuestion.nextLine();
                    String password2 = userQuestion.nextLine();
                    String username3 = userQuestion.nextLine();
                    String password3 = userQuestion.nextLine();
                    String username4 = userQuestion.nextLine();
                    String password4 = userQuestion.nextLine();
                    String username5 = userQuestion.nextLine();
                    String password5 = userQuestion.nextLine();
                    System.out.println("Thank you for entering the data, listing out usernames and passwords now.");
                userQuestion.close();
        LinkedListTest accountList = new LinkedListTest();

        Accounts account = new Accounts(username1, password1);
        accountList.addNode(account);
        account = new Accounts(username2, password2);
        accountList.addNode(account);
        account = new Accounts(username3, password3);
        accountList.addNode(account);
        account = new Accounts(username4, password4);
        accountList.addNode(account);
        account = new Accounts(username5, password5);
        accountList.addNode(account);
        // gets the student at the head of the list, and then prints out each student
        // until it reaches the tail.
        account = (Accounts) accountList.getHead();// The (StudentObject) is a cast. It tells the compiler that the
                                                        // object returned by getHead() is a StudentObject, and that it
                                                        // should be treated as such. This is necessary because
                                                        // getHead() returns an Object, and we need to tell the compiler
                                                        // that it is actually a StudentObject so that we can access the
                                                        // fields and methods of the StudentObject class.
                                                        // This is needed because my linked list implementation is not
                                                        // type safe, and it returns an Object. In a more complete
                                                        // implementation, you would want to make your linked list type
                                                        // safe, so that it only accepts StudentObjects, and returns
                                                        // StudentObjects. This would eliminate the need for casting,
                                                        // and would make your code safer and easier to read.
                                                        // In the type safe implementation, you would have a
                                                        // LinkedList<StudentObject> class, and the getHead() method
                                                        // would return a StudentObject, so you would not need to cast
                                                        // it.

        System.out.println(account);
        while (accountList.hasNext()) {

            account = (Accounts) accountList.getNext();
            System.out.println(account);
        }
        // gets the student at the tail of the list, and then prints out each student
        // until it reaches the head.
        account = (Accounts) accountList.getTail();
        System.out.println(account);
        while (accountList.hasPrevious()) {

            account = (Accounts) accountList.getPrevious();
            System.out.println(account);

        }
        Scanner userQuestion2 = new Scanner(System.in);
        System.out.println("Would you like to edit account information? Type 'y' to edit.");
        String answer = userQuestion2.nextLine();
        if (userQuestion2.hasNext()) {
        if (answer == "y") {
            
            System.out.println("Type exit whenever to exit the program.");
            Accounts chosenNode = (Accounts) accountList.getHead();
            String answer2 = null;
         while (answer2 != "exit") {
            System.out.println(chosenNode);
                System.out.println("Would you like to change this account? Type 'y' to change, or 'n' to move to next account. Type 'exit' to exit the program.");
                answer2 = userQuestion2.nextLine();
                    if (answer2 == "y") {
                        System.out.println("Type the new username and password for this account.");
                        String newUsername = userQuestion2.nextLine();
                        String newPassword = userQuestion2.nextLine();
                        chosenNode.changeUsername(newUsername);
                        chosenNode.changePassword(newPassword);
                        chosenNode = (Accounts) accountList.getNext();
                    }
                    else if (answer2 == "n") {
                        chosenNode = (Accounts) accountList.getNext();
                    }
                    else if (answer2 == "exit") {
                        System.out.println("Exiting administrator panel.");
                    }
                    else {
                        System.out.println("Invalid input, repeating question.");
                    }
                }
            }
        }
    
        else {
            System.out.println("Exiting administrator panel.");
        }
        userQuestion2.close();
    

    }

}
