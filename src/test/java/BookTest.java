import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Carrie", "Stephen King", "Thriller");
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Stephen King", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Thriller", book.getGenre());
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Carrie", book.getTitle());
    }

}
