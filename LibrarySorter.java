//This project is very well made, all I would suggest is adding something to reject invalid options at the start of the program and adding some comments.
import java.util.Scanner;
public class LibrarySorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        String fileName = "library.txt";

        System.out.println("1. Start New Library"); //Potentially adding a feature to create different library saves?
        System.out.println("2. Load Previous Library");
        int startChoice = Integer.parseInt(scanner.nextLine());

        if (startChoice == 2) {
            library.loadFromFile(fileName); //^Above feature could possibly be done by having the user input the file name of the library they want to load
        }
            //Perhaps add some code that would reject invalid choices, as entering an invalid choice currently just shows the library menu
        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Books");
            System.out.println("4. Check Out Book");
            System.out.println("5. Return Book");
            System.out.println("6. Save Library"); 
            System.out.println("7. Exit"); //Maybe have an exit without saving feature incase the user makes any mistakes?
            System.out.print("Choose: ");

            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                System.out.print("Title: ");
                String title = scanner.nextLine();

                System.out.print("Author: ");
                String author = scanner.nextLine();

                library.addBook(title, author); //Not a requirement, but in the future maybe check to make sure the user doesn't input unreadable characters

            } else if (choice == 2) {
                library.displayBooks();

            } else if (choice == 3) {
                System.out.print("Search keyword: ");
                String keyword = scanner.nextLine();

                library.searchBooks(keyword);

            } else if (choice == 4) {
                System.out.print("Title to check out: ");
                String title = scanner.nextLine();

                library.checkOutBook(title); //Maybe sort the books by numbers so the user can just input the number instead of the title so its easier to remember?

            } else if (choice == 5) {
                System.out.print("Title to return: ");
                String title = scanner.nextLine();

                library.returnBook(title);

            } else if (choice == 6) {
                library.saveToFile(fileName);

            } else if (choice == 7) {
                library.saveToFile(fileName);
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}