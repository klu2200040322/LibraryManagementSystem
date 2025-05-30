public class Main {
    public static void main(String[] args) {
        // Step 1: Create Library
        Library library = new Library();

        // Step 2: Create Books
        Book b1 = new Book("Java Basics", "Durga", "111");
        Book b2 = new Book("OOP Concepts", "Ravi", "222");
        Book b3 = new Book("Data Structures", "Rama", "333");

        // Step 3: Add Books to Library
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Step 4: Create Member
        Member m1 = new Member("Jyo", 1);

        // Step 5: Add Member to Library
        library.addMember(m1);

        // Step 6: Show available books
        library.showAvailableBooks();

        // Step 7: Borrow and Return Books
        m1.borrowBook(b2);    // Jyo borrows "OOP Concepts"
        m1.returnBook(b2);    // Jyo returns it

        // Step 8: Show available books again
        library.showAvailableBooks();
    }
}
