package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book[] Books = new Book[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Autor:");
            String title = scanner.nextLine();
            System.out.println("Titel:");
            String author = scanner.nextLine();
            System.out.println("Seiten:");
            int pages = scanner.nextInt();
            Books[i] = new Book(title, author, pages);
            }
        scanner.close();
        for (Book book : Books) {
            if (book.getPages() > 100) {
                System.out.println(book.getTitle());
            }
        }
        }

    }

class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
}
