package logic;

import data.Item;

import java.util.List;

public class BookstoreService {
    //    public Book getMostSoldBook(List<Book> books) {
//        if(books.size() == 0) return null;
//        Book maxSoldBook = books.get(0);
//        for(Book b : books) {
//            if(b.soldCounter() > maxSoldBook.soldCounter()) {
//                maxSoldBook = b;
//            }
//        }
//        return maxSoldBook;
//    }
//
//    public CD getMostSoldCD(List<CD> cds) {
//        if(cds.size() == 0) return null;
//        CD maxSoldCD = cds.get(0);
//        for(CD cd : cds) {
//            if(cd.soldCounter() > maxSoldCD.soldCounter()) {
//                maxSoldCD = cd;
//            }
//        }
//        return maxSoldCD;
//    }
//    public Object getMostSoldItem(List<Book> books, List<CD> cds) {
//        Book mostSoldBook = getMostSoldBook(books);
//        CD mostSoldCD = getMostSoldCD(cds);
//        return mostSoldBook.soldCounter() > mostSoldCD.soldCounter() ?
//                mostSoldBook : mostSoldCD;
//    }
    public Item mostSoldItem(List<Item> items) {
        if (items.size() == 0) return null;
        Item mostSoldItem = items.get(0);
        for (Item item : items) {
            if (item.soldCounter() > mostSoldItem.soldCounter()) {
                mostSoldItem = item;
            }
        }
        return mostSoldItem;
    }
}
