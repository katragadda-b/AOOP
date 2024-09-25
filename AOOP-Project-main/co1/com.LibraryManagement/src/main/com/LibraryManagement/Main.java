public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();
        
        libraryManagementSystem.register("admin", "admin123");
        libraryManagementSystem.login("admin", "admin123");

        libraryManagementSystem.addBook("1984", "George Orwell");
        
        libraryManagementSystem.register("user1", "password1");
        libraryManagementSystem.login("user1", "password1");
        libraryManagementSystem.borrowBook("1984");
    }
}
