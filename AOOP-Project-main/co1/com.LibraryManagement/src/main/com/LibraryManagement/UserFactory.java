public class UserFactory {
    public User createUser(String username, String password, boolean isAdmin) {
        if (isAdmin) {
            return new AdminUser(username, password);
        } else {
            return new User(username, password);
        }
    }
}
