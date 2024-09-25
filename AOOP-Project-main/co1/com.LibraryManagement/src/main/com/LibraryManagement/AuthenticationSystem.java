public class AuthenticationSystem {
    private User user;

    public AuthenticationSystem(User user) {
        this.user = user;
    }

    public boolean authenticate(String username, String password) {
        return user.getUsername().equals(username) && user.verifyPassword(password);
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (user.verifyPassword(oldPassword)) {
            user.setPassword(newPassword);
            return true;
        }
        return false;
    }
}
