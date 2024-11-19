package com.example.gamerspotv2.models;

public class Comment {
    private String id;
    private String eventOrReleaseId;
    private String author;
    private String content;
    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventOrReleaseId() {
        return eventOrReleaseId;
    }

    public void setEventOrReleaseId(String eventOrReleaseId) {
        this.eventOrReleaseId = eventOrReleaseId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

