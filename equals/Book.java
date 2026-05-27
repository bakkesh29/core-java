public class Book {

    private int bookId;
    private String bookName;
    private String author;
    private int totalPages;
    private double price;

    public Book() {
    }

    public Book(int bookId, String bookName, String author,
                int totalPages, double price) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.totalPages = totalPages;
        this.price = price;
    }

    @Override
    public boolean equals(Object ref) {

        if (ref == null) {
            return false;
        }

        if (ref instanceof Book) {

            if (this.bookId == ((Book) ref).bookId &&
                this.totalPages == ((Book) ref).totalPages &&
                this.price == ((Book) ref).price &&
                this.bookName.equals(((Book) ref).bookName) &&
                this.author.equals(((Book) ref).author)) {

                return true;
            }
        }

        return false;
    }
}