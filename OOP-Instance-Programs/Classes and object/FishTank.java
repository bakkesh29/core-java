class FishTank {
    String shape;
    int capacity;
    String material;
    String color;
    double weight;
    String brand;
    double price;
    boolean hasFilter;
    String size;
    String waterType;

    // Parameterized Constructor
    FishTank(String shape, int capacity, String material, String color,
             double weight, String brand, double price,
             boolean hasFilter, String size, String waterType) {

        this.shape = shape;
        this.capacity = capacity;
        this.material = material;
        this.color = color;
        this.weight = weight;
        this.brand = brand;
        this.price = price;
        this.hasFilter = hasFilter;
        this.size = size;
        this.waterType = waterType;
    }

    // display method
    void display() {
        System.out.println("Shape: " + shape);
        System.out.println("Capacity: " + capacity);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Has Filter: " + hasFilter);
        System.out.println("Size: " + size);
        System.out.println("Water Type: " + waterType);
        System.out.println("========================");
    }
}