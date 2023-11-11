package week06.Lab.LibraryInformationSystem;

import week06.Lab.Birdwatchers.Bird;
import week06.Lab.Birdwatchers.Birdwatcher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("T1", "Simo E.", 2011);
        Book book2 = new Book("T2", "Skender K.", 2012);
        Book book3 = new Book("T3", "Andrew T.", 2000);
        Book book4 = new Book("T4", "Simo E.", 2012);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

//        library.printBooks();

//        ArrayList<Book> filteredByYear = library.searchByYear(2012);
//        for(Book book : filteredByYear) {
//            System.out.println(book);
//        }
//
//        ArrayList<Book> filteredByPublisher = library.searchByPublisher("  SIMO E.   ");
//        for(Book book : filteredByPublisher) {
//            System.out.println(book);
//        }

        Birdwatcher birdwatcher = new Birdwatcher();
    }
}
