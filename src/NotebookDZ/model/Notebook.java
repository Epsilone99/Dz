package NotebookDZ.model;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Notebook {
    private final List<Note> notes = new ArrayList<>();


    public void addNotes(Note note){
        notes.add(note);
    }

    public List<Note> getNotesForDay(LocalDateTime dateTime) {
        return notes.stream()
                .filter(note ->
                        note.getDateTime().toLocalDate().isEqual(dateTime.toLocalDate()))
                .sorted(Comparator.comparing(Note::getDateTime))
                .collect(Collectors.toList());
    }
    public List<Note> getNotesForWeek(LocalDateTime startOfWeek) {
        LocalDateTime endOfWeek = startOfWeek.plusWeeks(1);
        return notes.stream()
                .filter(note ->
                        !note.getDateTime().isBefore(startOfWeek) &&
                                !note.getDateTime().isAfter(endOfWeek))
                .sorted(Comparator.comparing(Note::getDateTime))
                .collect(Collectors.toList());
    }

    public List<Note> getAllNotes() {
        return notes;
    }

    public void saveToFile(String fileNameW) throws IOException {
        try(BufferedWriter write = new BufferedWriter(new FileWriter(fileNameW, true))){
            for (Note note : notes){
                write.write(note.toString());
                write.newLine();
            }
        }
    }

    public void loadFromFile(String fileNameR) throws IOException {
        notes.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileNameR))) {
            String line;
            while ((line = reader.readLine()) != null){
                String[] part = line.split(", ");
                LocalDateTime dateTime = LocalDateTime.parse(part[0]);
                String msg = part[1];
                notes.add(new Note(dateTime, msg));
            }
        } catch (IOException e) {
            throw new RuntimeException("Запись не удалась");
        }
    }
}
