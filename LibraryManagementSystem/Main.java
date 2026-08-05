package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

class Library {

    ArrayList<String> books = new ArrayList<>();

    // Add Book
    void addBook(String book) {
        books.add(book);
        System.out.println(book + " added successfully.");
    }

    // Show Books
    void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\nAvailable Books:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }

    // Issue Book
    void issueBook(String book) {

        if (books.contains(book)) {
            books.remove(book);
            System.out.println(book + " issued successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }

    // Return Book
    void returnBook(String book) {
        books.add(book);
        System.out.println(book + " returned successfully.");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book Name: ");
                    library.addBook(sc.nextLine());
                    break;

                case 2:
                    library.showBooks();
                    break;

                case 3:
                    System.out.print("Enter Book Name: ");
                    library.issueBook(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter Book Name: ");
                    library.returnBook(sc.nextLine());
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