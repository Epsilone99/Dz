package OOP_hz.students_group.iterators;

import OOP_hz.student.comparators.CompareStudentByAge;
import OOP_hz.student.comparators.CompareStudentByName;
import OOP_hz.student.Student;
import OOP_hz.students_group.StudentGroupIterator;
import OOP_hz.students_group.StudyElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup<T extends StudyElement> implements Iterable<T> {
    private List<T> list;


    public StudentGroup() {
        list = new ArrayList<>();
    }


    public void addStudent(T student){
        list.add(student);
    }


    @Override
    public Iterator<T> iterator() {
        return new StudentGroupIterator<>(list);
//        return list.listIterator()
    }

    public void sortByName(){
        list.sort(new CompareStudentByName<>());
    }

    public void sortByAge(){
        list.sort(new CompareStudentByAge<>());
    }

}
