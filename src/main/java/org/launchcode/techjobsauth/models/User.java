package org.launchcode.techjobsauth.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name = "users")
public class User extends AbstractEntity{

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    private String username;

    private String pwHash;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return pwHash;
    }
    public void setPassword(String password) {
        this.pwHash = encoder.encode(password);
    }
    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }
}
