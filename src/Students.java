import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students {
    public final HashMap<String, Integer> addStudents(HashMap<String, Integer> add) {
        Scanner nm = new Scanner(System.in);
        System.out.println("Введите имя : ");
        String name = nm.next();
        System.out.println("Введите оценку : ");
        Integer grade = nm.nextInt();
        add.put(name, grade);
        return add;
    }
    public void removeStudent(HashMap<String, Integer> mapa, String name){
        for (Map.Entry<String, Integer> entry : mapa.entrySet()){
            if (entry.getKey().equals(name))
                System.out.println( "У студента "+ name + " оценка : " + entry.getValue());
            else {
                System.out.println();
            }
        }
    }
    public void getAllStudents(HashMap<String, Integer> mapa){
        System.out.println(mapa);
    }
    public void deleteStudent(HashMap<String, Integer> map, String name){
        map.remove(name);
    }
}
