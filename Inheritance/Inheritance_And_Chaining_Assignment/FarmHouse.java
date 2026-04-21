//classes show this chaining
class FarmHouse {
    String location;
    int size;

    FarmHouse() {
        this("Sakalespura", 10);
        System.out.println("Default FarmHouse Constructor");
    }

    FarmHouse(String location, int size) {
        this.location = location;
        this.size = size;
        System.out.println("Parameterized FarmHouse Constructor");
    }
}