package logic;

import data.Book;

import java.util.List;

public class BookService {
    public static boolean available(List<Book> books, String title) {
        boolean result = false;
        for (Book book : books) {
            if (book.title() == title) {
                result = book.available();
            }
        }
        return result;
    }
}
