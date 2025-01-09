package repository;

import java.util.List;

public class CustomList<T> {
    private final List<T> list;

    public CustomList(List<T> list) {
        this.list = list;
    }

    public void add(T element) {
        list.add(element);
    }

    public void print() {
        for (T t : list) {
            System.out.println(t);
        }
    }
}
