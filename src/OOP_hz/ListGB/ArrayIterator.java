package OOP_hz.ListGB;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator {
    private E[] values;
    int index;

    public ArrayIterator(E[] values) {
        this.values = values;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public Object next() {
        return values[index++];
    }
}
