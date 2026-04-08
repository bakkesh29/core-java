class TowerRun {

    String name;
    int floors;

    TowerRun(String name, int floors) {
        this.name = name;
        this.floors = floors;
    }

    void towerDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Floors : " + this.floors);
    }

    public Tower details() {
        Tower tower = new Tower("Dubai", 163, "Commercial");
        return tower;
    }
}