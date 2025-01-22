package repository;

import java.util.List;

public class NameRepository {
    private final List<String> names;

    public NameRepository(List<String> names) {
        this.names = names;
    }

    public void add(String name) {
        names.add(name);
    }

    public void print() {
        System.out.println(names);
    }
}
