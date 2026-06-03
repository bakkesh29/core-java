class PowderRunner {

    public static void main(String[] args) {

        Powder p1 = new Powder();
        Powder p2 = new Powder("Ponds", "Face Powder", 150);

        PowderRun runner = new PowderRun();

        runner.run(p1);
        runner.run(p2);
        runner.run(null);
    }
}