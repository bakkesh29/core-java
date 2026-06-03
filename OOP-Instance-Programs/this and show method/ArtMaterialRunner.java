class ArtMaterialRunner {
    public static void main(String[] args) {

        ArtMaterial a1 = new ArtMaterial("Paint", "Camel", "Red", 500, 0.5,
                "Drawing", "High", true, 1, "India");

        ArtMaterial a2 = new ArtMaterial("Brush", "Faber", "Brown", 300, 0.2,
                "Painting", "Medium", true, 1, "Germany");

        ArtMaterial a3 = new ArtMaterial("Sketch Pen", "Domes", "Multi", 200, 0.3,
                "Coloring", "Standard", false, 1, "India");

        a1.show();
        a2.show();
        a3.show();
    }
}