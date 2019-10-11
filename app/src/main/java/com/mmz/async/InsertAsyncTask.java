package com.mmz.async;

import android.os.AsyncTask;

import com.mmz.models.Note;
import com.mmz.persistence.NoteDao;

public class InsertAsyncTask extends AsyncTask<Note, Void, Void> {
    private NoteDao mNoteDao;

    public InsertAsyncTask(NoteDao dao){
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.insertNotes(notes);
        return null;
    }
}
