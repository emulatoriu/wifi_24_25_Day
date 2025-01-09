package repository;

import data.Item;

import java.util.List;

public class Bookstore {
//    private final List<Book> books;
//    private final List<CD> cds;
//    public Bookstore(List<Book> books, List<CD> cds) {
//        this.books = books;
//        this.cds = cds;
//    }
    private final List<Item> items;

    public Bookstore(List<Item> items) {
        this.items = items;
    }
}
