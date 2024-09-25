public class PasswordHintDecorator extends UserDecorator {
    public PasswordHintDecorator(User decoratedUser) {
        super(decoratedUser);
    }

    public String getPasswordHint() {
        String password = decoratedUser.getPassword();
        if (password.length() >= 8) {
            return "Your password is long enough!";
        } else {
            return "Consider a longer password.";
        }
    }

}
