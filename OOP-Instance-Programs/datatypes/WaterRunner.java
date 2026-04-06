class WaterRunner {

    public static void main(String[] args) {

        Water w1 = new Water();
        Water w2 = new Water("Drinking", "River", 2.0);

        WaterRun runner = new WaterRun();

        runner.run(w1);
        runner.run(w2);
        runner.run(null);
    }
}