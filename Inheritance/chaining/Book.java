class Book extends Document {
    String author;

    Book(int pages, String title, String author) {
        super(pages, title); // constructor chaining
        this.author = author;
        System.out.println("Book constructor");
    }

    void display() {
        System.out.println("Pages: " + pages);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}