import java.util.ArrayList;

public class Library {

    private Integer capacity;
    private ArrayList<Book> books;

    public Library() {
        this.capacity = 5;
        this.books = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void addBookIfThereIsCapacity(Book book) {
        if (this.capacity > this.getNumberOfBooks()) {
            this.addBook(book);
        }
    }

    public void lendBook(Book book) {
        this.books.remove(0);
    }


}
