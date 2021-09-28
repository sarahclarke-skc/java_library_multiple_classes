import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book books;

    @Before
    public void before() {
        library = new Library();
        books = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(1000, library.getCapacity());
    }

    @Test
    public void booksStartAtZero() {
        assertEquals(0, library.getNumberOfBooks());
    }
}
