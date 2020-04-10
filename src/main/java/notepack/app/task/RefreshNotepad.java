/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepack.app.task;

import notepack.app.domain.Notepad;
import notepack.app.domain.Task;
import notepack.app.listener.NotepadListener;

/**
 *
 * @author lg
 */
public class RefreshNotepad implements Task,TypeNotepad {

    private Notepad notepad;
    
    public RefreshNotepad(Notepad notepad) {
        this.notepad = notepad;
    }
    
    @Override
    public void dispatch() {
        notepad.getStorage().refreshItemsInStorage();
    }

    @Override
    public void notify(NotepadListener listener) {
        listener.onNotesListUpdated(notepad);
    }
    
}