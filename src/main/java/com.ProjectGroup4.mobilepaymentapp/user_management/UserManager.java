package com.ProjectGroup4.mobilepaymentapp.user_management;

public class UserManager {
    public boolean createUser(String username, String password) {
        // Stub: Create a new user
        System.out.println("Creating user: " + username);
        return true; // Dummy return value
    }

    public UserProfile changePassword(UserProfile profile, String password)
    {
        profile.setPassword(password);
        System.out.println("Password has been successfully changed!");
        return profile;
    }

    public UserProfile changeUsername(UserProfile profile, String username)
    {
        profile.setUsername(username);
        System.out.println("Username has been successfully changed!");
        return profile;
    }
}

