class ChargerRun {

    int cableLengthInMeters;
    String porttype;

    ChargerRun(int cableLengthInMeters, String porttype) {
        this.cableLengthInMeters = cableLengthInMeters;
        this.porttype = porttype;
    }

    void chargerDetails() {
        System.out.println("Cable length is : " + this.cableLengthInMeters);
        System.out.println("Port type is : " + this.porttype);
    }

    public Charger details() {
        Charger charger = new Charger("C Type", "White", 120);
        return charger;
    }
}