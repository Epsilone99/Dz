package NotebookDZ.view;

import NotebookDZ.model.Note;
import NotebookDZ.model.Notebook;
import NotebookDZ.presenter.NotebookPresenter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ConsoleNotebookView implements NotebookView{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void showNotes(List<Note> notes) {
        if (notes.isEmpty()){
            System.out.println("Записи не найдены.");
        }
        else {
            for (Note note : notes){
                System.out.println(note);
            }
        }
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public LocalDateTime getDateTimeInput() {
        System.out.println("Введите дату и время по образцу (гггг-MM-дд HH:mm) : ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(input, formatter);
    }

    @Override
    public String getMsgInput() {
        System.out.println("Введите событие :");
        return scanner.nextLine();

    }

    @Override
    public String getFileNameInput() {
        System.out.println("Введите название файла :");
        return scanner.nextLine();
    }

    @Override
    public void start() throws IOException {
        Notebook model = new Notebook();
        NotebookView view = new ConsoleNotebookView();
        NotebookPresenter presenter = new NotebookPresenter(model, view);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Добавить запись");
            System.out.println("2. Сортировать данные по дням, введите нужную дату и произвольное время");
            System.out.println("3. Сортировать данные по неделям, введите нужную дату и произвольное время");
            System.out.println("4. Сохранить данные в файл");
            System.out.println("5. Загрузить данные из файла");
            System.out.println("6. Вывести весь список записей");
            System.out.println("7. Выйти из программы");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    presenter.addNote();
                    break;
                case 2:
                    presenter.showNotesForDay();
                    break;
                case 3:
                    presenter.showNotesForWeek();
                    break;
                case 4:
                    presenter.saveNotes();
                    break;
                case 5:
                    presenter.loadNotes();
                    break;
                case 6:
                    presenter.printAllNotes();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Неверный ввод!");
            }
        }

    }
}
