package io;

import repository.NameRepository;

public class NamePrinter {
    private final NameRepository nameRepository;

    public NamePrinter(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    public void print() {
        nameRepository.print();
    }
}
