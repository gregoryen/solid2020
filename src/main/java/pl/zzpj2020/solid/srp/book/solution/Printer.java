package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class Printer implements Printable {

    private int currentPage;
    private Book book;

    public Printer(){
        this.currentPage = 0;
        this.book = new Book();
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void turnPage(){
        currentPage++;
    }

    @Override
    public void printAllPages() {
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            System.out.println(page.getKey() + " " + page.getValue());
        }
    }

    @Override
    public void printCurrentPage() {
        System.out.println(book.getPages().get(this.currentPage));
    }
}
