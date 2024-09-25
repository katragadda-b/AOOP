
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryManagementSystemTest {
    private LibraryManagementSystem libraryManagementSystem;
    private UserFactory userFactory;
    private BookFactory bookFactory;
    private Library library;

    @BeforeEach
    public void setUp() {
        libraryManagementSystem = new LibraryManagementSystem();
        userFactory = new UserFactory();
        bookFactory = new BookFactory();
        library = new Library();
    }

    @Test
    public void testUserRegistration() {
        libraryManagementSystem.register("testUser", "testPassword");
        User registeredUser = libraryManagementSystem.getUser("testUser");
        assertNotNull(registeredUser);
        assertEquals("testUser", registeredUser.getUsername());
        assertTrue(registeredUser.verifyPassword("testPassword"));
    }

    @Test
    public void testAdminLogin() {
        libraryManagementSystem.login("admin", "admin123");
        User loggedInUser = libraryManagementSystem.getLoggedInUser();
        assertTrue(loggedInUser instanceof Admin);
        assertEquals("admin", loggedInUser.getUsername());
    }

    @Test
    public void testAddBookByAdmin() {
        libraryManagementSystem.login("admin", "admin123");
        libraryManagementSystem.addBook("Test Book", "Test Author");
        Book addedBook = library.findBookByTitle("Test Book");
        assertNotNull(addedBook);
        assertEquals("Test Book", addedBook.getTitle());
        assertEquals("Test Author", addedBook.getAuthor());
    }

    @Test
    public void testBorrowBook() {
        libraryManagementSystem.login("admin", "admin123");
        libraryManagementSystem.addBook("Borrowable Book", "Author");
        libraryManagementSystem.logout();

        libraryManagementSystem.register("user1", "password1");
        libraryManagementSystem.login("user1", "password1");
        libraryManagementSystem.borrowBook("Borrowable Book");
        Book borrowedBook = library.findBookByTitle("Borrowable Book");
        assertTrue(borrowedBook.isBorrowed());
    }

    @Test
    public void testReturnBook() {
        libraryManagementSystem.login("admin", "admin123");
        libraryManagementSystem.addBook("Returnable Book", "Author");
        libraryManagementSystem.logout();

        libraryManagementSystem.register("user2", "password2");
        libraryManagementSystem.login("user2", "password2");
        libraryManagementSystem.borrowBook("Returnable Book");
        libraryManagementSystem.returnBook("Returnable Book");
        Book returnedBook = library.findBookByTitle("Returnable Book");
        assertFalse(returnedBook.isBorrowed());
    }

    @Test
    public void testPasswordHint() {
        User user = userFactory.createUser("userWithHint", "short", false);
        PasswordHintDecorator hintDecorator = new PasswordHintDecorator(user);
        assertEquals("Consider a longer password.", hintDecorator.getPasswordHint());

        User userWithStrongPassword = userFactory.createUser("userWithStrongPassword", "strongpassword123", false);
        PasswordHintDecorator strongHintDecorator = new PasswordHintDecorator(userWithStrongPassword);
        assertEquals("Your password is long enough!", strongHintDecorator.getPasswordHint());
    }
}
