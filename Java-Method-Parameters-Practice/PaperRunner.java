public class PaperRunner {

    public static void main(String[] args) {

        // Explicit
        Paper.details(30, 100, 10, true, 20);

        // Implicit
        int height = 25;
        int weight = 90;
        int cost = 8;
        boolean goodQuality = true;
        int width = 18;

        Paper.details(height, weight, cost, goodQuality, width);

        if (height >= 20 && weight >= 50 && width >= 15) {
            System.out.println("Valid paper details");
        } 
        else {
            System.out.println("Invalid paper details");
        }

    }

}