package repository;

import java.util.List;

public class NameRepository {
    private final List<String> names;

    public NameRepository(List<String> names) {
        this.names = names;
    }

    public void addName(String name) {
        names.add(name);
    }

    public void removeFirst() {
        names.remove(0);
    }

    public void printNames() {
        System.out.println(names);
    }

    public int size() {
        return names.size();
    }
}
