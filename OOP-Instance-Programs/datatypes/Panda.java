class Panda {

    String color;
    String habitat;
    double weight;

    // No-arg constructor
    Panda() {
        System.out.println("No-arg Panda constructor");
    }

    // Parameterized constructor
    Panda(String color, String habitat, double weight) {
        this.color = color;
        this.habitat = habitat;
        this.weight = weight;
    }

    void show() {
        System.out.println("Color: " + this.color);
        System.out.println("Habitat: " + this.habitat);
        System.out.println("Weight: " + this.weight);
        System.out.println("-------------------");
    }
}