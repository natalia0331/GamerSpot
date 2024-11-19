package com.example.gamerspotv2.models;

import java.util.List;

import java.util.List;
import java.util.Map;

public class User {
    private String id;
    private String nickname;
    private String email;
    private String password;
    private Preferences preferences;
    private List<String> follows;

    // Clase interna para las preferencias
    public static class Preferences {
        private Notifications notifications;
        private List<String> filters;

        public static class Notifications {
            private boolean events;
            private boolean developers;
            private boolean games;

            // Getters y setters

            public boolean isDevelopers() {
                return developers;
            }

            public void setDevelopers(boolean developers) {
                this.developers = developers;
            }

            public boolean isGames() {
                return games;
            }

            public void setGames(boolean games) {
                this.games = games;
            }

            public boolean isEvents() {
                return events;
            }

            public void setEvents(boolean events) {
                this.events = events;
            }
        }

        // Getters y setters

        public Notifications getNotifications() {
            return notifications;
        }

        public void setNotifications(Notifications notifications) {
            this.notifications = notifications;
        }

        public List<String> getFilters() {
            return filters;
        }

        public void setFilters(List<String> filters) {
            this.filters = filters;
        }
    }

    // Getters y setters

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

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getFollows() {
        return follows;
    }

    public void setFollows(List<String> follows) {
        this.follows = follows;
    }
}


