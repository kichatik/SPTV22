/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks.createbooksarray;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class Book {
    private String title;
    private int publishedYear;
    private Author[] authors;

    public Book() {
    }
    
     public Book(String title, int publishedYear, Author[] authors) {
        this.title = title;
        this.publishedYear = publishedYear;
        this.authors = authors;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
    
    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.title);
        hash = 19 * hash + this.publishedYear;
        hash = 19 * hash + Arrays.deepHashCode(this.authors);
        return hash;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title 
                + ", publishedYear=" + publishedYear 
                + ", authors=" + Arrays.toString (authors) 
                + '}';
    }
    
}
