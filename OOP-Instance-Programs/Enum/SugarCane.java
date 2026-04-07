class SugarCane {

    String variety;
    double height;

    SugarCane() {
        System.out.println("Default Constructor of SugarCane");
    }

    SugarCane(String variety, double height) {
        this.variety = variety;
        this.height = height;
    }

    void display() {
        System.out.println("SugarCane Variety: " + this.variety);
        System.out.println("SugarCane Height: " + this.height);
    }
}