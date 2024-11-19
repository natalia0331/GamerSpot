package com.example.gamerspotv2.loginModel;


public class UserResponse {
    private String id;
    private String nickname;
    private String email;
    private String password;
    // Otros campos que puedas necesitar

    // Getters y setters (opcional)

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

