class Tower {

    String location;
    int height;
    String type;

    Tower(String location, int height, String type) {
        this.location = location;
        this.height = height;
        this.type = type;
    }

    void display() {
        System.out.println("Location : " + this.location);
        System.out.println("Height : " + this.height);
        System.out.println("Type : " + this.type);
    }
}