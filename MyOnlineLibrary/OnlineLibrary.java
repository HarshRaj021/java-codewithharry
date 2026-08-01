package MyOnlineLibrary;

import java.util.Scanner;

class Library {

    String[] books = new String[100];
    int noOfBooks = 0;

    // Add Book
    void addBook(String book) {
        books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been added.");
    }

    // Show Available Books
    void showAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (int i = 0; i < noOfBooks; i++) {
            if (books[i] != null) {
                System.out.println("- " + books[i]);
            }
        }
    }

    // Issue Book
    void issueBook(String book) {
        for (int i = 0; i < noOfBooks; i++) {
            if (books[i] != null && books[i].equalsIgnoreCase(book)) {
                books[i] = null;
                System.out.println(book + " has been issued.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    // Return Book
    void returnBook(String book) {
        books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been returned.");
    }
}

public class OnlineLibrary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        lib.addBook("Java");
        lib.addBook("Python");
        lib.addBook("C++");

        while (true) {

            System.out.println("\n===== ONLINE LIBRARY =====");
            System.out.println("1. Show Books");
            System.out.println("2. Add Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    lib.showAvailableBooks();
                    break;

                case 2:
                    System.out.print("Book Name: ");
                    lib.addBook(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Book Name: ");
                    lib.issueBook(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Book Name: ");
                    lib.returnBook(sc.nextLine());
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}