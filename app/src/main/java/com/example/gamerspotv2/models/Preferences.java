package com.example.gamerspotv2.models;

import java.util.List;

public class Preferences {
    private Notifications notifications;
    private List<String> filters;

    // Getters and Setters
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
