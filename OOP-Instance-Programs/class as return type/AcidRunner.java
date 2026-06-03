class AcidRunner {
    public static void main(String[] args) {

        AcidRun acidRun = new AcidRun("Chem Lab", 10);
        acidRun.acidDetails();

        Acid a = acidRun.details();
        a.display();
    }
}