import java.util.ArrayList;

public class Borrower {

    private Integer borrowerLimit;
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name, Integer borrowerLimit) {
        this.name = name;
        this.collection = new ArrayList<>();
        this.borrowerLimit = borrowerLimit;
    }

    public String getName() {
        return this.name;
    }

    public int getBorrowerLimit() {
        return this.borrowerLimit;
    }

    public int collectionSize() {
        return this.collection.size();
    }

//    public boolean borrowerLimit() {
//        if (collectionSize() < 2) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public void addBookToCollection(Book book) {
        this.collection.add(book);
    }

    public boolean canBorrow() {
        return this.collectionSize() < this.borrowerLimit;
    }

}

