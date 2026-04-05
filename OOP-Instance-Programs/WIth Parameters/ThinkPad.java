class ThinkPad {

    String model;
    String processor;
    double price;
    String color;
    int quantity;

    ThinkPad() {
        System.out.println("Default Constructor");
    }

    ThinkPad(String model, String processor) {
        this.model = model;
        this.processor = processor;
    }

    ThinkPad(String model, String processor, double price) {
        this.model = model;
        this.processor = processor;
        this.price = price;
    }

    ThinkPad(String model, String processor, double price, String color) {
        this.model = model;
        this.processor = processor;
        this.price = price;
        this.color = color;
    }

    ThinkPad(String model, String processor, double price, String color, int quantity) {
        this.model = model;
        this.processor = processor;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------");
    }
}