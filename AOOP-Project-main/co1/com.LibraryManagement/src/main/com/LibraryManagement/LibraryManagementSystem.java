import java.util.HashMap;
import java.util.Map;

public class LibraryManagementSystem {
    private Map<String, User> users = new HashMap<>();
    private Library library = new Library();
    private User loggedInUser;

    public void register(String username, String password) {
        if (!users.containsKey(username)) {
            users.put(username, new User(username, password));
            System.out.println("User registered successfully.");
        } else {
            System.out.println("User already exists.");
        }
    }

    public User getUser(String username) {
        return users.get(username);
    }

    public void login(String username, String password) {
        User user = getUser(username);
        if (user != null && user.verifyPassword(password)) {
            loggedInUser = user;
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void logout() {
        loggedInUser = null;
        System.out.println("Logged out.");
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void addBook(String title, String author) {
        if (loggedInUser instanceof Admin) {
            Book book = new Book(title, author);
            library.addBook(book);
        } else {
            System.out.println("Only admins can add books.");
        }
    }

    public void borrowBook(String title) {
        library.borrowBook(title);
    }

    public void returnBook(String title) {
        library.returnBook(title);
    }
}
