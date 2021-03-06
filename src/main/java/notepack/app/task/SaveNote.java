package notepack.app.task;

import notepack.app.domain.Note;
import notepack.app.domain.Task;
import notepack.app.domain.exception.MessageError;
import notepack.app.listener.NoteListener;

public class SaveNote implements Task, TypeNote {

    private Note note;

    public SaveNote(Note note) {
        this.note = note;
    }

    @Override
    public void dispatch() throws MessageError {
        note.saveToStorage();
    }

    @Override
    public void notify(NoteListener listener) {
        listener.onSave(note);
    }

}
