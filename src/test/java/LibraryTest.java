import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library();
        book = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
        borrower = new Borrower("Anthony Trollope", 3);
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
    public void checkLibraryHasCapacityBeforeAdding() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.getNumberOfBooks());
    }

    @Test
    public void checkNotEnoughCapacityToAdd() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.getNumberOfBooks());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.addBook(book);
        library.removeBook();
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void canLendBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.lendBook(borrower);
        library.lendBook(borrower);
        library.lendBook(borrower);
        assertEquals(1, library.getNumberOfBooks());
        assertEquals(3, borrower.collectionSize());
    }
    
    @Test
    public void cannotLendBookOverBorrowerLimit() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.lendBook(borrower);
        library.lendBook(borrower);
        library.lendBook(borrower);
        library.lendBook(borrower);
        assertEquals(3, borrower.collectionSize());

    }

}

