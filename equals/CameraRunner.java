public class CameraRunner {

    public static void main(String[] args) {

        Camera c1 = new Camera(1, "Canon", "EOS 1500D", 24, 45000.0);

        Camera c2 = new Camera(2, "Nikon", "D3500", 20, 40000.0);

        Camera c3 = new Camera(1, "Canon", "EOS 1500D", 24, 45000.0);

        boolean nullCheck = c1.equals(null);

        boolean check1 = c1.equals(c2);

        boolean check2 = c1.equals(c3);

        System.out.println("Null Check : " + nullCheck);

        System.out.println("c1 equals c2 : " + check1);

        System.out.println("c1 equals c3 : " + check2);

        System.out.println("Statement 1 : Comparing c1 with null gives " + nullCheck);

        System.out.println("Statement 2 : c1 and c2 are different objects, so result is " + check1);

        System.out.println("Statement 3 : c1 and c3 have same values, so result is " + check2);
    }
}