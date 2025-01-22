package logic;

import repository.NameRepository;

public class NameService {
    private final NameRepository nameRepository;

    public NameService(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    public void add(String name) {
        nameRepository.add(name);
    }
}
