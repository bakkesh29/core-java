class WallPaint extends Paint {

    @Override
    void start() {
        System.out.println("WallPaint start");
    }

    @Override
    void apply() {
        System.out.println("WallPaint apply");
    }

    @Override
    void dry() {
        System.out.println("WallPaint dry");
    }
}