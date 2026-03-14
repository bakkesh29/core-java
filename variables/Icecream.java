public class Icecream {
    public static void main(String[] args) {
        String flavor = "Vanilla";
        int scoops = 2;
        double price = 5.50;
        boolean hasToppings = false;

        System.out.println("Flavor: " + flavor);
        System.out.println("Scoops: " + scoops);
        System.out.println("Price: $" + price);
        System.out.println("Toppings: " + hasToppings);

        flavor = "Chocolate Fudge";
        scoops = 3;
        price = 8.75;
        hasToppings = true;

        System.out.println("----updated-----");

        System.out.println("Flavor: " + flavor);
        System.out.println("Scoops: " + scoops);
        System.out.println("Price: $" + price);
        System.out.println("Toppings: " + hasToppings);
    }
}