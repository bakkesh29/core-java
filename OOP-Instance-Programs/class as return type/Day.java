class Day {

    String name;
    int hours;
    String type;

    Day(String name, int hours, String type) {
        this.name = name;
        this.hours = hours;
        this.type = type;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Hours : " + this.hours);
        System.out.println("Type : " + this.type);
    }
}