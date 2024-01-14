package main.java.org._811286;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    BookRepository fakeRepo;
    Book fakefindById1;
    String fakeTitle1;
    List<Book> fakeList;
    BookRepository bookRepositoryMock;
    BookService bookService;

    @BeforeEach
    void setUp() {
        fakeRepo = new InMemoryBookRepository();
        fakefindById1 = fakeRepo.findById("1");
        fakeTitle1 = fakefindById1.getTitle();
        fakeList = fakeRepo.findAll();
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);
    }

    @Test
    void findBookByIdTest() {
        when(bookRepositoryMock.findById("1")).thenReturn(fakefindById1);

        String sTitle = bookService.findBookById("1").getTitle();

        assertEquals(fakeTitle1, sTitle);
        verify(bookRepositoryMock, times(1)).findById("1");
    }

    @Test
    void findAllBooksTest() {
        when(bookRepositoryMock.findAll()).thenReturn(fakeList);

        List<Book> listBook = bookService.findAllBooks();

        assertEquals(fakeList, listBook);
        verify(bookRepositoryMock, times(1)).findAll();
    }
}
