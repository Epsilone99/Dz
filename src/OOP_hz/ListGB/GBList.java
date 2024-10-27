package OOP_hz.ListGB;

public interface GBList <T> extends Iterable<T>{
    void add(T elem);
    void remove(int index);
    T getElem(int index);
    int size();
}
