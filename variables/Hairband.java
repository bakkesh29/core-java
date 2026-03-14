public class Hairband {
    public static void main(String[] args) {
        String color = "Pink";
        String texture = "Velvet";
        double widthCm = 3.0;
        boolean hasPattern = true;

        System.out.println("Color: " + color);
        System.out.println("Texture: " + texture);
        System.out.println("Width: " + widthCm + "cm");
        System.out.println("Patterned: " + hasPattern);

        color = "Black";
        texture = "Satin";
        widthCm = 1.5;
        hasPattern = false;

        System.out.println("----updated-----");

        System.out.println("Color: " + color);
        System.out.println("Texture: " + texture);
        System.out.println("Width: " + widthCm + "cm");
        System.out.println("Patterned: " + hasPattern);
    }
}