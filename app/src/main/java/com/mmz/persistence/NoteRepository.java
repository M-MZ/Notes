package com.mmz.persistence;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.mmz.async.DeleteAsyncTask;
import com.mmz.async.InsertAsyncTask;
import com.mmz.models.Note;

import java.util.List;

public class NoteRepository {

    private NoteDatabase mNoteDatabase;

    public NoteRepository(Context context){
        mNoteDatabase = NoteDatabase.getInstance(context);
    }

    public void insertNoteTask(Note note){
        new InsertAsyncTask(mNoteDatabase.getNotesDao()).execute(note);
    }

    public void updateNote(Note note){

    }

    public LiveData<List<Note>> retrieveNotesTask(){
        return mNoteDatabase.getNotesDao().getNotes();
    }

    public void deleteNote(Note note){
        new DeleteAsyncTask(mNoteDatabase.getNotesDao()).execute(note);
    }
}
