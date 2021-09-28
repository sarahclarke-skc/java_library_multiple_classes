import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before() {
        borrower = new Borrower("John Smith");
        library = new Library();
        book = new Book("LOTR", "Tolkien", "Fantasy");
    }

    @Test
    public void borrowerHasName() {
        assertEquals("John Smith", borrower.getName());
    }

    @Test
    public void collectionIsEmpty() {
        assertEquals(0, borrower.collectionSize());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrow(book);
        borrower.borrow(book);
        assertEquals(2, borrower.collectionSize());
    }

    @Test
    public void borrowerHasLimit() {
        borrower.borrow(book);
        borrower.borrow(book);
        borrower.borrow(book);
        borrower.borrow(book);
        borrower.borrow(book);
        assertEquals(2, borrower.collectionSize());
    }
}
