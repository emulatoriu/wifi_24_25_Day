import data.Book;
import java.util.ArrayList;
import java.util.List;

import static logic.BookService.available;

public class Application {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Der Struwwelpeter", "Luke", 10, false));
        books.add(new Book("George Lucas", "Darth Vader", 8, true));
        books.add(new Book("Tatooine", "Yoda", 1, true));

        //System.out.println(books.get(0));
        System.out.println(available(books, "Tatooine"));
    }
}
