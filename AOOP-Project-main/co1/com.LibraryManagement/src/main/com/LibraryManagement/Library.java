import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        if (books.containsKey(book.getTitle())) {
            System.out.println("Book already exists.");
        } else {
            books.put(book.getTitle(), book);
            System.out.println("Book added successfully.");
        }
    }

    public Book findBookByTitle(String title) {
        return books.get(title);
    }

    public void borrowBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null && !book.isBorrowed()) {
            book.borrow();
            System.out.println("Book borrowed: " + book.getTitle());
        } else if (book != null) {
            System.out.println("Book is not available.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null && book.isBorrowed()) {
            book.returnBook();
            System.out.println("Book returned: " + book.getTitle());
        } else if (book != null) {
            System.out.println("Book was not borrowed.");
        } else {
            System.out.println("Book not found.");
        }
    }
}
