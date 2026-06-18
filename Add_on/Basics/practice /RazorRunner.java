public class RazorRunner {

    public static void main(String[] args) {

        Razor razor = new Razor(5, "Black", 0.5, false);

        System.out.println("Blade Size: " + razor.sizeOfBlade);
        System.out.println("Color: " + razor.color);
        System.out.println("Thickness: " + razor.thickNess);
        System.out.println("Rustness: " + razor.rustness);

        razor.trim();
    }
}