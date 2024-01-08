package managers;

import entity.User;

public class Authentication {

    private static final User DUMMY_USER = new User("anzhelika", "kichatova");

    public boolean login(String username, String password) {
        if (DUMMY_USER.getLogin().equals(username) && DUMMY_USER.getPassword().equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Login failed. Invalid credentials.");
            return false;
        }
    }

    public static void main(String[] args) {
        Authentication authService = new Authentication();

        String inputUsername = "anzhelika";
        String inputPassword = "kichatova";

        authService.login(inputUsername, inputPassword);
    }
}
