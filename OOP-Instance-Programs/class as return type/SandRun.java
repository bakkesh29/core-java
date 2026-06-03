class SandRun {

    String location;
    int weight;

    SandRun(String location, int weight) {
        this.location = location;
        this.weight = weight;
    }

    void sandDetails() {
        System.out.println("Location : " + this.location);
        System.out.println("Weight : " + this.weight);
    }

    public Sand details() {
        Sand sand = new Sand("Yellow", "River", 100);
        return sand;
    }
}