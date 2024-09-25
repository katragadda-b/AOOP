public class BookFactory {
    public Book createBook(String title, String author) {
        return new Book(title, author);
    }
}
