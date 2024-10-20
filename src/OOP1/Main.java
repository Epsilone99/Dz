package OOP1;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        pintAll();
    }
    public static void pintAll() throws IOException {
        Tree.scenario(Tree.Tre());
        FileAction fa = new FileOperations();
        try {
            fa.fileWriter(Tree.Tre(), "familyTree.dat");
            System.out.println("Family tree saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
