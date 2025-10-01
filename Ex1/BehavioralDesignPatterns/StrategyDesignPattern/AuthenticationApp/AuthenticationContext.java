class AuthenticationContext {
    private AuthenticationStrategy strategy;

    public void setStrategy(AuthenticationStrategy strategy) {
        this.strategy = strategy;
    }

    public void authenticateUser() {
        if (strategy == null) {
            throw new IllegalStateException("Authentication strategy not set");
        }
        strategy.authenticate();
    }
}