public class Book {
    String title;
    String author;
    String isbn;
    boolean isAvailable;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // Method to display book info
    public void displayBook() {
        System.out.println(title + " by " + author + " (ISBN: " + isbn + ")");
    }
}
