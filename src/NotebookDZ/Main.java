package NotebookDZ;

import NotebookDZ.view.ConsoleNotebookView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConsoleNotebookView consoleNotebookView = new ConsoleNotebookView();
        consoleNotebookView.start();
    }
}
