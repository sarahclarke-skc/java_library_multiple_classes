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
        if (this.capacity > this.getNumberOfBooks())
        this.books.add(book);
    }

//    public void addBookIfThereIsCapacity(Book book) {
//        if (this.capacity > this.getNumberOfBooks()) {
//            this.addBook(book);
//        }
//    }

    public Book removeBook() {
        return this.books.remove(0);
    }

    public void lendBook(Borrower borrower) {
        if (borrower.canBorrow()) {
            Book book = this.removeBook();
            borrower.addBookToCollection(book);
        }
    }

//        this.books.remove(0);
//        Book borrowedBook = borrower.canBorrow();
//    }

}
