package com.mmz.async;

import android.os.AsyncTask;

import com.mmz.models.Note;
import com.mmz.persistence.NoteDao;

public class DeleteAsyncTask extends AsyncTask<Note, Void, Void> {
    private NoteDao mNoteDao;

    public DeleteAsyncTask(NoteDao dao){
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.delete(notes);
        return null;
    }
}
