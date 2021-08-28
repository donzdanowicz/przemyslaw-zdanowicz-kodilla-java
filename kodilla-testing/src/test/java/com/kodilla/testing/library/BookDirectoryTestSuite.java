package com.kodilla.testing.library;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {
    private static int testCounter = 0;
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Starting tests");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Processing test #" + testCounter);
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("End of tests");
    }

    @Nested
    @DisplayName("Tests with Conditions")
    class TestConditions {

        @Test
        void testListBooksWithConditionsReturnList() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

            //When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

            //Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBookWithConditionsMoreThan20() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString())).
                    thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).
                    thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).
                    thenReturn(resultListOf40Books);

            //When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

            //Then
            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());


        }

        @Test
        void testListBookWithConditionFragmentShorterThan3() {
            //Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            //When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            //Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }

    @Nested
    @DisplayName("Tests In Hands Of Which Library User")
    class TestsInHandsOf {



        @Test
        void TestListBooksInHandsOf() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser john = new LibraryUser("John", "Wilkes", "78053156488");
            LibraryUser sam = new LibraryUser("Sam", "Cojones", "55062152364");
            LibraryUser ron = new LibraryUser("Ron", "Howard", "45082515423");

            List<Book> resultListOf0Books = new ArrayList<>();
            List<Book> resultListOf5Books = generateListOfNBooks(5);
            List<Book> resultListOf10Books = generateListOfNBooks(10);
            when(libraryDatabaseMock.listBooksInHandsOf(john)).thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksInHandsOf(sam)).thenReturn(resultListOf5Books);
            when(libraryDatabaseMock.listBooksInHandsOf(ron)).thenReturn(resultListOf10Books);

            //When
            List<Book> listOf0Books = bookLibrary.listBooksInHandsOf(john);
            List<Book> listOf5Books = bookLibrary.listBooksInHandsOf(sam);
            List<Book> listOf10Books = bookLibrary.listBooksInHandsOf(ron);

            //Then
            assertEquals(0, listOf0Books.size());
            assertEquals(5, listOf5Books.size());
            assertEquals(10, listOf10Books.size());
        }
    }
}
