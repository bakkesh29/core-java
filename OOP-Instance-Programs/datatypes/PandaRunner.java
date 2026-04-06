class PandaRunner {
        public static void main(String[] args) {

        Panda p1 = new Panda();
        Panda p2 = new Panda("Black & White", "Forest", 100);

        PandaRun runner = new PandaRun();

        runner.run(p1);
        runner.run(p2);
        runner.run(null);
    }
}