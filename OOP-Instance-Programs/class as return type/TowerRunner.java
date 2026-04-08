class TowerRunner {
    public static void main(String[] args) {

        TowerRun towerRun = new TowerRun("Burj Tower", 163);
        towerRun.towerDetails();

        Tower t = towerRun.details();
        t.display();
    }
}