public class AuthenticationHandler {
    private AuthenticationSystem authSystem;

    public AuthenticationHandler(User user) {
        this.authSystem = new AuthenticationSystem(user);
    }

    public boolean authenticateUser(String username, String password) {
        return authSystem.authenticate(username, password);
    }

    public boolean changeUserPassword(String oldPassword, String newPassword) {
        return authSystem.changePassword(oldPassword, newPassword);
    }

    public String getPasswordHint(UserDecorator userDecorator) {
        if (userDecorator instanceof PasswordHintDecorator) {
            return ((PasswordHintDecorator) userDecorator).getPasswordHint();
        }
        return "No hint available.";
    }
}
