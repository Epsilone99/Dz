package OOP1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface FileAction {
    void fileWriter(List<Person> per, String file) throws IOException;
    Tree fileReader(String fileName)throws IOException, ClassNotFoundException;
}
