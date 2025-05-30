import java.util.ArrayList;

public class Member {
    String name;
    int memberId;
    ArrayList<Book> borrowedBooks;

    // Constructor
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        borrowedBooks = new ArrayList<>();
    }

    // Method to borrow a book
    public void borrowBook(Book book) {
        if (book.isAvailable) {
            borrowedBooks.add(book);
            book.isAvailable = false;
            System.out.println(name + " borrowed: " + book.title);
        } else {
            System.out.println(book.title + " is not available.");
        }
    }

    // Method to return a book
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.isAvailable = true;
            System.out.println(name + " returned: " + book.title);
        } else {
            System.out.println(name + " didn’t borrow this book.");
        }
    }
}
