package com.example.gamerspotv2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
   TextView text_title, text_developer;
   ImageView img_eventrelease;
   CardView cardView;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        text_title = itemView.findViewById(R.id.text_title);
        text_developer = itemView.findViewById(R.id.text_developer);
        img_eventrelease = itemView.findViewById(R.id.img_eventrelease);
        cardView = itemView.findViewById(R.id.main_container);

    }
}
