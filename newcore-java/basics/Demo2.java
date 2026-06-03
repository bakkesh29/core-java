public class Demo2 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("a : " + a);
        a++;// a=a+1;
        System.out.println(a);
        a--;// a=a+1;
        System.out.println(a);

        // post increment
        int b1 = 5;
        int b2;
        b2 = b1++;
        System.out.println("b1 is. post : " + b1);
        System.out.println("B2 is. postincrement  : " + b2);

        // preincrement
        int b3 = 5;
        int b4;
        b4 = ++b3;
        System.out.println("b3 is. post : " + b3);
        System.out.println("B4 is. postincrement  : " + b4);

        int a5 = 10;
        int a6;

        a6 = ++a5 + a5++ + ++a5 + ++a5 + a5-- + --a5 + --a5 + a5--;
        System.out.println(a5);
        System.out.println(a6);

        // post increment
        int z1 = 1;
        int z2;
        z2 = z1++;// First use the value, then increase it

        // z2 = z1; // z2 gets old value -> 1
        // z1 = z1 + 1; // then z1 becomes 2
        System.out.println("printing z1 " + z1);
        System.out.println("printing z2 " + z2);

    }
}
