package com.example.gamerspotv2.models;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.gamerspotv2.HomeActivity;
import com.example.gamerspotv2.R;

public class Comment {
    private String id;
    private String eventOrReleaseId;
    private String author;
    private String content;
    private String date; // Use LocalDateTime if possible

    // Getters and Setters
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

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }


}
