package NotebookDZ.presenter;

import NotebookDZ.model.Note;
import NotebookDZ.model.Notebook;
import NotebookDZ.view.NotebookView;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class NotebookPresenter {
    private Notebook model;
    private NotebookView view;

    public NotebookPresenter(Notebook model, NotebookView view) {
        this.model = model;
        this.view = view;
    }

    public void addNote() {
        LocalDateTime dateTime = view.getDateTimeInput();
        String description = view.getMsgInput();
        model.addNotes(new Note(dateTime, description));
        view.showMessage("Запись добавлена!");
    }
    public void showNotesForDay() {
        LocalDateTime dateTime = view.getDateTimeInput();
        List<Note> notes = model.getNotesForDay(dateTime);
        view.showNotes(notes);
    }
    public void showNotesForWeek() {
        LocalDateTime startOfWeek = view.getDateTimeInput();
        List<Note> notes = model.getNotesForWeek(startOfWeek);
        view.showNotes(notes);
    }
    public void saveNotes() throws IOException {
        String fileName = view.getFileNameInput();
        try {
            model.saveToFile(fileName);
            view.showMessage("Данные сохранены в " + fileName);
        } catch (IOException e) {
            view.showMessage("Не удалось сохранить данные : " + e.getMessage());
        }
    }
    public void loadNotes() {
        String fileName = view.getFileNameInput();
        try {
            model.loadFromFile(fileName);
            view.showMessage("Данные загружены из " + fileName);
        } catch (IOException e) {
            view.showMessage("Не удалось загрузить данные " + e.getMessage());
        }
    }

    public void printAllNotes(){
        List<Note> notes = model.getAllNotes();
        for (Note note : notes)
            System.out.println(note);
    }
}

