import java.util.ArrayList;

public class Library {

    private Integer capacity;
    private ArrayList<Book> books;

    public Library() {
        this.capacity = 1000;
        this.books = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfBooks() {
        return this.books.size();
    }
}
