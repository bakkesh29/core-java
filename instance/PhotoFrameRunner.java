class PhotoFrameRunner {
    public static void main(String[] args) {

        PhotoFrame wood = new PhotoFrame();
        PhotoFrame metal = new PhotoFrame();
        PhotoFrame plastic = new PhotoFrame();
        PhotoFrame glass = new PhotoFrame();
        PhotoFrame designer = new PhotoFrame();

        System.out.println("\n--- Default Values ---\n");

        System.out
                .println(wood.material + " " + wood.size + " " + wood.price + " " + wood.color + " " + wood.wallMount);
        System.out.println(
                metal.material + " " + metal.size + " " + metal.price + " " + metal.color + " " + metal.wallMount);
        System.out.println(plastic.material + " " + plastic.size + " " + plastic.price + " " + plastic.color + " "
                + plastic.wallMount);
        System.out.println(
                glass.material + " " + glass.size + " " + glass.price + " " + glass.color + " " + glass.wallMount);
        System.out.println(designer.material + " " + designer.size + " " + designer.price + " " + designer.color + " "
                + designer.wallMount);

        // Assign values
        wood.material = "Wood";
        wood.size = "10x12";
        wood.price = 500;
        wood.color = "Brown";
        wood.wallMount = true;

        metal.material = "Metal";
        metal.size = "8x10";
        metal.price = 700;
        metal.color = "Silver";
        metal.wallMount = true;

        plastic.material = "Plastic";
        plastic.size = "6x8";
        plastic.price = 200;
        plastic.color = "Black";
        plastic.wallMount = false;

        glass.material = "Glass";
        glass.size = "12x16";
        glass.price = 900;
        glass.color = "Transparent";
        glass.wallMount = true;
        
        designer.material = "Designer";
        designer.size = "15x20";
        designer.price = 1500;
        designer.color = "Golden";
        designer.wallMount = true;

        System.out.println("\n--- Updated Values ---\n");

        System.out
                .println(wood.material + " " + wood.size + " " + wood.price + " " + wood.color + " " + wood.wallMount);
        System.out.println(
                metal.material + " " + metal.size + " " + metal.price + " " + metal.color + " " + metal.wallMount);
        System.out.println(plastic.material + " " + plastic.size + " " + plastic.price + " " + plastic.color + " "
                + plastic.wallMount);
        System.out.println(
                glass.material + " " + glass.size + " " + glass.price + " " + glass.color + " " + glass.wallMount);
        System.out.println(designer.material + " " + designer.size + " " + designer.price + " " + designer.color + " "
                + designer.wallMount);
    }
}