package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test void testGetBooks() {
        //Given
        Book book1 = new Book("Dark Tower: The Gunslinger", "Stephen King",
                LocalDate.of(1982,6,10));
        Book book2 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien",
                LocalDate.of(1954,7,29));
        Book book3 = new Book("Silence of the Lambs", "Richard Harris",
                LocalDate.of(1988,5,19));
        Book book4 = new Book("Death Lover", "Boris Akunin",
                LocalDate.of(2001,8,31));
        Library library = new Library("Fantasy&Crime");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cool Books");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Fantasy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book3);
        library.getBooks().remove(book4);

        //Then
        System.out.println(library.getName());
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getName());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getName());
        System.out.println(deepClonedLibrary.getBooks());
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
