public abstract class UserDecorator extends User {
    protected User decoratedUser;

    public UserDecorator(User decoratedUser) {
        super(decoratedUser.getUsername(), decoratedUser.getPassword());
        this.decoratedUser = decoratedUser;
    }

    @Override
    public String getUsername() {
        return decoratedUser.getUsername();
    }

    @Override
    public String getPassword() {
        return decoratedUser.getPassword();
    }

    @Override
    public void setPassword(String password) {
        decoratedUser.setPassword(password);
    }

    @Override
    public boolean verifyPassword(String passwordToVerify) {
        return decoratedUser.verifyPassword(passwordToVerify);
    }
}
