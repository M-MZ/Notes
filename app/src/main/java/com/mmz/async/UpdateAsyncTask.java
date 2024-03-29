package com.mmz.async;

import android.os.AsyncTask;

import com.mmz.models.Note;
import com.mmz.persistence.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {
    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao){
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.update(notes);
        return null;
    }
}
