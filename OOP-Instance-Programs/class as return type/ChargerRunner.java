class ChargerRunner {

    public static void main(String[] args) {

        ChargerRun chargerRun = new ChargerRun(2, "USB");
        chargerRun.chargerDetails();

        Charger charger = chargerRun.details();
        charger.display();
    }
}