/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Book {
    
    private String bookTitle;
    private int numberOfPages;
    private int publicationYear;
    
    public Book (String title) {
        this.bookTitle = title;
    }
    
    public Book (String title, int pages, int year) {
        this.bookTitle = title;
        this.numberOfPages = pages;
        this.publicationYear = year;
    }
    
    public String getTitle () {
        return this.bookTitle;
    }
    
    public int getNumberOfPages () {
        return this.numberOfPages;
    }
    
    public int getPublicationYear() {
        return this.publicationYear;
    }
    
    public String toString(){
        return this.bookTitle + ", " + this.numberOfPages + " pages, " + this.publicationYear;
    }
    
}
