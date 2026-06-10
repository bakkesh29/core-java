class WallPaint extends Paint {

    WallPaint(String color) {
        super(color); // calling parent constructor
    }

    @Override
    void start() {
        System.out.println("WallPaint start with color: " + color);
    }

    @Override
    void apply() {
        System.out.println("Applying " + color + " wall paint");
    }

    @Override
    void dry() {
        System.out.println(color + " paint drying");
    }
}