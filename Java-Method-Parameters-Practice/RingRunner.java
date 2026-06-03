public class RingRunner {

    public static void main(String[] args) {

        // Explicit
        Ring.details(10, 5, 20000, 2, true);

        // Implicit
        int weight = 8;
        int diameter = 4;
        int cost = 15000;
        int noOfStones = 1;
        boolean isGold = true;

        Ring.details(weight, diameter, cost, noOfStones, isGold);

        if (weight >= 5 && diameter >= 3 && cost >= 1000) {
            System.out.println("Valid ring details");
        } 
        else {
            System.out.println("Invalid ring details");
        }

    }

}