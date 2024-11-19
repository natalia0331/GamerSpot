package com.example.gamerspotv2.models;

import java.util.List;

public class User {
    private String id;
    private String nickname;
    private String email;
    private String password; // Must be stored encrypted

    private Preferences preferences;
    private List<String> follows;

    // Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Preferences getPreferences() {
        return preferences;
    }
    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    public List<String> getFollows() {
        return follows;
    }
    public void setFollows(List<String> follows) {
        this.follows = follows;
    }
}

