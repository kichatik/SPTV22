/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import tasks.createbooksarray.Author;
import tasks.createbooksarray.Book;

/**
 *
 * @author admin
 */
public class CreateBooksArray {

    public void doCreateArray() {
        Book book = new Book();
        Author levTolstoy = new Author ("Tolstoy","Lev");
        Author ivanTurgenev = new Author ("Turgenev","Ivan");
        Author aleksandraMarinina = new Author ("Marinina","Aleksandra");
        Author fedorDostoevskij = new Author ("Dostoevskij","Fedor");
        Author evgenijaPetrova  = new Author ("Petrova", "Evgenija");
        Author iljaIlif  = new Author ("Ilif", "Ilja");
        Author[] authorVoinaIMir = new Author[1];
        authorVoinaIMir[0]=levTolstoy;
        Author[] authorOtsiIDeti = new Author[1];
        authorOtsiIDeti[0]=ivanTurgenev;
        Author[] authorBelieNochi = new Author[1];
        authorBelieNochi[0]=fedorDostoevskij;
        Author[] authorDebutnajaPostanovka = new Author[1];
        authorDebutnajaPostanovka[0]=aleksandraMarinina;
        Author[] authorDvenacatStuljev= new Author[1];
        authorDvenacatStuljev[0]=evgenijaPetrova;
        Author[] authorDvenacatStuljev[1]= new Author[1];
        authorDvenacatStuljev[0]=iljaIlif;
        Book[] books = new Book[5];
        books[0] = new Book("Voina i mir", 2020, authorVoinaIMir);
        books[1] = new Book("Otsi i deti", 2021, authorOtsiIDeti);
        books[3] = new Book("Debutnaja postanovka", 2023, authorDebutnajaPostanovka);
        books[4] = new Book("Belie nochi", 1848, authorBelieNochi);
        books[5] = new Book("12 Stuljev", 2021, );
    }
    
}
