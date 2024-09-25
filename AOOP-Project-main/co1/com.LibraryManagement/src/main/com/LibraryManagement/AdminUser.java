public class AdminUser extends User {
    public AdminUser(String username, String password) {
        super(username, password);
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
    }
}
