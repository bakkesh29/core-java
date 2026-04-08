class FlowerRunner {
    public static void main(String[] args) {

        FlowerRun flowerRun = new FlowerRun("Green Garden", 50);
        flowerRun.flowerDetails();

        Flower f = flowerRun.details();
        f.display();
    }
}