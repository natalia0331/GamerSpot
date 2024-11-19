package com.example.gamerspotv2.models;

import java.util.List;

public class Developer {
    private String id;
    private String name;
    private String description;
    private List<String> releases;
    private List<String> events;

    // Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getReleases() {
        return releases;
    }
    public void setReleases(List<String> releases) {
        this.releases = releases;
    }

    public List<String> getEvents() {
        return events;
    }
    public void setEvents(List<String> events) {
        this.events = events;
    }
}

