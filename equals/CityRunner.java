public class CityRunner {

    public static void main(String[] args) {

        City c1 = new City(1, "Bangalore", "Karnataka", 12000000, 741.0);

        City c2 = new City(2, "Mysore", "Karnataka", 1000000, 156.0);

        City c3 = new City(1, "Bangalore", "Karnataka", 12000000, 741.0);

        boolean nullCheck = c1.equals(null);

        boolean check1 = c1.equals(c2);

        boolean check2 = c1.equals(c3);

        System.out.println("Null Check : " + nullCheck);

        System.out.println("c1 equals c2 : " + check1);

        System.out.println("c1 equals c3 : " + check2);
    }
}