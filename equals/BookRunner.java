public class BookRunner {

    public static void main(String[] args) {

        Book b1 = new Book(101,
                "Java Programming",
                "James",
                450,
                799.0);

        Book b2 = new Book(102,
                "Python Basics",
                "Ravi",
                300,
                599.0);

        Book b3 = new Book(101,
                "Java Programming",
                "James",
                450,
                799.0);

        boolean nullCheck = b1.equals(null);

        boolean check1 = b1.equals(b2);

        boolean check2 = b1.equals(b3);

        System.out.println("Null Check : " + nullCheck);

        System.out.println("b1 equals b2 : " + check1);

        System.out.println("b1 equals b3 : " + check2);


        System.out.println("Statement 1 : Comparing b1 with null gives " + nullCheck);

        System.out.println("Statement 2 : b1 and b2 are different objects, so result is " + check1);

        System.out.println("Statement 3 : b1 and b3 have same values, so result is " + check2);
    }
}