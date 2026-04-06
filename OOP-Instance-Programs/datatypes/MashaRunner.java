class MashaRunner {

    public static void main(String[] args) {

        Masha m1 = new Masha();
        Masha m2 = new Masha("Pink", "Doll", 400);

        MashaRun runner = new MashaRun();

        runner.run(m1);
        runner.run(m2);
        runner.run(null);
    }
}