import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void booksStartAtZero() {
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getNumberOfBooks());
    }

    @Test
    public void libraryHasCapacityBeforeAdding() {
        library.addBookIfThereIsCapacity(book);
        library.addBookIfThereIsCapacity(book);
        library.addBookIfThereIsCapacity(book);

        assertEquals(3, library.getNumberOfBooks());
    }

    @Test
    public void checkNotEnoughCapacityToAdd() {
        library.addBookIfThereIsCapacity(book);
        library.addBookIfThereIsCapacity(book);
        library.addBookIfThereIsCapacity(book);
        library.addBookIfThereIsCapacity(book);
        library.addBookIfThereIsCapacity(book);
        library.addBookIfThereIsCapacity(book);
        assertEquals(5, library.getNumberOfBooks());
    }

    @Test
    public void canLendBook(){
        library.addBookIfThereIsCapacity(book);
        library.addBookIfThereIsCapacity(book);
        library.lendBook(book);
        assertEquals(1, library.getNumberOfBooks());
    }


}

