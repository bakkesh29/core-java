public class Button {
    public static void main(String[] args) {
        String text = "Submit";
        String color = "Blue";
        int width = 100;
        int height = 50;
        boolean isEnabled = true;

        System.out.println("Button Text: " + text);
        System.out.println("Color: " + color);
        System.out.println("Size: " + width + "x" + height);
        System.out.println("Enabled: " + isEnabled);

        text = "Loading...";
        color = "Gray";
        isEnabled = false;

        System.out.println("----updated-----");

        System.out.println("Button Text: " + text);
        System.out.println("Color: " + color);
        System.out.println("Size: " + width + "x" + height);
        System.out.println("Enabled: " + isEnabled);
    }
}