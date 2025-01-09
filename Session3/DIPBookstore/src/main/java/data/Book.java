package data;

public record Book(String isbn, String title, String author, double price, int soldCounter) implements Item{
}
