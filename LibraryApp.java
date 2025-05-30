import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n----- Library Menu -----");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show Available Books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            if (choice == 1) {
                // Add Book
                System.out.print("Enter Book Title: ");
                String title = scanner.nextLine();

                System.out.print("Enter Author: ");
                String author = scanner.nextLine();

                System.out.print("Enter ISBN: ");
                String isbn = scanner.nextLine();

                Book book = new Book(title, author, isbn);
                library.addBook(book);

            } else if (choice == 2) {
                // Add Member
                System.out.print("Enter Member Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Member ID (number): ");
                int id = scanner.nextInt();
                scanner.nextLine();  // consume newline

                Member member = new Member(name, id);
                library.addMember(member);

            } else if (choice == 3) {
                // Borrow Book
                System.out.print("Enter Member ID: ");
                int memId = scanner.nextInt();
                scanner.nextLine();

                Member member = findMemberById(library, memId);
                if (member == null) {
                    System.out.println("Member not found!");
                    continue;
                }

                System.out.print("Enter Book ISBN to borrow: ");
                String isbn = scanner.nextLine();

                Book book = findBookByIsbn(library, isbn);
                if (book == null) {
                    System.out.println("Book not found!");
                    continue;
                }

                member.borrowBook(book);

            } else if (choice == 4) {
                // Return Book
                System.out.print("Enter Member ID: ");
                int memId = scanner.nextInt();
                scanner.nextLine();

                Member member = findMemberById(library, memId);
                if (member == null) {
                    System.out.println("Member not found!");
                    continue;
                }

                System.out.print("Enter Book ISBN to return: ");
                String isbn = scanner.nextLine();

                Book book = findBookByIsbn(library, isbn);
                if (book == null) {
                    System.out.println("Book not found!");
                    continue;
                }

                member.returnBook(book);

            } else if (choice == 5) {
                // Show available books
                library.showAvailableBooks();

            } else if (choice == 6) {
                // Exit
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid option! Try again.");
            }
        }

        scanner.close();
    }

    // Helper to find member by ID
    public static Member findMemberById(Library library, int id) {
        for (Member m : library.members) {
            if (m.memberId == id) return m;
        }
        return null;
    }

    // Helper to find book by ISBN
    public static Book findBookByIsbn(Library library, String isbn) {
        for (Book b : library.books) {
            if (b.isbn.equals(isbn)) return b;
        }
        return null;
    }
}

