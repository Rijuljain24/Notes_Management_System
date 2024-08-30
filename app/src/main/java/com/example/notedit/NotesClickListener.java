package com.example.notedit;

import androidx.cardview.widget.CardView;

import com.example.notedit.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
