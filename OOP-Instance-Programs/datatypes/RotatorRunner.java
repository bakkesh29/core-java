class RotaterRunner {

    public static void main(String[] args) {
       Rotater r1 = new Rotater();
        Rotater r2 = new Rotater("Spinner", "Red", 50);
        RotaterRun runner = new RotaterRun();

        runner.run(r1);
        runner.run(r2);
        runner.run(null);
    }
}