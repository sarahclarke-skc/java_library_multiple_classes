import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before() {
        borrower = new Borrower("John Smith", 2);
        library = new Library();
        book = new Book("LOTR", "Tolkien", "Fantasy");
    }

    @Test
    public void borrowerHasName() {
        assertEquals("John Smith", borrower.getName());
    }

    @Test
    public void borrowerHasLimit() {
        assertEquals(2, borrower.getBorrowerLimit());
    }

    @Test
    public void collectionIsEmpty() {
        assertEquals(0, borrower.collectionSize());
    }

    @Test
    public void canAddBookToCollection() {
        borrower.addBookToCollection(book);
        assertEquals(1, borrower.collectionSize());
    }

    @Test
    public void canBorrowBook() {
        borrower.addBookToCollection(book);
        assertEquals(true, borrower.canBorrow());
    }

    @Test
    public void cannotBorrowBook() {
        borrower.addBookToCollection(book);
        borrower.addBookToCollection(book);
        assertEquals(false, borrower.canBorrow());
    }



//    @Test
//    public void borrowerHasLimit() {
//        borrower.canBorrow(book);
//        borrower.canBorrow(book);
//        borrower.canBorrow(book);
//        borrower.canBorrow(book);
//        borrower.canBorrow(book);
//        assertEquals(2, borrower.collectionSize());
//    }
}
