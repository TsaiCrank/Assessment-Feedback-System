import java.io.*;
import java.util.*;

public abstract class User implements Serializable {
    private String userId;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String role;

    public User(String userId, String username, String password, String fullName, String email, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
    }

    // Getters and Setters
    public String getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getRole() { return role; }

    public void setPassword(String password) { this.password = password; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setEmail(String email) { this.email = email; }

    // Abstract method
    public abstract String getAccessLevel();

    @Override
    public String toString() {
        return userId + "," + username + "," + password + "," + fullName + "," + email + "," + role;
    }
}