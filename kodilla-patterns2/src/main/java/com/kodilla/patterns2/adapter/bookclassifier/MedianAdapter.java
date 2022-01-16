package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> bookMap= new HashMap<>();
        List<Book> bookList = new ArrayList<>(bookSet);
        for(int i = 0; i < bookList.size(); i++) {
            bookMap.put(new BookSignature(bookList.get(i).getSignature()),
                    new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(bookList.get(i).getAuthor(),
                            bookList.get(i).getTitle(), bookList.get(i).getPublicationYear()));
        }
        return medianPublicationYear(bookMap);
    }
}
