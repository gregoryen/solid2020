package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {

    private String title;
    private String author;
    private Map<Integer, String> pages;

    public Book(){
        this.title = "A Book Book";
        this.author = "John Doe";
        this.pages = new HashMap<>();
    }

    public Book(String title, String author, Map<Integer, String> pages) {
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

    public Map<Integer, String> getPages() {
        return pages;
    }

}
