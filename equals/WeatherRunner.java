public class WeatherRunner {

    public static void main(String[] args) {

        Weather w1 = new Weather(30, "Sunny", "Bangalore", 60, 12.5);

        Weather w2 = new Weather(22, "Rainy", "Mysore", 80, 9.0);

        Weather w3 = new Weather(30, "Sunny", "Bangalore", 60, 12.5);

        boolean nullCheck = w1.equals(null);

        boolean check1 = w1.equals(w2);

        boolean check2 = w1.equals(w3);

        System.out.println("Null Check : " + nullCheck);

        System.out.println("w1 equals w2 : " + check1);

        System.out.println("w1 equals w3 : " + check2);

        System.out.println();

        System.out.println("Statement 1 : Comparing w1 with null gives " + nullCheck);

        System.out.println("Statement 2 : w1 and w2 are different objects, so result is " + check1);

        System.out.println("Statement 3 : w1 and w3 have same values, so result is " + check2);
    }
}