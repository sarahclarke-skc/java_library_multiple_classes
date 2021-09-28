import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int collectionSize() {
        return this.collection.size();
    }

    public boolean borrowerLimit() {
        if (collectionSize() < 2) {
            return true;
        } else {
            return false;
        }
    }

    public void borrow(Book book) {
        if (this.borrowerLimit()) {
            this.collection.add(book);
        }
    }
}
