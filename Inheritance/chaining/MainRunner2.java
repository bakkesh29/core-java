public class MainRunner2 {
    public static void main(String[] args) {

        Book b1 = new Book(200, "Java Programming", "James");
        Book b2 = new Book(150, "Data Structures", "Mark");

        System.out.println("---- Book Details ----");

        b1.display();
        System.out.println();

        b2.display();
    }
}