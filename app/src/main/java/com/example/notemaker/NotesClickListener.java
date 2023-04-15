package com.example.notemaker;

import androidx.cardview.widget.CardView;

import com.example.notemaker.models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
