package OOP_hz.students_group;

import OOP_hz.student.Student;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator<T> implements Iterator<T> {

    private int index;
    private List<T> list;

    public StudentGroupIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}

