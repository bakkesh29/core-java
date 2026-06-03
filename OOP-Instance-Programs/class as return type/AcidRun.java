class AcidRun {

    String labName;
    int bottles;

    AcidRun(String labName, int bottles) {
        this.labName = labName;
        this.bottles = bottles;
    }

    void acidDetails() {
        System.out.println("Lab Name : " + this.labName);
        System.out.println("Bottles : " + this.bottles);
    }

    public Acid details() {
        Acid acid = new Acid("HCl", "Strong", 5);
        return acid;
    }
}