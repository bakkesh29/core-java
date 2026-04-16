class Silencer {

    String material;
    double weight;
    String type;
    boolean noiseReduction;
    int durabilityYears;
    double price;
    String brand;
    String vehicleType;
    boolean rustResistant;
    double length;

    Silencer(String material, double weight, String type, boolean noiseReduction,
             int durabilityYears, double price, String brand,
             String vehicleType, boolean rustResistant, double length) {

        this.material = material;
        this.weight = weight;
        this.type = type;
        this.noiseReduction = noiseReduction;
        this.durabilityYears = durabilityYears;
        this.price = price;
        this.brand = brand;
        this.vehicleType = vehicleType;
        this.rustResistant = rustResistant;
        this.length = length;
    }

    void show() {
        System.out.println("-------- Silencer Details --------");
        System.out.println("Material: " + this.material);
        System.out.println("Weight: " + this.weight);
        System.out.println("Type: " + this.type);
        System.out.println("Noise Reduction: " + this.noiseReduction);
        System.out.println("Durability: " + this.durabilityYears);
        System.out.println("Price: " + this.price);
        System.out.println("Brand: " + this.brand);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Rust Resistant: " + this.rustResistant);
        System.out.println("Length: " + this.length);
        System.out.println("--------------------------------");
    }
}