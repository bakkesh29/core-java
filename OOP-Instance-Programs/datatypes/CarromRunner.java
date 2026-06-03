class CarromRunner {
    public static void main(String[] args) {
        Carrom c1 = new Carrom();
        Carrom c2 = new Carrom("Synco", "Brown", 2500);

        CarromRun runner = new CarromRun();

        runner.run(c1);
        runner.run(c2);
        runner.run(null);
    }
}