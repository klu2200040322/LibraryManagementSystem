import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();

    // Add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    // Add a new member to the library
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.name);
    }

    // Show all available books
    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable) {
                book.displayBook();
            }
        }
    }
}
