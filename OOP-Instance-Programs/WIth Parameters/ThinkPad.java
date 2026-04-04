class ThinkPad {

    String brand;
    String model;
    double price;
    String processor;

    ThinkPad() {
        System.out.println("Default Constructor");
    }

    ThinkPad(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    ThinkPad(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    ThinkPad(String brand, String model, double price, String processor) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.processor = processor;
    }

    ThinkPad(ThinkPad ref) {
        this.brand = ref.brand;
        this.model = ref.model;
        this.price = ref.price;
        this.processor = ref.processor;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Processor: " + processor);
        System.out.println("------------------");
    }
}