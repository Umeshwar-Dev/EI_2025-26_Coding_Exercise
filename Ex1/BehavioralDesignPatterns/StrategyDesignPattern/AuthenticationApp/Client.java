public class Client {
    public static void main(String[] args) {
        AuthenticationContext context = new AuthenticationContext();

        // Password authentication
        context.setStrategy(new PasswordAuthentication());
        System.out.println("Password Auth success? ");
        context.authenticateUser();
        System.out.println();

        // OAuth authentication
        context.setStrategy(new OAuthAuthentication());
        System.out.println("OAuth Auth success? ");
        context.authenticateUser();
        System.out.println();

        // Biometric authentication
        context.setStrategy(new BiometricAuthentication());
        System.out.println("Biometric Auth success? ");
        context.authenticateUser();
    }
}