package OOP1;
import java.io.IOException;
import java.util.List;

public interface FileAction {
    void fileWriter(List<Person> per, String file) throws IOException;
    Tree fileReader(String fileName)throws IOException, ClassNotFoundException;
}
