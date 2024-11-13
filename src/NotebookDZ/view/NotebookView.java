package NotebookDZ.view;

import NotebookDZ.model.Note;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public interface NotebookView {
    void showNotes(List<Note> notes);
    void showMessage(String message);
    LocalDateTime getDateTimeInput();
    String getMsgInput();
    String getFileNameInput();
    void start() throws IOException;
}
