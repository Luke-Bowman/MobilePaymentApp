package src.authentication;

public class AuthLogin {
    private AuthService authService;

    public AuthLogin(AuthService authService) {
        this.authService = authService;
    }

    public boolean loginUser(String username, String password) {
        // Stub: Handle user login
        System.out.println("Logging in user: " + username);
        return authService.validateCredentials(username, password);
    }
}

