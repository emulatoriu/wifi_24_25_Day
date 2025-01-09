package data;

public record CD(String id, String title, String artist, double price, int soldCounter) implements Item{
}
