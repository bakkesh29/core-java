class Label extends Tag {
    String type;

    Label(int id, String name, String type) {
        super(id, name); // constructor chaining
        this.type = type;
        System.out.println("Label constructor");
    }

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}