package NotebookDZ.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {
    private String msg;
    private LocalDateTime dateTime;

    public Note(LocalDateTime dateTime, String msg) {
        this.msg = msg;
        this.dateTime = dateTime;
    }

    public String getMsg() {
        return msg;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String formatDateTime(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm ");
        return dateTime.format(dateTimeFormatter);
    }

    @Override
    public String toString() {
        return dateTime +", " + msg;
    }
}
