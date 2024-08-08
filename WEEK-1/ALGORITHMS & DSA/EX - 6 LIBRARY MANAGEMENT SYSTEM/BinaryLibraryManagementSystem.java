import java.util.Collections;
import java.util.Comparator;

public class BinaryLibraryManagementSystem {
    private List<Book> books;

    public BinaryLibraryManagementSystemLibraryManagementSystem() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        // Sort the list every time a new book is added to ensure it's always sorted.
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books.get(mid).getTitle().compareToIgnoreCase(title);
            if (cmp == 0) {
                return books.get(mid);
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
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
        BinaryLibraryManagementSystemLibraryManagementSystem lms = new BinaryLibraryManagementSystemLibraryManagementSystem();

        lms.addBook(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        lms.addBook(new Book(2, "1984", "George Orwell"));
        lms.addBook(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));

        System.out.println("All Books:");
        lms.displayBooks();

        System.out.println("\nSearching for '1984' using Binary Search:");
        Book foundBook = lms.binarySearchByTitle("1984");
        System.out.println(foundBook != null ? foundBook : "Book not found");
    }
}

    