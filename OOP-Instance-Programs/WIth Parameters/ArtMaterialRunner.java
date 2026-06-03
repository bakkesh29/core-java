class ArtMaterialRunner {
    public static void main(String[] args) {

        ArtMaterial a1 = new ArtMaterial();
        a1.show();

        ArtMaterial a2 = new ArtMaterial("Camlin", "Paint");
        a2.show();

        ArtMaterial a3 = new ArtMaterial("Faber", "Brush", 300);
        a3.show();

        ArtMaterial a4 = new ArtMaterial("Doms", "Sketch", 500, "MultiColor");
        a4.show();


        ArtMaterial a5 = new ArtMaterial("Classmate", "Crayons", 200, "Mixed", 15);
        a5.show();
    }
}