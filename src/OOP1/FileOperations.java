package OOP1;

import java.io.*;
import java.util.List;
import java.util.Set;

public class FileOperations implements FileAction{

    @Override
    public void fileWriter(List<Person> per, String file) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)))
        {
            oos.writeObject(per);
        }
    }

    @Override
    public Tree fileReader(String fileName) throws IOException, ClassNotFoundException{
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            return (Tree) ois.readObject();
        }
    }
}
