package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void testPublicationYearMedian() {
        //Given
        Book book1 = new Book("Stephen King", "Dark Tower: The Gunslinger", 1982,
                "1982SK");
        Book book2 = new Book("Graham Masterton", "Tengu", 1983, "1988GM");
        Book book3 = new Book("Raymond Chandler", "The Long Good-Bye", 1954, "1954RC");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(publicationYearMedian);
        assertEquals(1982, publicationYearMedian);
    }
}
