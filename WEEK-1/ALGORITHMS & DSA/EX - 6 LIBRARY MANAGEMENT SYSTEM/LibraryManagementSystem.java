import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> books;

    public LibraryManagementSystem() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();

        lms.addBook(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        lms.addBook(new Book(2, "1984", "George Orwell"));
        lms.addBook(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));

        System.out.println("All Books:");
        lms.displayBooks();

        System.out.println("\nSearching for '1984':");
        Book foundBook = lms.linearSearchByTitle("1984");
        System.out.println(foundBook != null ? foundBook : "Book not found");
    }
}


    